import java.util.Date;

public class Goods {

    double stykpris;
    Date holdbarhed;
    boolean kanSælges = true;

    void smidUd() {
        kanSælges = false;
    }

}
