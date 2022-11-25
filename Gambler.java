package com.workshop;

public class Gambler {

	public static void main(String[] args) {

		int stakeAmount = 100;
		int betAmount = 1;
		int winCash = stakeAmount + stakeAmount/2;
		int lostCash = stakeAmount - stakeAmount/2;
		int cash = stakeAmount;


		System.out.println("Gambler's stake amount : "+stakeAmount+"$");
		System.out.println("Gambler bets for each game : "+betAmount+"$");

		while ((cash != winCash) && (cash != lostCash)) {

			double chance =  Math.random();
			if (chance > 0.5) {
				System.out.println("Gambler won");
				cash++;
				System.out.println("current cash : "+cash);
			}else {
				System.out.println("Gambler lost");
				cash--;
				System.out.println("current cash : "+cash);
			}
		}
	}
}
