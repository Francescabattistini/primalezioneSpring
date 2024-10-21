package entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@ToString
public class Pizzas extends Infomenu {
    private List<Toppings> toppingsList;

    public Pizzas(String name, int calories, Double price, List<Toppings> toppingsList) {
        super(name, calories, price);
        this.toppingsList = toppingsList;
    }

    public void addToppings(Toppings top){ //aggiungo i Topping alla pizza  quando richiamato
        this.toppingsList.add(top);
    }
    @Override
    public void stampaciboinconsole() {
        System.out.println("La pizza " + getName());
        System.out.println("La pizza " + getCalories());
        System.out.println("La pizza " + getPrice());
        System.out.println("il topping è: ");
        for (Toppings toppings:toppingsList){
            System.out.println(". " + toppings.getName());
        }

    }
}
