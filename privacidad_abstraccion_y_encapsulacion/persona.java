
public class persona {
	private int edad;
	private String nombre;
	private int telefono;

	public persona(String nuevoNombre){
	nombre = nuevoNombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void setEdad(int nuevaEdad){
		edad = nuevaEdad;
	}

	public int getEdad(){
		return edad;
	}

	public void setTelefono(int nuevoTel){
		telefono = nuevoTel;
	}

	public int getTelefono(){
		return telefono;
	}
}
