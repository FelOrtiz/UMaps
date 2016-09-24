package com.u.maps;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

public class ActividadImagenBaby extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_actividad_imagen_baby);
	
		int[] gal = {R.drawable.baby_1, R.drawable.baby_2};
		
	    ImageAdapter adapter= new ImageAdapter(this, gal);
	    ViewPager myPager = (ViewPager) findViewById(R.id.view_pager_baby);
	    myPager.setAdapter(adapter);	
	}
}
