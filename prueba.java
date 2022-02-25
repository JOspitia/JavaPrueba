import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Registro obR = new Registro();
		obR.realizar();
	}
}

abstract class Registro{
	public void realizar() {
		Formulario obF = Formulario();
		obF.preguntar();
		Repuesta obR = Repuesta();
		obR.mostrar();
	}
}

class Formulario extends Registro{
	public preguntar(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa Nombre de Usuario");
		String strNombre = sc.nextLine();
		
		System.out.println("Ingresa Edad de Usuario");
		String strEdad = sc.nextLine();
		
		System.out.println("Ingresa Telefono de Usuario");
		int intTelefono = sc.nextLine();
		Persona obP = Persona();
		obP.persona(strNombre, strEdad, intTelefono);
	}
}

class Repuesta extends Registro{
	public mostrar(){
		Persona obP = Persona();
		System.out.println("Datos de Registro:");
		System.out.println(obP.setNombre);
		System.out.println(obP.setEdad);
		System.out.println(obP.setTelefono);
	}

}

class Persona  extends Registro{
	private String nombre;
	private String edad;
	private int telefono;

	public persona(String strNombre, String strEdad, int intTelefono){
		nombre = strNombre.getNombre;
		edad = strEdad.getEdad;
		telefono = intTelefono.getTelefono;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String newEdad) {
		this.edad = newEdad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String newTelefono) {
		this.telefono = newTelefono;
	}
}
