package Carros;
public class Hyundai extends Icarros {

    public Hyundai(String marca, int ano, double valor, String cor, double velocidade, int portas) {
        super(marca, ano, valor, cor, velocidade, portas);
    }


    @Override
    public void darPartidaMotor() {
        double velocidade = 5.0;
        super.darPartidaMotor();
    }

    @Override
    public void freiarCarro() {
        setVelocidade(getVelocidade()-2);
        super.freiarCarro();
    }

    @Override
    public void acelerarCarro() {
        setVelocidade(getVelocidade()+15);
        super.acelerarCarro();
    }
}
