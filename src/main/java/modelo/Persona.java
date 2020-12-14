package modelo;

public class Persona {

	public String sNombre;
	public String sDni;
	public char cLetra;
	
	public Persona(String sNombre, String sDni, char cLetra) {
		super();
		this.sNombre = sNombre;
		this.sDni = sDni;
		this.cLetra = cLetra;
	}

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	

	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public String getsDni() {
		return sDni;
	}

	public void setsDni(String sDni) {
		this.sDni = sDni;
	}

	public char getcLetra() {
		return cLetra;
	}

	public void setcLetra(char cLetra) {
		this.cLetra = cLetra;
	}

	@Override
	public String toString() {
		return "Persona [sNombre=" + sNombre + ", sDni=" + sDni + ", cLetra=" + cLetra + "]";
	}
	
	
}
