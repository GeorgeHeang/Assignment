package com.george.assignment.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.george.assignment.MainActivity;
import com.george.assignment.R;
import com.george.assignment.appfragments.PlaceDetailFragment;
import com.george.assignment.model.Place;

import java.util.List;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder>
{
    private List<Place> places;
    private Context context;

    public PlaceAdapter(Context context,List<Place> places)
    {
        this.places = places;
        this.context=context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.place_adapter_layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        Place place=places.get(position);
        holder.getTvPlaceName().setText(place.getTitle());
        Glide.with(context).load(place.getImage()).into(holder.getIvPlace());
        holder.getTvPlaceName().setOnClickListener(v -> placeClicked(place));
        holder.getIvPlace().setOnClickListener(v -> placeClicked(place));
    }

    private void placeClicked(Place place)
    {
        ((MainActivity)context).getSupportFragmentManager().beginTransaction().add(R.id.mainContent,new PlaceDetailFragment(place.getId()),"PlaceDetail").commit();
    }

    @Override
    public int getItemCount()
    {
        return places.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView ivPlace;
        private TextView tvPlaceName;

        public ImageView getIvPlace()
        {
            return ivPlace;
        }

        public TextView getTvPlaceName()
        {
            return tvPlaceName;
        }

        public ViewHolder(View itemView)
        {
            super(itemView);
            ivPlace=(ImageView) itemView.findViewById(R.id.ivPlace);
            tvPlaceName=(TextView)itemView.findViewById(R.id.tvPlaceName);
        }
    }
}
