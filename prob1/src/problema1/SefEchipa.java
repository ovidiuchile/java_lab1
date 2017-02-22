package problema1;

import java.util.ArrayList;

public class SefEchipa extends Angajat{
	ArrayList<Angajat> Subordonati;
	
	SefEchipa(int varsta, String nume, String pozitie, ArrayList<Angajat> Angajati){
		super(varsta, nume, pozitie);
		Subordonati = new ArrayList<Angajat>(Angajati);
	}
}
