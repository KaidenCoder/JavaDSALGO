package Tests;


class Vehicle {
    int seats;
    int speed;

    public Vehicle(int seats, int speed) {
        System.out.print("Vehicle ");
        this.seats = seats;
        this.speed = speed;
    }
}

//class Car extends Vehicle {
//    int id;
////    Car() {
////        System.out.print("Car ");
////    }
//}

public class Output {

    public static void main(String args[]) {
        Vehicle c = new Vehicle(5, 5);
    }
}