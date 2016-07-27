package com.tiy.ChooseYourOwnAdventure;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FirstDecision {

	public void makeFirstDecision(){
		String string = "", line = "" , completeMsg = "";
		String file = "firstChoice.txt";

		try
		{
			InputStream ips = new FileInputStream(file);
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);			

			while ((line = br.readLine()) != null) {
				completeMsg += line + "\n";
			}
			br.close();
			
			string = JOptionPane.showInputDialog("Where do you want to head?" + "\n" + completeMsg , string);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}

		switch(string){
		case("A"): Coffee_Adventure coffee = new Coffee_Adventure(); break;
		case("B"): Deli_Adventure deli = new Deli_Adventure(); break;
		case("C"): SkatePark_Adventure skatepark = new SkatePark_Adventure(); break;
		
		}
		
	}

}
