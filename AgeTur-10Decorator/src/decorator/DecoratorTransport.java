package decorator;

import codulexistent.PachetTuristic;

public class DecoratorTransport extends OfertaDecorator {

    public DecoratorTransport(PachetTuristic pachetTuristic) {
        super(pachetTuristic);
    }

    @Override
    public void descriere() {
        super.descriere();
        includeTransport();
    }

    private void includeTransport() {
        System.out.print("si transport dus-intors ");
    }

}
