package com.u.maps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ActividadGimnasio extends Activity 
{
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_actividad_gimnasio);
	}
	
	public void onBtnClicked(View v)
	{
		if(v.getId() == R.id.botonImagenGimnasio)
		{
			Intent gymImagenIntent = new Intent(ActividadGimnasio.this, ActividadImagenGimnasio.class);
			ActividadGimnasio.this.startActivity(gymImagenIntent);
		}
	}	
}
