package entities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
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

    }
}
