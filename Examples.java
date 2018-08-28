class DeliverMessage{
        public static void main(String[] args){
                UnreliableFriend friend = new UnreliableFriend();
                try{
                        friend.deliverMessage();
                        System.out.println("The message was delivered!");
                } catch (OutOfGasException e){
                        System.out.println("Hey, uh, so, I ran out of gas..");
                        // back-up plan here.
                }
        }
}

// **************************************************************************


import java.util.Random;
class OutOfGasException extends Exception{}
class UnreliableFriend {
        public boolean deliverMessage() throws OutOfGasException{
                Random r = new Random();
                boolean hasGas = r.nextBoolean();
                if (hasGas){
                        return true;
                }
                throw new OutOfGasException();
        }
}
// **************************************************************************

public static void eat(String fruit, int quantity) {
  // some code here
}


// Calling static methods from inside its own class
public class Person {
  public static void main(String[] args) {
    getName();
  }
  static void getName() {
    System.out.println("My name is Dojo.");
  }
}
// Calling static methods from outside the Person class. Assume that this class is in its own file in the same directory
public class School {
  public static void main(String[] args) {
    Person.getName();
  }
}

public class MathTest {
    public static void main(String[] args) {
        System.out.println(Math.sin(25));
    }
}

// *************************************************

class Vehicle {
    private int numberOfWheels;
    private String color;
    // getter
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    // setter
    public void setNumberOfWheels(int number) {
        numberOfWheels = number;
    }
    // getter
    public String getColor() {
        return color;
    }
    // setter
    public void setColor(String c) {
        color = c;
    }
}


class VehicleTest {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle();
        Vehicle car = new Vehicle();
        bike.setNumberOfWheels(2);
        bike.setColor("red");
        int bikeWheels = bike.getNumberOfWheels();
        String bikeColor = bike.getColor();
        car.setNumberOfWheels(4);
        car.setColor("green");
        int carWheels = car.getNumberOfWheels();
        String carColor = car.getColor();
        System.out.println("Bike object - Wheels: " + bikeWheels + ", Color: " + bikeColor);
        System.out.println("Car object - Wheels: " + carWheels + ", Color: " + carColor);
    }
}


class Vehicle {
    private int numberOfWheels;
    private String color;

    // ex. new Vehicle()
    public Vehicle() {
    }
    // ex. new Vehicle("someColor")
    public Vehicle(String color) {
        // setting the color attribute to the value from the color parameter
        color = color;
    }

    // ex. new Vehicle("someColor", 4)
    public Vehicle(String color, int num) {
        color = color;
        numberOfWheels = num;
    }

    // ...
    // getters and setters removed for brevity
    // ...
}


public class Person {
        private int age;
        private int cmHeight;
        private String name;
        public Person() {
            this(20, "John Doe", 171);
        }
        public Person(int age, String name, int cmHeight) {
            this.age = age;
            this.name = name;
            this.cmHeight = cmHeight;
        }
        // ...

        class PersonTest {
            public static void main(String[] args) {
                Person person1 = new Person(10, "Person1");
                Person person2 = new Person(5, "Person2");
                person1.objectMethods(person2);
            }
        }
        }
