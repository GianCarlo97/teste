

public class SensoresH {
    private boolean[] sensores;
    private boolean statusOk;

    public SensoresH(){
        sensores = new boolean[10];
        statusOk = true;
    }

    public void setAlerta(int index, boolean alerta) throws IndexOutOfBoundsException{
        if (index < 0 || index > 9){
            throw new IndexOutOfBoundsException("Sensor inexistente");
        }

        sensores[index] = alerta;
    }


    public boolean isAlerta(int index) {
        return sensores[index];
    }

    public void reset() {
        for (int i = 0; i < sensores.length; i++) {
            sensores[i] = false;
        }
        statusOk = true;
    }

    public boolean isStatusOk() {
        return statusOk;
    }

}
