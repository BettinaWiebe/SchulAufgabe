package Aufgabe;

import java.time.LocalDate;

public class Vertrag {
	
	private int kundenId;
	private String kundenName;
	private LocalDate kundenGeburtstag;
	private String verkaeuferName;
	
	
	public Vertrag(Verkaeufer verkaeufer) {
		//Entschuldigung aber ein Constructor mit Rückgabewert wird in der Aufgabe ausdrücklich gefordert
		verkaeufer.setVertragsErtellungHatGeklappt(true);
	}
	
	private boolean kundeHatMindestalter(long alter) {
		LocalDate spaetesterGueltigerGeburtstag = LocalDate.now().minusYears(alter);
		
		return !kundenGeburtstag.isAfter(spaetesterGueltigerGeburtstag);
	}
	private boolean kundenIdValide() {
		return kundenId>0 && kundenId<100_000;
	}
	public boolean pruefeObVertragValide() {
		
		//LocalDate prüft selbst, dass man kein ungültiges Datum übergeben kann
		
		return kundeHatMindestalter(18) && kundenIdValide();
	}

	public int getKundenId() {
		return kundenId;
	}

	public void setKundenId(int kundenId) {
		this.kundenId = kundenId;
	}

	public String getKundenName() {
		return kundenName;
	}

	public void setKundenName(String kundenName) {
		this.kundenName = kundenName;
	}

	public LocalDate getKundenGeburtstag() {
		return kundenGeburtstag;
	}

	public void setKundenGeburtstag(LocalDate kundenGeburtstag) {
		this.kundenGeburtstag = kundenGeburtstag;
	}

	public String getVerkaeuferName() {
		return verkaeuferName;
	}

	public void setVerkaeuferName(String verkaeuferName) {
		this.verkaeuferName = verkaeuferName;
	}
}
