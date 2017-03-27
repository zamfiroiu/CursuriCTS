package decorator;

import codulexistent.PachetTuristic;

public class DecoratorTelevizor extends OfertaDecorator {
    public DecoratorTelevizor(PachetTuristic pachetTuristic) {
        super(pachetTuristic);
    }

    @Override
    public void descriere() {
        super.descriere();
        includeTelevizor();
    }

    private void includeTelevizor(){
        System.out.println("si televizor LED ");
    }
}
