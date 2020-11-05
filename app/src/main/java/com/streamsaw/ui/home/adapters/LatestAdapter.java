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
import com.streamsaw.ui.moviedetails.MovieDetailsActivity;
import com.streamsaw.util.Tools;
import java.util.List;

import static com.streamsaw.util.Constants.ARG_MOVIE;

/**
 * Adapter for Latest Movies.
 *
 * @author Yobex.
 */
public class LatestAdapter extends RecyclerView.Adapter<LatestAdapter.MainViewHolder> {

    private List<Media> castList;

    public void addLatest(List<Media> castList) {
        this.castList = castList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public LatestAdapter.MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemMovieBinding binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new LatestAdapter.MainViewHolder(binding);

    }

    @Override
    public void onBindViewHolder(@NonNull LatestAdapter.MainViewHolder holder, int position) {
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


            binding.movietitle.setText(media.getTitle());

            for (Genre genre : media.getGenres()) {

                binding.mgenres.setText(genre.getName());


            }

            binding.rootLayout.setOnClickListener(view -> {


                Intent intent = new Intent(context, MovieDetailsActivity.class);
                intent.putExtra(ARG_MOVIE, media);
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
