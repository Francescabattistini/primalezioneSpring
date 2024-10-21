package entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Drinks extends  Infomenu{
    public Drinks(String name, int calories, Double price) {
        super(name, calories, price);
    }

    @Override
    public void stampaciboinconsole() {
        System.out.println("Drink = " + getName());
        System.out.println("Drink =" + getCalories());
        System.out.println("Drink =" + getPrice());

    }
}
