package ar.edu.unju.fi.ejercicio5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp3Grupo40Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp3Grupo40Application.class, args);
		int i = 0;
		do {
			   i = i + 1;
			   System.out.println(i);
			} while (i < 5);
	}

}
