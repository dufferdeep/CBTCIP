package guesstheno;

import java.util.Scanner;

	class guesstheno {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int mynum= (int)(Math.random()*100);
		int yrnum=0;
		do {
			System.out.println("Guess any Number between 1 to 100 :");
			yrnum=s.nextInt();
			if(yrnum == mynum) {
				System.out.println("Wohoo !! You Won ! Correct Guess :");
				break;
			}
			else if(yrnum > mynum) {
				System.out.println("Your Guess is too large ! Guess Again :");
			}
			else {
				System.out.println("Your Guess is too small ! Guess Again :");
			}
		} while(yrnum>=0);
		System.out.print("Your Number Was :");
		System.out.println(mynum);
	}

}
