package com.george.assignment.model;

public class Province
{
	private int Id;
	private String Name;

	public Province(int id, String name)
	{
		Id = id;
		Name = name;
	}

	public int getId()
	{
		return Id;
	}

	public void setId(int id)
	{
		Id = id;
	}

	public String getName()
	{
		return Name;
	}

	public void setName(String name)
	{
		Name = name;
	}
}
