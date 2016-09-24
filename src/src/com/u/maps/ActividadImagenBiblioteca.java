package com.u.maps;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

public class ActividadImagenBiblioteca extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_actividad_imagen_biblioteca);
		
		int[] gal = {R.drawable.biblio_1, R.drawable.biblio_2, R.drawable.biblio_3, R.drawable.universia_1};
		
	    ImageAdapter adapter= new ImageAdapter(this, gal);
	    ViewPager myPager = (ViewPager) findViewById(R.id.view_pager_biblioteca);
	    myPager.setAdapter(adapter);		
	}

}
