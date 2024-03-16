package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
	private static ArrayList<Ave> listado = new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	// Constructor
	public Ave (String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	
	// Constructor Vacio
	public Ave () {
		listado.add(this);
	}
	
	// Métodos
	public static int cantidadAves() {
		return listado.size();
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		halcones++;
		return halcon;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		aguilas++;
		return aguila;
	}
	
	public String movimiento() {
		return "volar";
	}
	// Métodos get y set
	
    // Métodos para listado
    public ArrayList<Ave> getListado() {
        return listado;
    }
    public void setListado(ArrayList<Ave> listado) {
        this.listado = listado;
    }

    // Métodos para colorPlumas
    public String getColorPlumas() {
        return colorPlumas;
    }
    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
}
