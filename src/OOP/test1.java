package OOP;

public class test1 {
    String name;
    static int rollNumber;
    final static double CONVERSION_FACTOR = 0.95;
    private static int numStudents;

    public test1(String n, int num){
        name = n;
        rollNumber = num;
        numStudents++;
    }

    public static int getNumStudents(){
        return numStudents;
    }

    public static int getRollNumber(){
        return rollNumber;
    }

    public void setRollNumber(int rollNumber){
        if(rollNumber <= 0){
            return;
        }
        this.rollNumber = rollNumber;
    }
}
