package OOPBonus.Shapes;

public class cylinder extends Shapes {
    private int r;
    private int h;
    public cylinder(int r, int h){
        this.r = r;
        this.h = h;
        lsa = 2*3*r*h;
        tsa = 2 * 3 * r * (r + h);
        volume = 3 * r * r * h;
    }
}
