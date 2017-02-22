package problema1;

import java.util.ArrayList;

public class SefEchipa extends Angajat{
	ArrayList<String> Subordonati;
	
	SefEchipa(int varsta, String nume, String pozitie, ArrayList<String> Angajati){
		super(varsta, nume, pozitie);
		Subordonati = new ArrayList<String>(Angajati);
	}
}
