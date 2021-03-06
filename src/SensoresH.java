

public class SensoresH {
    private boolean[] sensores;
    private int[] temp;
    private int[] rad;
    private boolean statusOk;

    public SensoresH(){
        sensores = new boolean[10];
        statusOk = true;
        temp = new int[10];
        rad = new int[10];
    }

    public void setH(int index, boolean alerta) throws IndexOutOfBoundsException{
        if (index < 0 || index > 9){
            throw new IndexOutOfBoundsException("Sensor inexistente");
        }

        sensores[index] = alerta;
    }
    
    public void setTemp(int index, int temp){
    	if (index < 0 || index > 9){
            throw new IndexOutOfBoundsException("Sensor inexistente");
        }
    	
    	this.temp[index] = temp;
    }

    public void setRad(int index, int rad) {
    	if (index < 0 || index > 9){
            throw new IndexOutOfBoundsException("Sensor inexistente");
        }
		this.rad[index] = rad;
	}
    

    public boolean isH(int index) {
    	if (index < 0 || index > 9){
            throw new IndexOutOfBoundsException("Sensor inexistente");
        }
        return sensores[index];
    }
    
    public int isAlerta(int index) {
    	if (index < 0 || index > 9){
            throw new IndexOutOfBoundsException("Sensor inexistente");
        }
    	if (!sensores[index]) return 0;
		if (rad[index] > 7) return 3;
		if (rad[index] > 5 || temp[index] > 40) return 2;
		if (rad[index] > 1 || temp[index] > 30) return 1;
		return 0;
	}

}
