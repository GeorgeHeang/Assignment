package com.george.assignment.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.george.assignment.MainActivity;
import com.george.assignment.R;
import com.george.assignment.classhelper.Data;
import com.george.assignment.model.Province;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.List;


public class NavigationAdapter extends RecyclerView.Adapter<NavigationAdapter.ViewHolder>
{

	private List<Province> provinces;
	private Context context;

	static class ViewHolder extends RecyclerView.ViewHolder
	{
		private TextView tvMenu;

		TextView getTvMenu()
		{
			return tvMenu;
		}

		ViewHolder(View v)
		{
			super(v);
			tvMenu = (TextView) v.findViewById(R.id.tvProvince);
		}
	}

	public NavigationAdapter(Context context,List<Province> provinces)
	{
		this.provinces = provinces;
		this.context=context;
	}

	@Override
	public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
	{
		View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.navigation_adapter_layout, viewGroup, false);
		return new ViewHolder(v);
	}

	@Override
	public void onBindViewHolder(ViewHolder viewHolder, final int position)
	{
		Province province= provinces.get(position);
		viewHolder.getTvMenu().setText(province.getName());
		viewHolder.getTvMenu().setOnClickListener(v -> menuClick(province));
	}
	private void menuClick(Province province)
	{
		((MainActivity)context).getSupportActionBar().setTitle(province.getName());
		((MainActivity)context).getDrawer().closeDrawer(Gravity.START,true);
		RecyclerView rvPlace = (RecyclerView) ((MainActivity) context).findViewById(R.id.rvPlace);
		rvPlace.setLayoutManager(new LinearLayoutManager(context));
		rvPlace.setAdapter(new PlaceAdapter(context, Data.getPlaces()));
	}

	@Override
	public int getItemCount()
	{
		return provinces.size();
	}

}

