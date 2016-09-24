package com.u.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;

public class ActividadConstruccion extends Activity 
{
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_actividad_construccion);
		
		ExpandableListView listaExpandible = (ExpandableListView)findViewById(R.id.lista_expandible_construccion);
		
		HashMap<String, List<String>> informacion = new HashMap<String, List<String>>();

		List<String> piso1 = new ArrayList<String>();
		List<String> piso2 = new ArrayList<String>();
		
		piso1.add("Sala de Idiomas 1");
		piso1.add("Sala de Idiomas 2");
		piso1.add("Laboratorio de Turing");
		piso1.add("Laboratorio de Electrónica");
		piso1.add("Laboratorio de Energía y Plasmas");
		piso1.add("Laboratorio de Mecánica de Suelo");
		piso1.add("Baño de Hombres");
		piso1.add("Baño de Mujeres");

		piso2.add("Escuela de Ingeniería en Construcción");
		piso2.add("Sala C1");
		piso2.add("Sala C2");
		piso2.add("Sala C3");
		piso2.add("Sala C4");
		piso2.add("Sala 5");
		piso2.add("Sala de estudio Ingeniería Civil Industrial Vespertino");
		
		informacion.put("Primer piso", piso1);
		informacion.put("Segundo piso", piso2);
		
		List<String> aulas = new ArrayList<String>(informacion.keySet());
		
		ExpandableListAdapter adapter = new AdaptadorLista(this, informacion, aulas);
		listaExpandible.setAdapter(adapter);
	}
	
	public void onBtnClicked(View v)
	{
		if(v.getId() == R.id.botonImagenConstruccion)
		{
			Intent construccionImagenIntent = new Intent(ActividadConstruccion.this, ActividadImagenConstruccion.class);
			ActividadConstruccion.this.startActivity(construccionImagenIntent);
		}
	}	
}
