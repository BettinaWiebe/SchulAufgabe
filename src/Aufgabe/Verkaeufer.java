package Aufgabe;



public class Verkaeufer {
	
	private String name;
	private Kunde aktuellerKunde = new Kunde();
	private Vertrag vertrag;
	private boolean vertragsErtellungHatGeklappt;
	
	public Verkaeufer(String name) {
		this.name=name;
	}
	
	public void getKundendaten(Kunde kunde) {
		aktuellerKunde.setKundenId(kunde.getKundenId());
		aktuellerKunde.setName(kunde.getName());
		aktuellerKunde.setGeburtsdatum(kunde.getGeburtsdatum());

		System.out.println("Ein neuer Kunde wird angelegt");
		System.out.println("Id: " + aktuellerKunde.getKundenId());
		System.out.println("Name: " + aktuellerKunde.getName());
		System.out.println("Geburtsdatum: " + aktuellerKunde.getGeburtsdatum());
		System.out.println("-----------------------------");
	}
	
	public void erstelleVertrag() {
		while(!vertragsErtellungHatGeklappt) {
			vertrag=new Vertrag(this);
		}
	}

	public void setVertragsErtellungHatGeklappt(boolean vertragsErtellungHatGeklappt) {
		this.vertragsErtellungHatGeklappt = vertragsErtellungHatGeklappt;
	}

	public void setzeVertragsDaten() {
		vertrag.setKundenId(aktuellerKunde.getKundenId());
		vertrag.setKundenName(aktuellerKunde.getName());
		vertrag.setKundenGeburtstag(aktuellerKunde.getGeburtsdatum());
		vertrag.setVerkaeuferName(name);
		
		System.out.println("Ein neuer Vertrag wird aufgesetzt");
		System.out.println("Id des Kunden: " + vertrag.getKundenId());
		System.out.println("Name des Kunden: " + vertrag.getKundenName());
		System.out.println("Geburtsdatum des Kunden: " + vertrag.getKundenGeburtstag());
		System.out.println("Name des Verkaufers: " + vertrag.getVerkaeuferName());
		
		if(vertrag.pruefeObVertragValide()) {
			aktuellerKunde.setVertragKommtZustande(true);
			System.out.println("Der Vertrag kommt Zustande");
		}else {
			aktuellerKunde.setVertragKommtZustande(false);
			System.out.println("Der Vertrag kommt nicht zustande");
		}
	}
}
