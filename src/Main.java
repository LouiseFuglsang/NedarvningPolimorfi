import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Apple apple = new Apple();
        apple.stykpris = 2;
        apple.holdbarhed = new Date(1608768000);
        apple.smidUd();
        apple.moden = true;
        apple.coolDown();

        Peas peas = new Peas();
        peas.stykpris = 0.1;
        peas.holdbarhed = new Date(1608768000);
        peas.freeze();

        Daisies daisies = new Daisies();
        daisies.stykpris = 1;
        daisies.holdbarhed = new Date(1608768000);
        daisies.smidUd();
        //      a.coolDown();

        Tulips tulips = new Tulips();
        tulips.stykpris = 2;
        tulips.holdbarhed = new Date(1608768000);
        tulips.smidUd();
//        a.moden = true;
 //       a.coolDown();

        Peonies peonies = new Peonies();
        peonies.stykpris = 2;
        peonies.holdbarhed = new Date(1608768000);
        peonies.smidUd();
//        a.moden = true;
        //       a.coolDown();

        Roses roses = new Roses();
        roses.stykpris = 2;
        roses.holdbarhed = new Date(1608768000);
        roses.smidUd();
//        a.moden = true;
        //       a.coolDown();


        Danish danish = new Danish();
        danish.stykpris = 2;
        danish.holdbarhed = new Date(1608768000);
        danish.smidUd();
//        a.moden = true;
        //       a.coolDown();


        RyeBread ryeBread = new RyeBread();
        ryeBread.stykpris = 2;
        ryeBread.holdbarhed = new Date(1608768000);
        ryeBread.smidUd();
//        a.moden = true;
        //       a.coolDown();

        WhiteBread whiteBread = new WhiteBread();
        whiteBread.stykpris = 2;
        whiteBread.holdbarhed = new Date(1608768000);
        whiteBread.smidUd();
//        a.moden = true;
        //       a.coolDown();

    }

}
