package com.george.assignment.model;

import com.george.assignment.classhelper.Data;

import java.util.List;

public class PlaceDetail
{
	private int Id;
	private String Image;
	private String Detail;
	private int PlaceId;

	public PlaceDetail(int id, String image, String detail, int placeId)
	{
		Id = id;
		Image = image;
		Detail = detail;
		PlaceId = placeId;
	}

	public int getId()
	{
		return Id;
	}

	public void setId(int id)
	{
		Id = id;
	}

	public String getImage()
	{
		return Image;
	}

	public void setImage(String image)
	{
		Image = image;
	}

	public String getDetail()
	{
		return Detail;
	}

	public void setDetail(String detail)
	{
		Detail = detail;
	}

	public int getPlaceId()
	{
		return PlaceId;
	}

	public void setPlaceId(int placeId)
	{
		PlaceId = placeId;
	}

	public static List<PlaceDetail> getPlaceDetail(int id)
	{
		return Data.getPlaceDetails();
	}
}
