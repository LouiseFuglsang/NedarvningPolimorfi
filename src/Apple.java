import java.util.Date;

public class Apple extends Fruit implements Conserve, Process{

    String sort = "Golden Delicious";
    String type = "spiseæble";
    boolean moden = false;


    @Override
    public void conserve() {
        System.out.println("Æbler laves til æblemos.");
    }

    @Override
    public void process() {
        System.out.println("Æbler skrælles.");
    }
}
