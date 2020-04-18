package strategy.domain;

import java.util.LinkedList;
import java.util.List;

public class Knight {

    private String name;
    private int age;
    private List<Weapons> equipment = new LinkedList<Weapons>();


    public Knight(int age, String name) {

        this.name = name;
        this.age = age;
        addWeaponToEquipment(Weapons.FISTS);
    }

    public int getAge() {

        return this.age;

    }

    public String getName() {

        return this.name;
    }

    public void addWeaponToEquipment(Weapons weapon) {
        equipment.add(weapon);
    }

    public List<Weapons> getEquipment() {
        return equipment;
    }
}