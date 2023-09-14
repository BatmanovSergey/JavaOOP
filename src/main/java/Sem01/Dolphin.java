package Sem01;

import java.time.LocalDate;
import java.util.List;

public class Dolphin extends Animal{
    public Dolphin(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color);
    }

    public Dolphin(String name) {
        super(name);
    }
}
