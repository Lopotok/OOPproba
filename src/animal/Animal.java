package animal;

public class Animal {

    protected final String name;

    protected String petsName;

    public Animal(String name, String petsName) {
        this.name = name;
        this.petsName = petsName;
    }

    public String getName() {
        return name;
    }

    public String getPetsName() {
        return petsName;
    }

    public void setPetsName(String petsName) {
        this.petsName = petsName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", petsName='" + petsName + '\'' +
                '}';
    }
}
