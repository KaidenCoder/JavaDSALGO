package OOP.ComplexNumbers;

public class ComplexNumbers {
    // Complete this class
    private int real;
    private int imaginary;

    public ComplexNumbers(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public void plus(ComplexNumbers C2){
        this.real = this.real + C2.real;
        this.imaginary = this.imaginary + C2.imaginary;
    }

    public void multiply(ComplexNumbers c2) {
        int newReal = (this.real*c2.real)-(this.imaginary*c2.imaginary);
        int newImaginary=this.real*c2.imaginary+this.imaginary*c2.real;
        this.real = newReal;
        this.imaginary = newImaginary;
    }


    public void print() {
        System.out.println(this.real+" + "+"i"+this.imaginary);
    }
}
