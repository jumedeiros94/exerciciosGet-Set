package Carros;

public class Renault extends Icarros {

    public Renault(String marca, int ano, double valor, String cor, double velocidade, int portas) {
        super(marca, ano, valor, cor, velocidade, portas);
    }

    @Override
    public void darPartidaMotor() {
        double velocidade = 0.0;
        super.darPartidaMotor();
    }

    @Override
    public void freiarCarro() {
        setVelocidade(getVelocidade() - 5);
        super.freiarCarro();
    }

    @Override
    public void acelerarCarro() {
        setVelocidade(getVelocidade() + 10);
        super.acelerarCarro();
    }
}
