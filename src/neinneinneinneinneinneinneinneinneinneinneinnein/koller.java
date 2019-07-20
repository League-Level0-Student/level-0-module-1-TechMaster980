package neinneinneinneinneinneinneinneinneinneinneinnein;

import javax.swing.JOptionPane;

public class koller {

	public static void main(String[] args) {
		
//		1. Ask the user how many cups of flour they have. If they have less than 2 cups, tell
//		them to go to the store to buy more.
		
		String goringsfood = JOptionPane.showInputDialog("how much flour do you have");
		int fish = Integer.parseInt(goringsfood);
			if(fish < 2) {
			System.out.println("go back to the store");
			}
			
		
		
//		2. Now ask them how many people they are going to give cookies to. If they are going
//		to give cookies to more than 30 people, tell them they are going to have to bake two
//		batches of cookies! 
		
		String keitel = JOptionPane.showInputDialog("how many people are you going to give cookies to");
		int pooroldman = Integer.parseInt(keitel);
		if(pooroldman > 30) {
		System.out.println("bake two more batches of cookies");
		}
		
		
//		3. Finally, ask them how many batches of cookies they baked. If they baked 2 batches
//		of cookies, tell them they are lucky to have so many friends. 
		
		String gunsche = JOptionPane.showInputDialog("how many batches of cookies have you baked");
		if(gunsche.equals("2")) {
			System.out.println("your lucky to have a lot of friends");
		}
		
		
		
	}
}
