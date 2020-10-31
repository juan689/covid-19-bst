package CovidBinary;

public class Paciente {
	
	public String nombre;
	public int id;
	public String [] sintomas;
	public float cuotaxpagar;
	
	
	public Paciente(String vlrnombre, int vlrid, String [] vlrsintomas) {
		
		nombre = vlrnombre;
		id = vlrid;
		sintomas = vlrsintomas;
		cuotaxpagar = sintomas.length*100;	
	}

}
