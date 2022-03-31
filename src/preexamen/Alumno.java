package preexamen;

public class Alumno extends Persona {
	private String matricula;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public void Enseñar() {
		// TODO Auto-generated method stub
		System.out.println("El alumno enseña a sus compañeros");
	}
}
