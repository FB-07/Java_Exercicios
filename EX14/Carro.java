package EX5;

public class Carro {
    private int km;
    private boolean alugado;

    public int getKm() {
        return this.km;
    }

    public boolean estaAlugado() {
        return this.alugado;
    }

    public void setkm(int km) {
        this.km = km;
    }

    public void SetAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public void adicionaKm(int km) {
        this.km += km;
    }
}
