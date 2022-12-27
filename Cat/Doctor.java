package Cat;

public class Doctor {
    String name;

    public Doctor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Doctor{" +
        "name='" + name + '\'' +
        '}';
    }
}