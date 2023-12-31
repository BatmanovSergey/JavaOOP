package sem01;

import clinic.Illable;

import java.time.LocalDate;
import java.util.List;

public class Animal implements Illable {
    protected String name;
    protected double weight;
    protected Owner owner;
    protected LocalDate birthDay;
    protected List<Vaccination> vaccinations;
    protected Color color;
    protected final String TYPE = this.getClass().getSimpleName();
    protected double speed;

    public Animal(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color, double speed) {
        this.name = name;
        this.weight = weight;
        this.owner = owner;
        this.birthDay = birthDay;
        this.vaccinations = vaccinations;
        this.color = color;
        this.speed = speed;
    }

    public Animal(String name, double weight, Owner owner, LocalDate birthDay, Color color) {
        this(name, weight, owner, birthDay, null, color, 0.0);
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public void lifeCycle() {
        wakeUp();
        findFood();
        eat();
        toPlay();
        goToSleep();
    }
    private void wakeUp() {
        System.out.println(this.TYPE + " проснулся.");
    }

    private void findFood() {
        System.out.println(this.TYPE + "Ищет еду");
    }

    private void eat() {
        System.out.println(this.TYPE + "Кушает");
    }

    private void toPlay() {
        System.out.println(this.TYPE + "Играет");
    }

    private void goToSleep() {
        System.out.println(this.TYPE + "Собирается спать");
    }

    private void sound() {
        System.out.println(this.TYPE + "Издаёт звук");
    }

    protected void toGo() {
        System.out.printf("%s по кличке %s %s%n", this.TYPE, this.getName(), "Бегает!");
    }

    protected void toFly() {
        if (this instanceof Eagle) {
            System.out.printf("%s по кличке %s %s%n", this.TYPE, this.getName(), "Летает!");
        } else {
            System.out.printf("%s по кличке %s %s%n", this.TYPE, this.getName(), "Не летает!");
        }
    }

    protected void toSwim() {
        System.out.printf("%s по кличке %s %s%n", this.TYPE, this.getName(), "Плавает!");
    }

    // getters
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public List<Vaccination> getVaccinations() {
        return vaccinations;
    }

    public Color getColor() {
        return color;
    }

    public String getTYPE() {
        return TYPE;
    }
    public void setVaccinations(List<Vaccination> vaccinations) {
        this.vaccinations = vaccinations;
    }

    @Override
    public void heal() {
        System.out.println("Ветеринар лечит " + this.TYPE);
    }

    public double getSpeed() {
        return this.speed;
    }

    @Override
    public String toString() {
        return TYPE + " по кличке " + name + '\'';
    }
}
