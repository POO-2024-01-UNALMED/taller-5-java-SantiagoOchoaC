package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal{
	private static  ArrayList <Pez> listado = new ArrayList<>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	// Constructor
	public Pez (String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	
	// Constructor Vacio
	public Pez () {
		listado.add(this);
	}
	
	// Métodos 
	
	public static int cantidadPeces() {
		return listado.size();
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		salmones++;
		return salmon;
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		bacalaos++;
		return bacalao;
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	// Métodos get y set
	
    // Métodos para listado
    public ArrayList<Pez> getListado() {
        return listado;
    }
    public void setListado(ArrayList<Pez> listado) {
        this.listado = listado;
    }

    // Métodos para colorEscamas
    public String getColorEscamas() {
        return colorEscamas;
    }
    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    // Métodos para cantidadAletas
    public int getCantidadAletas() {
        return cantidadAletas;
    }
    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
}
