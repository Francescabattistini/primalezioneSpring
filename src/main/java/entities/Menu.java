package entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
public class Menu {
    private List<Infomenu> menu;

    public Menu(List<Infomenu> menu) {
        this.menu = menu;
    }
    public void aggiungiInfoMenu(Infomenu info){
        this.menu.add(info);// aggioungo tutte le info cioè nome, prezzo e calorie al menù
    }
     public void stampaMenù(){
         System.out.println("MENU");
         for(Infomenu info: menu){
             info.stampaciboinconsole();
         }
     }
}
