package com.streamsaw.data.model.media;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Resume implements Parcelable {


    protected Resume(Parcel in) {
        userResumeId = in.readInt();
        tmdb = in.readString();
        if (in.readByte() == 0) {
            resumeWindow = null;
        } else {
            resumeWindow = in.readInt();
        }
        if (in.readByte() == 0) {
            resumePosition = null;
        } else {
            resumePosition = in.readInt();
        }
        if (in.readByte() == 0) {
            movieDuration = null;
        } else {
            movieDuration = in.readInt();
        }
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(userResumeId);
        dest.writeString(tmdb);
        if (resumeWindow == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(resumeWindow);
        }
        if (resumePosition == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(resumePosition);
        }
        if (movieDuration == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(movieDuration);
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Resume> CREATOR = new Creator<Resume>() {
        @Override
        public Resume createFromParcel(Parcel in) {
            return new Resume(in);
        }

        @Override
        public Resume[] newArray(int size) {
            return new Resume[size];
        }
    };

    public void setTmdb(String tmdb) {
        this.tmdb = tmdb;
    }

    public Integer getResumeWindow() {
        return resumeWindow;
    }

    public void setResumeWindow(Integer resumeWindow) {
        this.resumeWindow = resumeWindow;
    }

    public Integer getResumePosition() {
        return resumePosition;
    }

    public void setResumePosition(Integer resumePosition) {
        this.resumePosition = resumePosition;
    }

    public Integer getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(Integer movieDuration) {
        this.movieDuration = movieDuration;
    }


    @SerializedName("user_resume_id")
    @Expose
    private int userResumeId;

    @SerializedName("tmdb")
    @Expose
    private String tmdb;

    public String getTmdb() {
        return tmdb;
    }

    @SerializedName("resumeWindow")
    @Expose
    private Integer resumeWindow;

    public static Creator<Resume> getCREATOR() {
        return CREATOR;
    }

    public int getUserResumeId() {
        return userResumeId;
    }

    public void setUserResumeId(int userResumeId) {
        this.userResumeId = userResumeId;
    }

    @SerializedName("resumePosition")
    @Expose
    private Integer resumePosition;


    @SerializedName("movieDuration")
    @Expose
    private Integer movieDuration;

}
