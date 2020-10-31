package CovidBinary;

public class ArbolBinaryBusquedaPaciente {
	
	NodoPaciente raiz;
	
	public void agregarPaciente (Paciente newPaciente) {
		
		if(raiz == null) {
			raiz = new NodoPaciente(newPaciente);
			
			return;
		}
		
		agregarPaciente(raiz, newPaciente);
	}
	
	private void agregarPaciente(NodoPaciente nodo, Paciente newPaciente) {
		 if(nodo == null) {
			 return;  
		 }
		 if(newPaciente.id > nodo.paciente.id) {
			 if(nodo.derecho == null) {
				 nodo.derecho = new NodoPaciente(newPaciente);
			 }
			 
			 else {
				 agregarPaciente(nodo.derecho, newPaciente);
			 }
		 }
		 else {
			 if(nodo.izquierdo == null) {
				 nodo.izquierdo = new NodoPaciente(newPaciente);
			 }
			 else {
				 agregarPaciente(raiz.izquierdo, newPaciente);
			 }
		 }
	}
	
	   public Paciente busqueda(int id) {
	    	return busqueda(raiz, id);
	    }
	    
	    private Paciente busqueda(NodoPaciente nodo, int id) {
	    	if(nodo == null) {
	    		return null;
	    	}
	    	if(nodo.paciente.id == id) {
	    		System.out.println("en la busqueda el paciente se llama: " +  nodo.paciente.nombre);
	    		for(int k=0; k<nodo.paciente.sintomas.length; k++) {
	    			System.out.println(" " + nodo.paciente.sintomas[k]);
	    		}
	    		return nodo.paciente;
	    	}
	    	if(nodo.paciente.id < id) {
	    		return busqueda (nodo.derecho, id);
	    	}
	    	
	    	return busqueda(nodo.izquierdo, id);
	    }
	   
	 
}
