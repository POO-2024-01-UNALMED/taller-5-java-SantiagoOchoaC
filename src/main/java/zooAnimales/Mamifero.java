package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal {
	private static ArrayList <Mamifero> listado = new ArrayList<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	// Constructor
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	
	//Constructor Vacio
	public Mamifero() {
		listado.add(this);
	}
	
	// Métodos
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		caballos++;
		return caballo;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
		Mamifero.leones++;
		return leon;
	}
	
	// Métodos get y set
	
    // Métodos para listado
    public ArrayList<Mamifero> getListado() {
        return listado;
    }
    public void setListado(ArrayList<Mamifero> listado) {
        this.listado = listado;
    }

    // Métodos para pelaje
    public boolean isPelaje() {
        return pelaje;
    }
    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    // Métodos para patas
    public int getPatas() {
        return patas;
    }
    public void setPatas(int patas) {
        this.patas = patas;
    }
	
}