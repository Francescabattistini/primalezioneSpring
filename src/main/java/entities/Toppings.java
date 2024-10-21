package entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Toppings extends Infomenu {


    public Toppings(String name, int calories, Double price) {
        super(name, calories, price);
    }

    @Override
    public void stampaciboinconsole() {
        System.out.println("name = " + getName());
        System.out.println("Calories = " + getCalories());
        System.out.println("Price = " + getPrice());
    }
}
