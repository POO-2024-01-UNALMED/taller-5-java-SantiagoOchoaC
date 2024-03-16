package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<>();
	
	// Constructor 
	public Zoologico (String nombre, String ubicacion){
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	// Constructor Vacio
	public Zoologico(){
		
	}
	
	// Metodos
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
		zona.setZoo(this);
	}
	
	public int cantidadTotalAnimales() {
		int cantidadTotalAnimales = 0;
		for (Zona zona : zonas) {
			cantidadTotalAnimales += zona.cantidadAnimales();
		}
		return cantidadTotalAnimales;
	}
	
	// Métodos get y set
	public String getNombre () {
		return this.nombre;
	}
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public String getUbicacion () {
		return this.ubicacion;
	}
	public void setUbicacion (String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public ArrayList <Zona> getZona () {
		return this.zonas;
	}
	public void setZonas (ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}

}
