package com.tiy.ChooseYourOwnAdventure;

import java.io.*;
import java.util.Scanner;
import javax.swing.*;

public class Beginning {

	public void starts_Story(){

		String file = "beginningStory.txt";
		FirstDecision firstDecision = new FirstDecision();
		String msgFromBuffer = "";
		try
		{
			InputStream ips = new FileInputStream(file);
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);
			String line;
			while ((line = br.readLine()) != null) {
				msgFromBuffer += line;
			}
			JOptionPane.showMessageDialog(null, msgFromBuffer);
			System.out.println();
			firstDecision.makeFirstDecision();
			br.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
	}
}
