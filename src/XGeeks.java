//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String ebuka0 = "Teleportation";
		String ebuka1 = "super speed 80000000mps";
		String ebuka2 = "super strength 60tons";
		String ebuka3 = "extreme healing";
		String ebuka4 = "extreme laser projection";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String word=	JOptionPane.showInputDialog("what name would you choose");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
		if(word.equals("ebuka0")){
			JOptionPane.showMessageDialog(null, ebuka0);
		}
		if(word.equals("ebuka1")){
			JOptionPane.showMessageDialog(null, ebuka1);
		}
		if(word.equals("ebuka2")){
			JOptionPane.showMessageDialog(null, ebuka2);
		}
		if(word.equals("ebuka3")){
			JOptionPane.showMessageDialog(null, ebuka3);
		}
		if(word.equals("ebuka4")){
			JOptionPane.showMessageDialog(null, ebuka4);
		}
	}
}

