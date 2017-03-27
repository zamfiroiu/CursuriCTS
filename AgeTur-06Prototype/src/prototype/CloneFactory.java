package prototype;

public class CloneFactory {

    public Prototype getClone(Prototype prototype) {
       return prototype.makeCopy();
    }

}
