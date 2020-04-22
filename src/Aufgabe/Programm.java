package Aufgabe;

import java.time.LocalDate;

public class Programm {
	public static void main(String[] args) {
		Verkaeufer verkaeufer = new Verkaeufer("Klaus");
		
		//positivfall
		Kunde kunde = new Kunde(1, "Dieter",LocalDate.of(1998, 6, 17));
		
		verkaeufer.getKundendaten(kunde);
		verkaeufer.erstelleVertrag();
		verkaeufer.setzeVertragsDaten();
		
		System.out.println("-----------------------------");
		
		//negativfall
		Kunde boeserBub = new Kunde(2, "I bims 1 Boesewicht", LocalDate.of(2007, 11, 3));

		verkaeufer.getKundendaten(boeserBub);
		verkaeufer.erstelleVertrag();
		verkaeufer.setzeVertragsDaten();
	}
}
