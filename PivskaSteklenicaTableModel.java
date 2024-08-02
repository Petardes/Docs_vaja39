/**
 * PivskaSteklenicaTableModel.java
 * 
 * Opis:
 * Razred za prikaz delovanja tabel v GUI
 * na primeru razredov poslovne logike Steklenica in PivskaSteklenica
 * 
 */
 
 // Uvoznimo vse razrede iz paketa za delo z V/I napravami, pripomočke, GUI, dogodke in tabele
 import java.io.*;
 import java.util.*;
 import javax.swing.*;
 import javax.swing.table.*;
 import java.awt.event.*;
 
 /**
  * Javni razred za strukturo tabele steklenic na mizi
  *
  *	@author Matej Germovnik
  * @version Primer 20 (GUI)
  */  
 public class PivskaSteklenicaTableModel extends DefaultTableModel  {
	 
	 
	 /** Javni konstruktor za ustvarjanje novega modela tabele steklenic na mizi
	  */		
	public PivskaSteklenicaTableModel()  {
		
		// Pokličemo konstruktor nadrazreda
		super();
		
			
	// Dodamo stolpce 
	addColumn("Znamka");
	addColumn("Stopnja alkohola");
	
	// Ustvarimo prvi testni seznam objektov za dodajanje v tabelo
	Object[] vrstica = new Object[] {"Testna znamka", "5.0"};
	
	// Dodamo prvi testni vnos (vrstico) v tabelo
	addRow(vrstica);
	
	}
	
	 /** Javna metoda, ki doda steklenico v tabelo
	  */		
	public void addPivskaSteklenica(PivskaSteklenica ps)  {
		
		// Ustvarimo seznam objektov za dodajanje v tabelo
	Object[] vrstica = new Object[] {ps.getZnamka(), ps.getStopnjaAlkohola()};
	
	// Dodamo vrstico v tabelo
	addRow(vrstica);
		
		
	}
	
}	
