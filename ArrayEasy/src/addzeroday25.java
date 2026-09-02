public class addzeroday25 {
    static void main() {
        Bicycle bicycle = new Bicycle();
        Bike bike = new Bike();
        Car car = new Car();

        bicycle.changeGear(2);
        bike.changeGear(3);
        car.changeGear(5);
    }
}

interface Vehicle {

    void changeGear(int gear);
}


class Bicycle implements Vehicle {

    public void changeGear(int gear) {

        if(gear >= 1 && gear <= 2) {
            System.out.println("Bicycle gear changed to " + gear);
        }
        else {
            System.out.println("Invalid gear for Bicycle");
        }
    }
}


class Bike implements Vehicle {

    public void changeGear(int gear) {

        if(gear >= 1 && gear <= 3) {
            System.out.println("Bike gear changed to " + gear);
        }
        else {
            System.out.println("Invalid gear for Bike");
        }
    }
}


class Car implements Vehicle {

    public void changeGear(int gear) {

        if(gear >= 1 && gear <= 5) {
            System.out.println("Car gear changed to " + gear);
        }
        else {
            System.out.println("Invalid gear for Car");
        }
    }
}


