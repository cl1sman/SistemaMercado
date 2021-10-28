package SistemaMercado;

public class Operacoes {
    private float soma;
    Operacoes(){
        this.setSoma(0);
    }

    public float getSoma() {
        return soma;
    }

    public void setSoma(float soma) {
        this.soma += soma;
    }
}
