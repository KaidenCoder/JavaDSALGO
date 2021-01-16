package OOPBonus.Shapes;

public class sphere extends Shapes {

    private int r;
    public sphere(int r) {
        this.r = r;
        lsa = 4*3*r*r;
        tsa = 3 * 3 * r * r;
        volume = 4 * r * r * r;
    }
}
