package com.george.assignment.model;

import java.util.List;

public class Place
{
	private int Id;
	private String Title;
	private String Image;
	private int ProvinceId;
	private List<PlaceDetail> PlaceDetails;

	public Place(int id, String title, String image, int provinceId)
	{
		Id = id;
		Title = title;
		Image = image;
		ProvinceId = provinceId;
	}

	public int getId()
	{
		return Id;
	}

	public void setId(int id)
	{
		Id = id;
	}

	public String getTitle()
	{
		return Title;
	}

	public void setTitle(String title)
	{
		Title = title;
	}

	public String getImage()
	{
		return Image;
	}

	public void setImage(String image)
	{
		Image = image;
	}

	public int getProvinceId()
	{
		return ProvinceId;
	}

	public void setProvinceId(int provinceId)
	{
		ProvinceId = provinceId;
	}

}
