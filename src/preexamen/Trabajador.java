package preexamen;

public class Trabajador extends Persona {
	private int num_trabajador;

	public int getNum_trabajador() {
		return num_trabajador;
	}

	public void setNum_trabajador(int num_trabajador) {
		this.num_trabajador = num_trabajador;
	}

	@Override
	public void Enseñar() {
		System.out.println("El trabador enseña al nuevo trabajador");
	}
}
