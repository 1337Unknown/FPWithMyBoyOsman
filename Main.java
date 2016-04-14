package ÜbungsAufgabe1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<Aepfel> ApfelBox = new ArrayList<>();
		
		ArrayList<Banane> BananenBox = new ArrayList<>();
		
		// Erstellen von Äpfel und Bananen
		
		/*Aepfel oApfel1 = new Aepfel("rot");
		Aepfel oApfel2 = new Aepfel("gelb");
		Aepfel oApfel3 = new Aepfel("rotGelb");
		Aepfel oApfel4 = new Aepfel("rot");
		Aepfel oApfel5 = new Aepfel("gelb");
		Aepfel oApfel6 = new Aepfel("rotGelb");
		Aepfel oApfel7 = new Aepfel("rot");
		Aepfel oApfel8 = new Aepfel("gelb");
		Aepfel oApfel9 = new Aepfel("rotGelb");
		Aepfel oApfel10 = new Aepfel("rot");
		*/
		
		// Erstellen und Hinzufügen GEHT SCHNELLER!!!
		for(int i=0; i<10; i++){
			
			ApfelBox.add(new Aepfel("Apfel: "+"rot"));
		}
		
		/*Banane oBanane1 = new Banane("Gelb");
		Banane oBanane2 = new Banane("Gelb");
		Banane oBanane3 = new Banane("Gelb");
		Banane oBanane4 = new Banane("Gelb");
		Banane oBanane5 = new Banane("Gelb");
		Banane oBanane6 = new Banane("Gelb");
		Banane oBanane7 = new Banane("Gelb");
		Banane oBanane8 = new Banane("Gelb");
		Banane oBanane9 = new Banane("Gelb");
		Banane oBanane10 = new Banane("Gelb");
		*/
		
		// Erstellen und Hinzufügen GEHT SCHNELLER!!!
		for(int i=0; i<10; i++){
			
			BananenBox.add(new Banane("Banane: "+ "gelb"));
		}
		//Hinzufügen mit der Methode add in die ArrayList!
		
		/*
		ApfelBox.add(oApfel1);
		ApfelBox.add(oApfel2);
		ApfelBox.add(oApfel3);
		ApfelBox.add(oApfel4);
		ApfelBox.add(oApfel5);
		ApfelBox.add(oApfel6);
		ApfelBox.add(oApfel7);
		ApfelBox.add(oApfel8);
		ApfelBox.add(oApfel9);
		ApfelBox.add(oApfel10);
		*/
		
		
		
		/*
		BananenBox.add(oBanane1);
		BananenBox.add(oBanane2);
		BananenBox.add(oBanane3);
		BananenBox.add(oBanane4);
		BananenBox.add(oBanane5);
		BananenBox.add(oBanane6);
		BananenBox.add(oBanane7);
		BananenBox.add(oBanane8);
		BananenBox.add(oBanane9);
		BananenBox.add(oBanane10);
		*/
		
		// Ausagbe von Äpfel und Bananen !!!
		for( Aepfel oApfel : ApfelBox){
			
			System.out.println(oApfel.getFarbe());
		}
		
		for( Banane oBanane : BananenBox){
			
			System.out.println(oBanane.getFarbe());
		}
	}
}
	