import java.util.Objects;

public class Phone {
    static String country = "USA";

    String phoneNumber;
    String model;
    double weight;

    public Phone() {
    }

    public Phone(String phoneNumber, String model, double weight) {
        this.phoneNumber = phoneNumber;
        this.model = model;
        this.weight = weight;
    }

    public static void receiveCall(String name) {
        receiveCall(name, "");
    }

    public static void receiveCall(String name, String number) {
        System.out.println(name + " is calling... " + (Objects.equals(number, "") ? "His phone number not found " : "His phone number is " + number));
    }
}
