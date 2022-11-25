package com.workshop;

public class Gambler {
	
	public static void main(String[] args) {

		int stakeAmount = 100;
		int betAmount = 1;
		int win;
		int loose;
		
		System.out.println("Gambler's stake amount : "+stakeAmount+"$");
		System.out.println("Gambler bets for each game : "+betAmount+"$");
		
		double chance =  Math.random();
		if (chance > 0.5) {
			System.out.println("Gambler won");
		}else {
			System.out.println("Gambler lost");
		}
	}
}
