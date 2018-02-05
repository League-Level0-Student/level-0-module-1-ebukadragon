import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer=	JOptionPane.showInputDialog("Which creature walks on four legs in the morning, two legs in the afternoon, and three legs in the evening?"
		+ "");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answer.equals("Man. He crawls on a.rs as a baby, then walks on two feet as an adult, and then walks with a cane as an old man"))
{JOptionPane.showMessageDialog(null, "correct"); 
score++;	
}
else{
	JOptionPane.showMessageDialog(null, "wrong");
}

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
 answer=	JOptionPane.showInputDialog("Take off my skin - I won't cry, but you will! What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answer.equalsIgnoreCase("An onion"))
{JOptionPane.showMessageDialog(null, "correct"); 
score++;	
}
else{
	JOptionPane.showMessageDialog(null, "wrong");
}
		// 2. Make a pop up to show the score.
JOptionPane.showMessageDialog(null, "your score was "+score);
	}
}

