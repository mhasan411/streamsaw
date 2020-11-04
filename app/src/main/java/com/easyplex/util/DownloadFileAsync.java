package com.easyplex.util;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class DownloadFileAsync extends AsyncTask<String, String, String> {

    private static final String TAG ="DOWNLOADFILE";

    private PostDownload callback;
    private File file;
    private String downloadLocation;

    public DownloadFileAsync(String downloadLocation, PostDownload callback){
        this.callback = callback;
        this.downloadLocation = downloadLocation;
    }
    @Override
    protected String doInBackground(String... aurl) {
        int count;

        try {
            URL url = new URL(aurl[0]);
            URLConnection connection = url.openConnection();
            connection.connect();

            int lenghtOfFile = connection.getContentLength();
            Log.d(TAG, "Length of the file: " + lenghtOfFile);


            try (InputStream input = new BufferedInputStream(url.openStream())) {
                file = new File(downloadLocation);
                try (FileOutputStream output = new FileOutputStream(file)) {
                    Log.d(TAG, "file saved at " + file.getAbsolutePath());

                    byte[] data = new byte[1024];
                    long total = 0;
                    while ((count = input.read(data)) != -1) {
                        total += count;
                        publishProgress("" + (int) ((total * 100) / lenghtOfFile));
                        output.write(data, 0, count);
                    }

                    output.flush();

                }
            }
        } catch (Exception ignored) {


            //

        }
        return null;

    }
    protected void onProgressUpdate(String... progress) {


        //


    }

    @Override
    protected void onPostExecute(String unused) {
        if(callback != null) {
            try {
                callback.downloadDone(file);
            } catch (IOException e) {


                Log.d(TAG, "" + e.getStackTrace());

            }
        }
    }

    public interface PostDownload{
        void downloadDone(File fd) throws IOException;
    }
}