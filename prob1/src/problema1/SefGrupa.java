package problema1;

import java.util.ArrayList;

public class SefGrupa extends Angajat{
	ArrayList<SefEchipa> Subordonati;
	SefGrupa(int varsta, String nume, String pozitie, ArrayList<SefEchipa> Angajati){
		super(varsta, nume, pozitie);
		Subordonati = new ArrayList<SefEchipa>(Angajati);
	}
}
