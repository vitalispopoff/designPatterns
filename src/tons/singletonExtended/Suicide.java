package tons.singletonExtended;

public class Suicide {

    static void suicide(Suicide sui){ sui = null; }

    public static void main(String[] args) {
        Suicide s = new Suicide();
        suicide(s);
        System.out.println(s==null);
    }
}
