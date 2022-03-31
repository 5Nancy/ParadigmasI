package preexamen;

public class Profesor extends Persona {
	private String clave;

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public void Enseñar() {
		System.out.println("El profesor enseña al alumno");
	}
}
