package Runner;

import java.util.Scanner;

import Model.Persona;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Persona persona = new Persona();
        persona.AnnoNascita();
		persona.NomeFiscale();
		System.out.println(persona.toString());
	}
}
