package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public abstract class Infomenu {
    String name;
    int calories;
    Double price;

public abstract void stampaciboinconsole();
}
