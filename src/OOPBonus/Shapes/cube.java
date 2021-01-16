package OOPBonus.Shapes;

public class cube extends Shapes {
    private int r;
    public cube(int r){
        this.r = r;
        lsa = 4 * r * r;
        tsa = 6 * r * r;
        volume = r * r * r;
    }
}
