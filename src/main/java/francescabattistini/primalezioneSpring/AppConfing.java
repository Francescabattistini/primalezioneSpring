package francescabattistini.primalezioneSpring;

import entities.Pizzas;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//essenziale per creare i beans
public class AppConfing {
    //
// menù delle pizze
    @Bean
    public Pizzas margherita(){
        Pizzas pizza = new Pizzas("Margherita",1400,12.6);
        pizza.addToppings();
    }


}
