package modelo;

public class Empleado extends Persona{

	private byte bCategoria;
	public byte bAnios;
	
	
	public Empleado(String sNombre, String sDni, char cLetra) {
		super(sNombre, sDni, cLetra);
		// TODO Auto-generated constructor stub
	}


	public Empleado(String sNombre, String sDni, char cLetra, byte bCategoria, byte bAnios) {
		super(sNombre, sDni, cLetra);
		this.bCategoria = bCategoria;
		this.bAnios = bAnios;
	}

	

	


	

	public byte getbCategoria() {
		return bCategoria;
	}


	public void setbCategoria(byte bCategoria) {
		this.bCategoria = bCategoria;
	}


	public byte getbAnios() {
		return bAnios;
	}


	public void setbAnios(byte bAnios) {
		this.bAnios = bAnios;
	}


	@Override
	public String toString() {
		return "Empleado [bCategoria=" + bCategoria + ", bAnios=" + bAnios + ", sNombre=" + sNombre + ", sDni=" + sDni
				+ ", cLetra=" + cLetra + ", getbCategoria()=" + getbCategoria() + ", getbAnios()=" + getbAnios()
				+ ", getsNombre()=" + getsNombre() + ", getsDni()=" + getsDni() + ", getcLetra()=" + getcLetra()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	
	
}
