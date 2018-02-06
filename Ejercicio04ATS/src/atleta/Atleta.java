package atleta;

public class Atleta {
	
	private int numero;
	private String nombre;
	private double tiempo;
	
	//constructor por defecto
	public Atleta() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//constructor con parametros
	public Atleta(int numero, String nombre, double tiempo) {
		this.numero = numero;
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	
	//getters y setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getTiempo() {
		return tiempo;
	}
	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}
	
	public String mostrarDatos() {
		return nombre + " con el numero " + numero + " tiene un tiempo de " + tiempo + " minutos";
	}
	
	
}
