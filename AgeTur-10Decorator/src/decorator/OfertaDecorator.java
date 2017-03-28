package decorator;

import codulexistent.PachetTuristic;

public abstract class OfertaDecorator implements PachetTuristic {
    protected PachetTuristic pachetTuristic;

    public OfertaDecorator(PachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }

    public void descriere() {
        pachetTuristic.descriere();
    }

}
