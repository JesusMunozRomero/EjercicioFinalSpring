package hotel.app;

public class Cliente {

    private String nombre;
    private String email;
    private String telefono;
    private String direccion;
    
    public Cliente() {
    }
    
	public String getNombre() {
		return nombre;
	}
	public String getEmail() {
		return email;
	}
	public String getTelefono() {
		return telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	

    
}

