package person;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + " name = " + name + ", address = " + address + " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) &&
                address.equals(person.address);
    }

    @Override
    public int hashCode() {
        int result = 7;
        result = 31*result + this.name.hashCode();
        result = 31*result + this.address.hashCode();
        return result;
    }
}
