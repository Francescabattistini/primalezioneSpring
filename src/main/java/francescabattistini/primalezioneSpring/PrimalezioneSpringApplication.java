package francescabattistini.primalezioneSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PrimalezioneSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimalezioneSpringApplication.class, args);
	}
AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PrimalezioneSpringApplication.class);// passando questa invece solo della classe con @Configuration ,
// dico all'app prendi tutte le classi che hanno quest'ultima e non solo quella .



}
