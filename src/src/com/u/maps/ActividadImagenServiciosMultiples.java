package com.u.maps;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

public class ActividadImagenServiciosMultiples extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_actividad_imagen_servicios_multiples);
		
		int[] gal = {R.drawable.serv_mult_1, R.drawable.serv_mult_2, R.drawable.serv_mult_3, R.drawable.serv_mult_4};
		
	    ImageAdapter adapter= new ImageAdapter(this, gal);
	    ViewPager myPager = (ViewPager) findViewById(R.id.view_pager_serv_multiples);
	    myPager.setAdapter(adapter);		
	}
}
