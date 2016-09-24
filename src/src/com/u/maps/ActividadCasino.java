package com.u.maps;

import android.app.Activity;
import android.content.Intent;
//import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActividadCasino extends Activity 
{
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_actividad_casino);
	}

	public void onBtnClicked(View v)
	{
		if(v.getId() == R.id.botonImagenCasino)
		{
			Intent casinoImagenIntent = new Intent(ActividadCasino.this, ActividadImagenCasino.class);
			ActividadCasino.this.startActivity(casinoImagenIntent);
		}
	}	
}
