import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
        int score= 0; 
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
         String answer=JOptionPane.showInputDialog( "Which creature walks on four legs in the morning, two legs in the afternoon, and three legs in the evening?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
        if(answer.equals("man")) {
         score++;
         JOptionPane.showMessageDialog(null, "correct");}
		// 5. Otherwise, say "wrong" and tell them the answer
        else {JOptionPane.showMessageDialog(null, "wrong");}
		// 6. Add some more riddles
        String answer2=JOptionPane.showInputDialog( "What has a head and a tail, but no body?");
		if(answer2.equals("coin")) {
			score++;
			JOptionPane.showMessageDialog(null, "correct");
			String answer3=JOptionPane.showInputDialog( "What has an eye but can not see?");
			if(answer3.equals("needle"));
			score++;
		}
        // 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}
}

