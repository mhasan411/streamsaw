package com.streamsaw.data.model.ads;

/**
 * this is the class contains information attribute to send to ad server for ad-fetching
 */
public class AdRetriever {

    private String videoId;

    private String publisherId;

    private long cubPoint;

    public AdRetriever() {
    }

    public AdRetriever(String videoId, String publisherId, long cubPoint) {
        this.videoId = videoId;
        this.publisherId = publisherId;
        this.cubPoint = cubPoint;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    public long getCubPoint() {
        return cubPoint;
    }

    public void setCubPoint(long cubPoint) {
        this.cubPoint = cubPoint;
    }
}
