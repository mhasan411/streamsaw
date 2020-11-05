package com.streamsaw.ui.home.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.streamsaw.data.local.entity.Media;
import com.streamsaw.data.model.genres.Genre;
import com.streamsaw.databinding.ItemMovieBinding;
import com.streamsaw.ui.seriedetails.SerieDetailsActivity;
import com.streamsaw.util.Constants;
import com.streamsaw.util.Tools;
import java.util.List;


/**
 * Adapter for Popular Series.
 *
 * @author Yobex.
 */
public class PopularSeriesAdapter extends RecyclerView.Adapter<PopularSeriesAdapter.MainViewHolder> {

    private List<Media> castList;


    public void addPopular(List<Media> castList) {
        this.castList = castList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PopularSeriesAdapter.MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemMovieBinding binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new PopularSeriesAdapter.MainViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularSeriesAdapter.MainViewHolder holder, int position) {
        holder.onBind(position);
    }

    @Override
    public int getItemCount() {
        if (castList != null) {
            return castList.size();
        } else {
            return 0;
        }
    }

    class MainViewHolder extends RecyclerView.ViewHolder {

        private final ItemMovieBinding binding;

        MainViewHolder(@NonNull ItemMovieBinding binding)
        {
            super(binding.getRoot());

            this.binding = binding;
        }



        void onBind(final int position) {


            final Media media = castList.get(position);


            Context context = binding.itemMovieImage.getContext();

            binding.movietitle.setText(media.getName());


            for (Genre genre : media.getGenres()) {

                binding.mgenres.setText(genre.getName());


            }

            binding.rootLayout.setOnClickListener(view -> {


                Intent intent = new Intent(context, SerieDetailsActivity.class);
                intent.putExtra(Constants.ARG_MOVIE, media);
                context.startActivity(intent);


            });


            if (media.getPremuim() == 1) {

                binding.moviePremuim.setVisibility(View.VISIBLE);


            }else {

                binding.moviePremuim.setVisibility(View.GONE);
            }


            Tools.onLoadMediaCoverAdapters(binding.itemMovieImage, media.getPosterPath());

        }
    }
}
