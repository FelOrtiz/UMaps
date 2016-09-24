package com.u.maps;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AdaptadorLista extends  BaseExpandableListAdapter
{
	private Context context;
	private HashMap<String, List<String>> info;
	private List<String> grupos;
	
	public AdaptadorLista(Context context, HashMap<String, List<String>> info, List<String> grupos)
	{
		this.context = context;
		this.info = info;
		this.grupos = grupos;
	}
	
	@Override
	public Object getChild(int groupPosition, int childPosition) 
	{
		return info.get(grupos.get(groupPosition)).get(childPosition);
	}	
	
	@Override
	public long getChildId(int groupPosition, int childPosition) 
	{
		return childPosition;
	}	
	
	@Override
	public View getChildView(int groupPosition, int childPosition,
			boolean isLastChild, View convertView, ViewGroup parent) 
	{
		String childTitle = (String) getChild(groupPosition, childPosition);
	
		if(convertView == null)
		{
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.layout_hijo, parent, false);
		}
	
		TextView childTextView = (TextView) convertView.findViewById(R.id.field_hijo);
		childTextView.setText(childTitle);
		
		return convertView;
	}	
	
	@Override
	public int getChildrenCount(int groupPosition) 
	{
		return info.get(grupos.get(groupPosition)).size();
	}
	
	@Override
	public Object getGroup(int groupPosition) 
	{
		return grupos.get(groupPosition);
	}	
	
	@Override
	public int getGroupCount() 
	{
		return grupos.size();
	}
	
	@Override
	public long getGroupId(int groupPosition) 
	{
		return groupPosition;
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded,
			View convertView, ViewGroup parent) 
	{
		String groupTitle = (String) getGroup(groupPosition);
		
		if(convertView == null)
		{
			LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.layout_padre, parent, false);
		}
		
		TextView parentTextView = (TextView)convertView.findViewById(R.id.field_padre);
		//parentTextView.setTypeface(null, Typeface.BOLD);
		parentTextView.setText(groupTitle);
		
		return convertView;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) 
	{
		return false;
	}

}
