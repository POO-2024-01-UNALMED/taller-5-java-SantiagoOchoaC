package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{
	private static ArrayList <Reptil> listado = new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	// Constructor
	public Reptil (String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super (nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	// Constructor Vacio
	public Reptil () {
		listado.add(this);
	}
	 // Métodos
	public static int cantidadReptiles() {
		return listado.size();
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		iguanas++;
		return iguana;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		serpientes++;
		return serpiente;
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	// Métodos get y set 
	
    // Métodos para listado
    public ArrayList<Reptil> getListado() {
        return listado;
    }
    public void setListado(ArrayList<Reptil> listado) {
        this.listado = listado;
    }

    // Métodos para colorEscamas
    public String getColorEscamas() {
        return colorEscamas;
    }
    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    // Métodos para largoCola
    public int getLargoCola() {
        return largoCola;
    }
    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }
	
}
