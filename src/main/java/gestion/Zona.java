package gestion;
import java.util.ArrayList;
import zooAnimales.*;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList <Animal> animales = new ArrayList<>();
	
	// Constructor
    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
    }
    
    // Constructor Vacio
    
    public Zona() {
    	
    }
    
    // Métodos
    public void agregarAnimales(Animal animal) {
    	this.animales.add(animal);
    	animal.setZona(this);
    }
    
    public int cantidadAnimales() {
    	return animales.size();
    }
    
    
    // Métodos get y set 
    
    // Métodos para nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos para zoo
    public Zoologico getZoo() {
        return zoo;
    }
    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }

    // Métodos para animales
    public ArrayList<Animal> getAnimales() {
        return animales;
    }
    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }

}
