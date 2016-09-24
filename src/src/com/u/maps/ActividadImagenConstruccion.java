package com.u.maps;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

public class ActividadImagenConstruccion extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_actividad_imagen_construccion);
		
		int[] gal = {R.drawable.constru_1, R.drawable.constru_2};
		
	    ImageAdapter adapter= new ImageAdapter(this, gal);
	    ViewPager myPager = (ViewPager) findViewById(R.id.view_pager_construccion);
	    myPager.setAdapter(adapter);		
	}
}
