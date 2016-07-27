package com.tiy.ChooseYourOwnAdventure;

import java.io.*;
import java.util.*;
import javax.swing.*;

public class Coffee_Adventure {
	ArrayList<String> allDecisions = new ArrayList<String>();

	int tracker = 0;

	public Coffee_Adventure(){

		String file = "2ndpartcoffee.txt";

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
			choices += (allDecisions).get(i) + "\n";
			tracker++;
		}

		userInputCase = JOptionPane.showInputDialog("What you want to order at the cafe?" + "\n" + choices, userInputCase.toUpperCase());
		switch (userInputCase){
		case("D"): chooseA(); break;
		case("E"): chooseB(); break;
		}

	}

	public void chooseA(){

		String userInputCase = "", secondSetOfChoices = "";

		for(int i = 2; i < allDecisions.size(); i++){
			secondSetOfChoices += ((allDecisions).get(i)) + "\n";
		}

		userInputCase = JOptionPane.showInputDialog("Are you going to stay a while at the cafe?" + "\n" + secondSetOfChoices, userInputCase);
		switch (userInputCase){
		case("F"): chooseF(); break;
		case("G"): chooseG(); break;
		}

	}


	public void chooseB(){

		String userInputCase = "", lastChoice = "";
		for(int i = tracker; i < allDecisions.size(); i++){
			lastChoice += (allDecisions).get(i) + "\n";
		}

		userInputCase = JOptionPane.showInputDialog("Now that you have ordered you're food, what would you like to do?" + "\n" + lastChoice, userInputCase);
		
		switch (userInputCase){
		case("F"): chooseF(); break;
		case("G"): chooseG(); break;
		}

	}
	public void chooseF(){
		JOptionPane.showMessageDialog(null,"Have a nice nap at home! ;)");
	}

	public void chooseG(){
		JOptionPane.showMessageDialog(null, "Enjoy the newspaper! See You later!");
	}

}

