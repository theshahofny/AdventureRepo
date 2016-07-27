package com.tiy.ChooseYourOwnAdventure;

import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class Deli_Adventure {
	ArrayList<String> allDecisions = new ArrayList<String>();

	int tracker = 0;

	public Deli_Adventure(){

		String file = "2ndpartdeli.txt";

		try
		{
			InputStream ips = new FileInputStream(file);
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);
			String line;
			while ((line = br.readLine()) != null) {
				allDecisions.add(line);
			}
			br.close();
			start_Adventure(allDecisions.size());
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
	public void start_Adventure(int size){

		String userInputCase = "", choices = "";

		for(int i = tracker; i < 2; i++){
			choices += ((allDecisions).get(i))+ "\n" ;
			tracker++;
		}

		userInputCase = JOptionPane.showInputDialog("What do you want to get at the deli?" + "\n" + choices, userInputCase);
		switch (userInputCase){
		case("D"): chooseA(); break;
		case("E"): chooseB(); break;
		}

	}

	public void chooseA(){

		String userInputCase = "", choices = "";

		for(int i = tracker ; i < allDecisions.size(); i++){
			choices += ((allDecisions).get(i)) + "\n";
		}
		userInputCase = JOptionPane.showInputDialog("What would you like to do now?" + "\n" + choices, userInputCase);			
		switch (userInputCase){
		case("F"): chooseF(); break;
		case("G"): chooseG(); break;
		}

	}


	public void chooseB(){

		String userInputCase = "", choices = "";

		for(int i = tracker ; i < allDecisions.size(); i++){
			choices += ((allDecisions).get(i)) + "\n";
		}
		userInputCase = JOptionPane.showInputDialog("Now that you've eaten, what would you like to do?" + "\n" + choices, userInputCase);			
		switch (userInputCase){
		case("F"): chooseF(); break;
		case("G"): chooseG(); break;
		}	
	}
	public void chooseF(){
		JOptionPane.showMessageDialog(null, "Maybe you should have eaten some breakfast. Enjoy the potato chips tho :T");
	}

	public void chooseG(){
		JOptionPane.showMessageDialog(null, "Ahh Satisfaction :) Goodbye!");
	}


}
