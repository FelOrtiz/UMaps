package com.u.maps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ActividadCanchaFutbol extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_actividad_cancha_futbol);
	}

	public void onBtnClicked(View v)
	{
		if(v.getId() == R.id.botonImagenCanchaFutbol)
		{
			Intent canchaImagenIntent = new Intent(ActividadCanchaFutbol.this, ActividadImagenCanchaFutbol.class);
			ActividadCanchaFutbol.this.startActivity(canchaImagenIntent);
		}
	}	
}
