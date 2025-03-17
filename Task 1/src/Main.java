public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone("987964737", "iPhone 13", 140.5);
        Phone phone2 = new Phone("99340676", "Samsung A55", 155.5);

        System.out.println(phone1.model);
        System.out.println(phone2.weight);
        Phone.receiveCall("Roman", "8453752245");

    }
}
