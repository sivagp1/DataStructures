package com.java.lineardatastructutes;

import java.lang.reflect.Array;

public class GenericArray {
	
	public <T> void printAll(T[] data)	{
		for(T num : data)	{
			System.out.print(" " + num);
		}
	}
	
	public <T> T[] addElement(T[] data, int position, T element )	{
		
		T[] response = (T[]) Array.newInstance(data.getClass().getComponentType(), data.length + 1);
		for(int i = 0; i < position; i++)	{
			response[i] = data[i];
		}
		response[position] = element;
		for(int i = position+1; i < response.length; i++)	{
			response[i] = data[i-1];
		}
		return response;
	}
	
	public <T> int searchElement(T[] data, T element)	{
		
		int pos = -1;
		for(int i = 0; i < data.length; i++)	{
			if(data[i] == element)
				return i;
		}
		return pos;
		
	}
	
	public <T> T[] deleteElement(T[] data, T element )	{
		int position = searchElement(data, element);
		if( position >= 0)	{
			T[] response = (T[]) Array.newInstance(data.getClass().getComponentType(), data.length - 1);
			for(int i = 0; i < position; i++)	{
				response[i] = data[i];
			}
			for(int i = position; i < response.length; i++)	{
				response[i] = data[i+1];
			}
			return response;
		}
		
		return data;
	}

}

