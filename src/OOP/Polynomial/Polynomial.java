package OOP.Polynomial;

public class Polynomial {

    private int degree;
    private int coeff;
    private int data[];

    public void setCoefficient(int degree, int coeff){


    }

    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
    public void print(){

    }


    // Adds two polynomials and returns a new polynomial which has result
//    public Polynomial add(Polynomial p){
//
//
//    }
//
//    // Subtracts two polynomials and returns a new polynomial which has result
//    public Polynomial subtract(Polynomial p){
//
//    }
//
//    // Multiply two polynomials and returns a new polynomial which has result
//    public Polynomial multiply(Polynomial p){
//
//    }

    private void doubleCapacity() {
        int temp[] = data;
        data = new int[2 * temp.length];
        for(int i = 0; i < temp.length; i++){
            data[i] = temp[i];
        }
    }

}
