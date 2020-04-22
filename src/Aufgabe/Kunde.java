package Aufgabe;

import java.time.LocalDate;

public class Kunde {
	private int kundenId;
	private String name;
	private LocalDate geburtsdatum;
	private boolean vertragKommtZustande;

	public Kunde() {
	}
	public Kunde(int id, String name, LocalDate geburtsdatum) {
		this.kundenId = id;
		this.name = name;
		this.geburtsdatum = geburtsdatum;
	}

	public void setKundenId(int kundenId) {
		this.kundenId = kundenId;
	}
	
	public int getKundenId() {
		return kundenId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setGeburtsdatum(LocalDate geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public LocalDate getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setVertragKommtZustande(boolean vertragKommtZustande) {
		this.vertragKommtZustande = vertragKommtZustande;
	}

	public boolean getVertragKommtZustande() {
		return vertragKommtZustande;
	}
}
