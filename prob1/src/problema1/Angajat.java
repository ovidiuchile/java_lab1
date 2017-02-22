package problema1;

public class Angajat {
	int varsta;
	String nume;
	String pozitie;
	
	void setPozitie(String pozitie){
		this.pozitie = pozitie;
	}
	
	String getPozitie(){
		return this.pozitie;
	}
	
	String getNume(){
		return this.nume;
	}
	
	int getVarsta(){
		return this.varsta;
	}
	
	Angajat(int varsta, String nume, String pozitie){
		if (nume == null)
			nume = "no name";
		this.varsta = varsta;
		this.nume = nume;
		this.pozitie = pozitie;
	}
}
