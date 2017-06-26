package com.george.assignment.classhelper;

import com.george.assignment.model.Place;
import com.george.assignment.model.PlaceDetail;
import com.george.assignment.model.Province;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.*;

public class Data
{
	private static List<Province> getProvinceList()
	{
		List<Province> provinces = new ArrayList<>();
		String[] p = {"Phnum Penh", "Kandal", "Siem Reap", "Prey Veng", "Svay Reang", "Kep", "Kompong Cham"};
		for (int i = 0; i < p.length; i++)
		{
			Province province = new Province(i+1, p[i]);
			provinces.add(province);
		}
		return provinces;
	}

	public static String getJsonProvinces()
	{
		return new Gson().toJson(getProvinceList(), new TypeToken<List<Province>>() {}.getType());
	}

	public static List<Province> getProvinces()
	{
		return new Gson().fromJson(getJsonProvinces(), new TypeToken<List<Province>>() {}.getType());
	}

	private static List<Place> getPlaceList()
	{
		List<Place> places = new ArrayList<>();
		String[] p = {"Place A", "Place B", "Place C", "Place D", "Place E", "Place F", "Place G"};
		String[] image = {"https://cdn.pixabay.com/photo/2015/02/18/11/50/mountain-landscape-640617__340.jpg","https://cdn.pixabay.com/photo/2017/04/07/18/23/landscape-2211587__340.jpg",
		"https://cdn.pixabay.com/photo/2017/03/26/12/13/countryside-2175353__340.jpg","https://cdn.pixabay.com/photo/2016/08/25/11/01/landscape-1619283__340.jpg",
		"https://cdn.pixabay.com/photo/2016/08/06/19/23/bull-1575003__340.jpg","https://cdn.pixabay.com/photo/2016/07/08/12/19/mountain-1504197__340.jpg","https://cdn.pixabay.com/photo/2015/08/25/21/31/sunset-907704__340.jpg"};
		for (int i = 0; i < p.length; i++)
		{
			Place place = new Place(i+1, p[i], image[i], i);
			places.add(place);
		}
		return places;
	}

	public static String  getJsonPlaces()
	{
		return new Gson().toJson(getPlaceList(),new TypeToken<List<Place>>(){}.getType());
	}

	public static List<Place> getPlaces()
	{
		return  new Gson().fromJson(getJsonPlaces(),new TypeToken<List<Place>>(){}.getType());
	}

	private static List<PlaceDetail> getPlaceDetail()
	{
		List<PlaceDetail> placeDetails= new ArrayList<>();
		String[] d = {"Detail A", "Detail B", "Detail C", "Detail D", "Detail E", "Detail F", "Detail G"};
		String[] image = {"https://cdn.pixabay.com/photo/2015/02/18/11/50/mountain-landscape-640617__340.jpg","https://cdn.pixabay.com/photo/2017/04/07/18/23/landscape-2211587__340.jpg",
				"https://cdn.pixabay.com/photo/2017/03/26/12/13/countryside-2175353__340.jpg","https://cdn.pixabay.com/photo/2016/08/25/11/01/landscape-1619283__340.jpg",
				"https://cdn.pixabay.com/photo/2016/08/06/19/23/bull-1575003__340.jpg","https://cdn.pixabay.com/photo/2016/07/08/12/19/mountain-1504197__340.jpg","https://cdn.pixabay.com/photo/2015/08/25/21/31/sunset-907704__340.jpg"};
		for (int i=0;i<d.length;i++)
		{
			PlaceDetail placeDetail= new PlaceDetail(i+1,image[i],d[i],i);
			placeDetails.add(placeDetail);
		}
		return placeDetails;
	}

	public static String getJsonPlaceDetail()
	{
		return new Gson().toJson(getPlaceDetail(),new TypeToken<List<PlaceDetail>>(){}.getType());
	}
	public  static List<PlaceDetail> getPlaceDetails()
	{
		return new Gson().fromJson(getJsonPlaceDetail(),new TypeToken<List<PlaceDetail>>(){}.getType());
	}
}