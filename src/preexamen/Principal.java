package preexamen;

public class Principal {
	static private Alumno a = new Alumno();
	static private Profesor p = new Profesor();
	static private Trabajador t = new Trabajador();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a.setNombre("Nancy");
		a.setEdad(20);
		p.setNombre("Rolando");
		p.setEdad(30);
		t.setNombre("German");
		t.setEdad(45);
		System.out.println("nombre alumno: "+a.getNombre());
		System.out.println("edad: "+a.getEdad());
		System.out.println("nombre profesor: "+p.getNombre());
		System.out.println("edad: "+p.getEdad());
		System.out.println("nombre Trabajador: "+t.getNombre());
		System.out.println("edad: "+t.getEdad());
		p.Enseñar();
		a.Enseñar();
		t.Enseñar();
	}

}
