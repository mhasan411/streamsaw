package com.easyplex.data.model.episode;

import com.easyplex.data.model.substitles.MediaSubstitle;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


import java.util.List;

public class Episode {


    public Episode(Integer id, Integer tmdbId, String seasonId, String episodeNumber, String name, String stillPath,String voteAverage) {
        this.id = id;
        this.tmdbId = tmdbId;
        this.seasonId = seasonId;
        this.episodeNumber = episodeNumber;
        this.name = name;
        this.stillPath = stillPath;
        this.voteAverage = voteAverage;
    }

    @SerializedName("episodes")
    @Expose
    private List<Episode> episodes = null;


    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("tmdb_id")
    @Expose
    private Integer tmdbId;
    @SerializedName("season_id")
    @Expose
    private String seasonId;
    @SerializedName("episode_number")
    @Expose
    private String episodeNumber;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("overview")
    @Expose
    private String overview;


    @SerializedName("still_path")
    @Expose
    private String stillPath;

    @SerializedName("vote_average")
    @Expose
    private String voteAverage;
    @SerializedName("vote_count")
    @Expose
    private String voteCount;
    @SerializedName("views")
    @Expose
    private String views;
    @SerializedName("air_date")
    @Expose
    private String airDate;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;




    @SerializedName("link")
    @Expose
    private String link;


    @SerializedName("videos")
    @Expose
    private List<EpisodeStream> videos = null;


    @SerializedName("substitles")
    @Expose
    private List<MediaSubstitle> substitles = null;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTmdbId() {
        return tmdbId;
    }

    public void setTmdbId(Integer tmdbId) {
        this.tmdbId = tmdbId;
    }

    public String getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(String seasonId) {
        this.seasonId = seasonId;
    }

    public String getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(String episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getStillPath() {
        return stillPath;
    }

    public void setStillPath(String stillPath) {
        this.stillPath = stillPath;
    }

    public String getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(String voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(String voteCount) {
        this.voteCount = voteCount;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getAirDate() {
        return airDate;
    }

    public void setAirDate(String airDate) {
        this.airDate = airDate;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<EpisodeStream> getVideos() {
        return videos;
    }

    public void setVideos(List<EpisodeStream> videos) {
        this.videos = videos;
    }


    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }


    public List<MediaSubstitle> getSubstitles() {
        return substitles;
    }

    public void setSubstitles(List<MediaSubstitle> substitles) {
        this.substitles = substitles;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }
}
