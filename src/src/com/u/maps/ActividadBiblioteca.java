package com.u.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

public class ActividadBiblioteca extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_actividad_biblioteca);
		
		ExpandableListView listaExpandible = (ExpandableListView)findViewById(R.id.lista_expandible_biblioteca);
		
		HashMap<String, List<String>> informacion = new HashMap<String, List<String>>();

		List<String> piso1 = new ArrayList<String>();
		List<String> piso2 = new ArrayList<String>();
		
		piso1.add("Acceso a Bilioteca");
		piso1.add("Acceso a Universia");

		piso2.add("Sala Tesista 1");
		piso2.add("Sala Tesista 2");
		piso2.add("Sala Tesista 3");
		piso2.add("Espacio de estudio");
		piso2.add("Acceso a Universia");
		
		informacion.put("Primer piso", piso1);
		informacion.put("Segundo piso", piso2);
		
		List<String> aulas = new ArrayList<String>(informacion.keySet());
		
		ExpandableListAdapter adapter = new AdaptadorLista(this, informacion, aulas);
		listaExpandible.setAdapter(adapter);		
	}

	public void onBtnClicked(View v)
	{
		if(v.getId() == R.id.botonImagenBiblioteca)
		{
			Intent bibliotecaImagenIntent = new Intent(ActividadBiblioteca.this, ActividadImagenBiblioteca.class);
			ActividadBiblioteca.this.startActivity(bibliotecaImagenIntent);
		}
	}		
}
