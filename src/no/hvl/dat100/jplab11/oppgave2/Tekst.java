package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	// TODO: objektvariable 
	protected String tekst;
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		super(id, bruker, dato);
		this.tekst = tekst;
		
		//throw new UnsupportedOperationException(TODO.constructor("Tekst"));
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super(id, bruker, dato);
		this.tekst = tekst;
		//throw new UnsupportedOperationException(TODO.constructor("Tekst"));
	}
	
	public String getTekst() {
		return tekst;
		//throw new UnsupportedOperationException(TODO.method());

	}


	public void setTekst(String tekst) {
		this.tekst = tekst;
		throw new UnsupportedOperationException(TODO.method());
	}

	@Override
	public String toString() {
		//throw new UnsupportedOperationException(TODO.method());
		return  "\n" +  id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n" + tekst + "\n";

	}
	
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
