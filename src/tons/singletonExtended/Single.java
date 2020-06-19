package tons.singletonExtended;

abstract class AbstractSingle{
    static AbstractSingle s;

    static AbstractSingle instance(AbstractSingle single){
        if(AbstractSingle.s == null) s= single;
        return s;
    }
}

public class Single extends AbstractSingle {

    private Single(){}

    public static AbstractSingle instance(){
        return instance(new Single());
    }
}

class AnotherSingle extends AbstractSingle{

    private AnotherSingle(){}

    public static AbstractSingle instance(){
        return instance(new AnotherSingle());
    }
}