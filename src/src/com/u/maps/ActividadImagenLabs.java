package com.u.maps;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

public class ActividadImagenLabs extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_actividad_imagen_labs);
		
		int[] gal = {R.drawable.labs_1, R.drawable.labs_2, R.drawable.labs_3, R.drawable.labs_4};
		
	    ImageAdapter adapter= new ImageAdapter(this, gal);
	    ViewPager myPager = (ViewPager) findViewById(R.id.view_pager_labs);
	    myPager.setAdapter(adapter);		
	}
}
