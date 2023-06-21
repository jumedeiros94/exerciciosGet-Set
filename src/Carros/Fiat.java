package Carros;

    public class Fiat extends Icarros {

        public Fiat(String marca, int ano, double valor, String cor, double velocidade, int portas) {
            super(marca, ano, valor, cor, velocidade, portas);
        }

        @Override
        public void darPartidaMotor() {
            double velocidade = 3.0;
            super.darPartidaMotor();
        }

        @Override
        public void freiarCarro() {
            setVelocidade(getVelocidade()-6);
            super.freiarCarro();
        }

        @Override
        public void acelerarCarro() {
            setVelocidade(getVelocidade()+12);
            super.acelerarCarro();
        }
    }
