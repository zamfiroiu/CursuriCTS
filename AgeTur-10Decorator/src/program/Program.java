package program;

import codulexistent.PachetCazare;
import codulexistent.PachetTuristic;
import decorator.DecoratorTelevizor;
import decorator.DecoratorTransport;

public class Program {

    public static void main(String[] args) {
        PachetTuristic pachetTuristic = new PachetCazare();
        pachetTuristic.descriere();
        System.out.println();

        DecoratorTransport pachetTuristicOferta = new DecoratorTransport(pachetTuristic);
        pachetTuristicOferta.descriere();
        System.out.println();

        PachetTuristic pachetCuTvSiTransport = new DecoratorTelevizor(new DecoratorTransport(pachetTuristic));
        pachetCuTvSiTransport.descriere();
    }

}
