import java.util.ArrayList;

public class Lager {

ArrayList<Goods> GoodsStoock = new ArrayList<>();

public void fyldOp(){
    GoodsStoock.add(new Apple());

    GoodsStoock.add(new Peas());

    GoodsStoock.add(new Daisies());
    GoodsStoock.add(new Tulips());
    GoodsStoock.add(new Peonies());
    GoodsStoock.add(new Roses());

    GoodsStoock.add(new Danish());
    GoodsStoock.add(new RyeBread());
    GoodsStoock.add(new WhiteBread());
}

public int antalVarer(){
    return 0;
}

}
