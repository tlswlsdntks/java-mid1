package lang.object.tostring;

public class Dog {
    private String dogName;
    private int dogAge;

    public Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", dogAge=" + dogAge +
                '}';
    }
}
