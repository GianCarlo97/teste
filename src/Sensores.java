public class Sensores {
	
	public boolean[] alarmes = new boolean[10];
	public boolean alerta = false;

	public void setAlerta(int s, boolean a){
		try {
			alarmes[s] = a;
		} catch (IndexOutOfBoundsException e) {
			throw new IndexOutOfBoundsException();
		}
	}
	public void reset(){
		for (boolean b : alarmes) {
			b = false;
		}
		alerta=false;
	}
	public boolean isAlerta(int s){
		try {
			return alarmes[s];
		} catch (Exception e) {
			return false;
		}
	}
	public boolean statusOk(){
		return !alerta;
	}
}
