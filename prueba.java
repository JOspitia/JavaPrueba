public class Main{
	public static void main(String[] args) {
    Persona myObj = new Persona();
    		System.out.println(myObj.nombre);
  	}

}

public class Persona{
	  private String nombre;
	  private String edad;
	  private int telefono;

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
