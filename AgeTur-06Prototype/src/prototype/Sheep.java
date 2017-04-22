package prototype;

public class Sheep implements Prototype {

    public Sheep() {
        System.out.println("Dolly is created");
    }

    @Override
    public Prototype makeCopy() {
        Sheep sheep = null;

        try {
            sheep = (Sheep) super.clone();
            System.out.println("Dolly has been cloned...");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return sheep;
    }
}
