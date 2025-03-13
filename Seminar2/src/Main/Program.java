package Main;

import ro.cts.clase.Angajat;
import ro.cts.clase.Aplicant;
import ro.cts.readere.AngajatReader;
import ro.cts.readere.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		AplicantReader aplicantReader = new AngajatReader();

		try {
			listaAplicanti = aplicantReader.readAplicanti("angajati.txt");
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
