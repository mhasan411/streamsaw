package com.easyplex.data.model.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.easyplex.data.local.entity.Media;
import java.util.List;

/**
 * @author Yobex.
 */
public class SearchResponse {


    @SerializedName("search")
    @Expose
    private List<Media> search = null;


    public List<Media> getSearch() {
        return search;
    }

    public void setSearch(List<Media> search) {
        this.search = search;
    }


}
