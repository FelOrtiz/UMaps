package com.u.maps;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends Activity
{
	private Runnable runnable;
	private AlertDialog dialog;
	
	private Toast toast;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		toast = Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT);
		
		
		//---------------------- Creación del dialogo de acerca de -----------------------
		
		
		
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		LayoutInflater inflater = getLayoutInflater();
		builder.setView(inflater.inflate(R.layout.activity_about_us, null)); 
		builder.setTitle("Acerca de");
		
		
		//tiene que settarse, sino no aparece el botón
		builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() 
		{
			public void onClick(DialogInterface dialog, int id) 
		    {
				//nada
		    }
		});
		
		dialog = builder.create();		
		
		//--------------------- Creación de botones en el mapa -------------------------
		
		Button botonCasino = (Button) findViewById(R.id.botonCasino);
        botonCasino.setOnLongClickListener(new OnLongClickListener() 
        { 
            @Override
            public boolean onLongClick(View v) 
            {
    			//Intent casinoIntent = new Intent(MainActivity.this, ActividadCasino.class);
            	Intent casinoIntent = new Intent(MainActivity.this, ActividadImagenCasino.class);
    			MainActivity.this.startActivity(casinoIntent);
                return true;
            }
        });		
		
		Button botonKipus = (Button) findViewById(R.id.botonKipus);
        botonKipus.setOnLongClickListener(new OnLongClickListener() 
        { 
            @Override
            public boolean onLongClick(View v) 
            {
    			//Intent kipusIntent = new Intent(MainActivity.this, ActividadKipus.class);
            	Intent kipusIntent = new Intent(MainActivity.this, ActividadImagenKipus.class);
    			MainActivity.this.startActivity(kipusIntent);
                return true;
            }
        });	    
        
		Button botonCanchaFutbol = (Button) findViewById(R.id.botonCanchaFutbol);
        botonCanchaFutbol.setOnLongClickListener(new OnLongClickListener() 
        { 
            @Override
            public boolean onLongClick(View v) 
            {
            	//Intent canchaFutbolIntent = new Intent(MainActivity.this, ActividadCanchaFutbol.class);
    			Intent canchaFutbolIntent = new Intent(MainActivity.this, ActividadImagenCanchaFutbol.class);
    			MainActivity.this.startActivity(canchaFutbolIntent);
                return true;
            }
        });	        
        
		Button botonConstruccion = (Button) findViewById(R.id.botonConstruccion);
        botonConstruccion.setOnLongClickListener(new OnLongClickListener() 
        { 
            @Override
            public boolean onLongClick(View v) 
            {
    			//Intent construccionIntent = new Intent(MainActivity.this, ActividadConstruccion.class);
    			Intent construccionIntent = new Intent(MainActivity.this, ActividadImagenConstruccion.class);
    			MainActivity.this.startActivity(construccionIntent);
                return true;
            }
        });     
        
		Button botonGimnasio = (Button) findViewById(R.id.botonGimnasio);
        botonGimnasio.setOnLongClickListener(new OnLongClickListener() 
        { 
            @Override
            public boolean onLongClick(View v) 
            {
    			//Intent gimnasioIntent = new Intent(MainActivity.this, ActividadGimnasio.class);
            	Intent gimnasioIntent = new Intent(MainActivity.this, ActividadImagenGimnasio.class);
    			MainActivity.this.startActivity(gimnasioIntent);
                return true;
            }
        });  
        
		Button botonBiblioteca = (Button) findViewById(R.id.botonBiblioteca);
        botonBiblioteca.setOnLongClickListener(new OnLongClickListener() 
        { 
            @Override
            public boolean onLongClick(View v) 
            {
    			//Intent bibliotecaIntent = new Intent(MainActivity.this, ActividadBiblioteca.class);
            	Intent bibliotecaIntent = new Intent(MainActivity.this, ActividadImagenBiblioteca.class);
    			MainActivity.this.startActivity(bibliotecaIntent);
                return true;
            }
        });    
        
		Button botonBiblioteca2 = (Button) findViewById(R.id.botonBiblioteca2);
        botonBiblioteca2.setOnLongClickListener(new OnLongClickListener() 
        { 
            @Override
            public boolean onLongClick(View v) 
            {
            	//Intent bibliotecaIntent = new Intent(MainActivity.this, ActividadBiblioteca.class);
    			Intent bibliotecaIntent = new Intent(MainActivity.this, ActividadImagenBiblioteca.class);
    			MainActivity.this.startActivity(bibliotecaIntent);
                return true;
            }
        });            
        
        //--- crear info adicional de los siguientes
		
        Button botonCanchaBaby = (Button) findViewById(R.id.botonCanchaBaby);
        botonCanchaBaby.setOnLongClickListener(new OnLongClickListener() 
        { 
            @Override
            public boolean onLongClick(View v) 
            {
            	Intent babyIntent = new Intent(MainActivity.this, ActividadImagenBaby.class);
    			MainActivity.this.startActivity(babyIntent);
                return true;
            }
        });  
        
		Button botonCanchaTenis = (Button) findViewById(R.id.botonCanchaTenis);
        botonCanchaTenis.setOnLongClickListener(new OnLongClickListener() 
        { 
            @Override
            public boolean onLongClick(View v) 
            {
            	Intent tenisIntent = new Intent(MainActivity.this, ActividadImagenTenis.class);
    			MainActivity.this.startActivity(tenisIntent);
                return true;
            }
        });         
        
		Button botonEstablos = (Button) findViewById(R.id.botonEstablos);
        botonEstablos.setOnLongClickListener(new OnLongClickListener() 
        { 
            @Override
            public boolean onLongClick(View v) 
            {
            	Intent establosIntent = new Intent(MainActivity.this, ActividadImagenEstablos.class);
    			MainActivity.this.startActivity(establosIntent);
                return true;
            }
        });   
        
		Button botonLabs = (Button) findViewById(R.id.botonLabs);
        botonLabs.setOnLongClickListener(new OnLongClickListener() 
        { 
            @Override
            public boolean onLongClick(View v) 
            {
            	Intent labsIntent = new Intent(MainActivity.this, ActividadImagenLabs.class);
    			MainActivity.this.startActivity(labsIntent);
                return true;
            }
        });   
        
		Button botonExcasino = (Button) findViewById(R.id.botonExCasino);
        botonExcasino.setOnLongClickListener(new OnLongClickListener() 
        { 
            @Override
            public boolean onLongClick(View v) 
            {
            	Intent excasinoIntent = new Intent(MainActivity.this, ActividadImagenExcasino.class);
    			MainActivity.this.startActivity(excasinoIntent);
                return true;
            }
        });          
        
		Button botonMecanica = (Button) findViewById(R.id.botonMecanica);
        botonMecanica.setOnLongClickListener(new OnLongClickListener() 
        { 
            @Override
            public boolean onLongClick(View v) 
            {
            	Intent mecanicaIntent = new Intent(MainActivity.this, ActividadImagenMecanica.class);
    			MainActivity.this.startActivity(mecanicaIntent);
                return true;
            }
        });        
        
		Button botonServicios = (Button) findViewById(R.id.botonServiciosMultiples);
        botonServicios.setOnLongClickListener(new OnLongClickListener() 
        { 
            @Override
            public boolean onLongClick(View v) 
            {
            	Intent serviciosIntent = new Intent(MainActivity.this, ActividadImagenServiciosMultiples.class);
    			MainActivity.this.startActivity(serviciosIntent);
                return true;
            }
        });   
        
		Button botonEdificioAzul = (Button) findViewById(R.id.botonEdificioAzul);
        botonEdificioAzul.setOnLongClickListener(new OnLongClickListener() 
        { 
            @Override
            public boolean onLongClick(View v) 
            {
            	Intent edificioAzulIntent = new Intent(MainActivity.this, ActividadImagenEdificioAzul.class);
    			MainActivity.this.startActivity(edificioAzulIntent);
                return true;
            }
        });         
        
		Button botonPorteria = (Button) findViewById(R.id.botonGuardia);
        botonPorteria.setOnLongClickListener(new OnLongClickListener() 
        { 
            @Override
            public boolean onLongClick(View v) 
            {
            	Intent porteriaIntent = new Intent(MainActivity.this, ActividadImagenPorteria.class);
    			MainActivity.this.startActivity(porteriaIntent);
                return true;
            }
        });           
     
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.main_activity_actions, menu);
	    return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onPrepareOptionsMenu(Menu menu) 
	{
	    super.onPrepareOptionsMenu(menu);	    
	    return true;
	}	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) 
	{	
	    switch (item.getItemId()) 
	    {
        	case R.id.action_search:
        		AlertDialog.Builder builderSearch = new AlertDialog.Builder(this);
        	    final CharSequence[] salas= {
        	    		"Sala 11",
        	    		"Sala 12",
        	    		"Sala 13",
        	    		"Sala 14",
        	    		"Sala 21",
        	    		"Sala 22",//5
        	    		"Sala 23",
        	    		"Sala 24",
        	    		"Sala 25",
        	    		"Sala 26",
        	    		"Sala E1",//10
        	    		"Sala E2",
        	    		"Sala S1",
        	    		"Sala S2",
        	    		"Sala C1",
        	    		"Sala C2",//15
        	    		"Sala C3",
        	    		"Sala C4",
        	    		"Sala 5",
        	    		"Sala T1",
        	    		"Sala T2",//20
        	    		"Sala T3",
        	    		"Laboratorio de Automatización",//22
        	    		"Laboratorio de Ciencias e Ingeniería en Materiales",       	    		
        	    		"Laboratorio de Computación 1",
        	    		"Laboratorio de Computación 2",
        	    		"Laboratorio de Computación 3",
        	    		"Laboratorio de Electrónica",
        	    		"Laboratorio de Energía y Plasmas",
        	    		"Laboratorio de Física",
        	    		"Laboratorio de Manufactura Integrada por Computador",//30
        	    		"Laboratorio de Matemáticas 1",
        	    		"Laboratorio de Matemáticas 2",
        	    		"Laboratorio de Máquinas Herramientas con Control Numérico",//33
        	    		"Laboratorio de Mecánica de Suelo",
        	    		"Laboratorio de Metalografía y Resistencia de Materiales",//35
        	    		"Laboratorio de Operaciones Unitarias",
        	    		"Laboratorio de Química",
        	    		"Laboratorio de Telematica",
        	    		"Laboratorio de Turing",
        	    		"Taller de procesos"};//40
        	    
        	    
        	    builderSearch.setTitle("Seleccionar sala o laboratorio").setItems(salas, new DialogInterface.OnClickListener() 
        	    {
					public void onClick(DialogInterface dialog, int which) 
        	        {
						if(which == 0 || which == 1 || which == 2 || which == 3 || which == 4 || which == 5 || which == 6 || which == 7 || which == 8)
						{			
							int []imageArray = {R.drawable.map_serv_mult_selected,R.drawable.map_720};							
							crearEfecto(imageArray);
						}
						else if (which == 9 || which == 23 || which == 24 || which == 25 || which == 26 || which == 29 || which == 31 || which == 32 || which == 37 || which == 38)
						{
							final int []imageArray = {R.drawable.map_labs_selected,R.drawable.map_720};
							crearEfecto(imageArray);
						}
						else if(which == 10 || which == 11)
						{
							int []imageArray = {R.drawable.map_establos_selected,R.drawable.map_720};
							crearEfecto(imageArray);
						}	
						else if(which == 12 || which == 13)
						{
							final int []imageArray = {R.drawable.map_ex_casino_selected,R.drawable.map_720};
							crearEfecto(imageArray);				
						}
						else if(which == 14 || which == 15 || which == 16 || which == 17 || which == 18 || which == 27 || which == 28 || which == 34 || which == 39)
						{
							final int []imageArray = {R.drawable.map_constru_selected,R.drawable.map_720};
							crearEfecto(imageArray);							
						}		
						else if(which == 19 || which == 20 || which == 21 || which == 22 || which == 30 || which == 33 || which == 35 || which == 36 || which == 40)
						{
							final int []imageArray = {R.drawable.map_mecanica_selected,R.drawable.map_720};
							crearEfecto(imageArray);						
						}						
					}
        	    });
        	    AlertDialog dialogSearch = builderSearch.create();
    			
    			dialogSearch.show();
        		            
            	return true;
        	case R.id.action_aboutUS:
    			dialog.show();
        		
            	return true;
        	default:
        		return super.onOptionsItemSelected(item);
	    }
	}
		
	public void crearEfecto(final int[] imageArray)
	{		
		final Handler handler = new Handler();
		runnable = new Runnable()
        {
			int i = 0, veces = 0;
            RelativeLayout layoutMain = (RelativeLayout)findViewById(R.id.layoutMain); 
            
            public void run() 
            {
            	layoutMain.setBackgroundResource(imageArray[i]);
                i++;
                
                if(i > imageArray.length-1)
                {
                	i = 0;
                	veces++;
                }
                if(veces < 3)
                {
                	 handler.postDelayed(this, 300);  //for interval...
                }
                else
                {
                	handler.removeCallbacks(runnable);
                }
            }
        };
        
		handler.postDelayed(runnable, 100); //for initial delay..		
	}
	
	public void onBtnClicked(View v)
	{
		if(v.getId() == R.id.botonCasino)
		{
			toast.setText("Casino");
		}			
		else if(v.getId() == R.id.botonKipus)
		{
			toast.setText("Edificio I+D");
		}	
		else if(v.getId() == R.id.botonCanchaFutbol)
		{
			toast.setText("Cancha de Fútbol");
		}	
		else if(v.getId() == R.id.botonConstruccion)
		{
			toast.setText("Edificio Ingeniería en Construcción");
		}					
		else if(v.getId() == R.id.botonGimnasio)
		{
			toast.setText("Gimnasio");
		}	
		else if(v.getId() == R.id.botonBiblioteca || v.getId() == R.id.botonBiblioteca2)
		{
			toast.setText("Edificio Biblioteca");
		}	
		else if(v.getId() == R.id.botonAuditorium)
		{
			toast.setText("Auditorium");
		}			
		else if(v.getId() == R.id.botonCanchaBaby)
		{
			toast.setText("Cancha de Pasto Sintético");
		}			
		else if(v.getId() == R.id.botonCanchaTenis)
		{
			toast.setText("Multicancha");
		}		
		else if(v.getId() == R.id.botonEstablos)
		{
			toast.setText("Salas E1 y E2");;
		}		
		else if(v.getId() == R.id.botonLabs)
		{
			toast.setText("Edificio Laboratorios");
		}
		else if(v.getId() == R.id.botonServiciosMultiples)
		{
			toast.setText("Edificio Servicios Múltiples");
		}		
		else if(v.getId() == R.id.botonMecanica)
		{
			toast.setText("Edificio Laboratorios Tecnológicos");
		}			
		else if(v.getId() == R.id.botonExCasino)
		{
			toast.setText("Edificio Servicios Estudiantiles");
		}			
		else if(v.getId() == R.id.botonEdificioAzul)
		{
			toast.setText("Facultad de Ingeniería");
		}	
		else if(v.getId() == R.id.botonGuardia)
		{
			toast.setText("Portería");
		}
		toast.show();
	}
}
