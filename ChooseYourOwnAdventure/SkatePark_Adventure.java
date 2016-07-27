package com.tiy.ChooseYourOwnAdventure;

import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class SkatePark_Adventure {
	ArrayList<String> allDecisions = new ArrayList<String>();

	private int tracker = 0;

	public SkatePark_Adventure(){

		String file = "2ndpartpark.txt";

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
		String choices = "";
		String userInputCase = "";

		for(int i = tracker; i < 2; i++){
			choices += (allDecisions).get(i) +"\n";
			tracker++;
		}

		userInputCase = JOptionPane.showInputDialog("What will you do at the park?" + "\n" + choices , userInputCase.toUpperCase());
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
		userInputCase = JOptionPane.showInputDialog("Are you tired of Skating yet?" + "\n" + choices, userInputCase);
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
		userInputCase = JOptionPane.showInputDialog("Are you tired of Skating yet?" + "\n" + choices, userInputCase);
		switch (userInputCase){
		case("F"): chooseF(); break;
		case("G"): chooseG(); break;
		}

	}
	
	public void chooseF(){
		JOptionPane.showMessageDialog(null,"Nice! Lovin the Energy! Keep it up dude!");
	}

	public void chooseG(){
		JOptionPane.showMessageDialog(null, "When is napping ever a bad idea?! Never! Catch ya later alligator!");
	}
}
