package Carros;

public class MainCarros {

    public static void main(String[] args) {

        Renault renault = new Renault("Sandero", 2018, 85.000, "Branco", 30.0, 4);

        Fiat fiat = new Fiat("Uno", 2020, 56.000, "Vermelho", 70.0, 4);

        Hyundai hyundai = new Hyundai("HB20", 2019, 90.000, "Preto", 89.0, 4);

        System.out.println("------------Renault-----------");
        System.out.println(" ");
        renault.registroCarro();
        System.out.println("------------------------------");
        System.out.println(" ");
        renault.darPartidaMotor();
        System.out.println("------------------------------");
        renault.freiarCarro();
        System.out.println("------------------------------");
        renault.acelerarCarro();
        System.out.println(" ");

        System.out.println("--------------Fiat-------------");
        System.out.println(" ");
        fiat.registroCarro();
        System.out.println("------------------------------");
        fiat.darPartidaMotor();
        System.out.println("------------------------------");
        fiat.freiarCarro();
        System.out.println("------------------------------");
        fiat.acelerarCarro();
        System.out.println(" ");

        System.out.println("------------Hyundai-----------");
        System.out.println(" ");
        hyundai.registroCarro();
        System.out.println("------------------------------");
        hyundai.darPartidaMotor();
        System.out.println(" ");
        System.out.println("------------------------------");
        hyundai.freiarCarro();
        System.out.println("------------------------------");
        hyundai.acelerarCarro();
        System.out.println("------------------------------");
        System.out.println(" ");


    }
}

