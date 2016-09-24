package com.u.maps;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

public class ActividadImagenGimnasio extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_actividad_imagen_gimnasio);		
		
		int[] gal = {R.drawable.gym_1, R.drawable.gym_2, R.drawable.gym_3};
		
	    ImageAdapter adapter= new ImageAdapter(this, gal);
	    ViewPager myPager = (ViewPager) findViewById(R.id.view_pager_gimnasio);
	    myPager.setAdapter(adapter);		
	}


}
