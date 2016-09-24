package com.u.maps;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

public class ActividadImagenCanchaFutbol extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_actividad_imagen_cancha_futbol);
		
		int[] gal = {R.drawable.cancha_futbol_1, R.drawable.cancha_futbol_2, R.drawable.cancha_futbol_3, R.drawable.cancha_futbol_4, R.drawable.cancha_futbol_5, R.drawable.cancha_futbol_6};
	
	    ImageAdapter adapter= new ImageAdapter(this, gal);
	    ViewPager myPager = (ViewPager) findViewById(R.id.view_pager_cancha_futbol);
	    myPager.setAdapter(adapter);
	}

}
