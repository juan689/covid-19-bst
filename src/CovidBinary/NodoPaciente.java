package CovidBinary;

public class NodoPaciente {
	
	public NodoPaciente(Paciente newPaciente) {
		this.paciente = newPaciente;
	}
	
	Paciente paciente;
	NodoPaciente izquierdo;
	NodoPaciente derecho;

}
