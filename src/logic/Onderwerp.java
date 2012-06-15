package logic;

import java.io.File;

public class Onderwerp {
	private String	_naam;
	private File	_plaatje;

	public Onderwerp(String naam, File plaatje) {
		setNaam(naam);
		setPlaatje(plaatje);
	}

	public String getNaam() {
		return _naam;
	}

	public File getPlaatje() {
		return _plaatje;
	}

	public void setNaam(String naam) {
		_naam = naam;
	}

	public void setPlaatje(File plaatje) {
		_plaatje = plaatje;
	}
}
