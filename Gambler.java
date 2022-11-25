package com.workshop;

public class Gambler {

	public static void main(String[] args) {

		int stakeAmount = 100;
		int betAmount = 1;
		int winCash = stakeAmount + stakeAmount/2;
		int lostCash = stakeAmount - stakeAmount/2;

		int days;
		int totalcash = 0;

		System.out.println("Gambler's stake amount : "+stakeAmount+"$");
		System.out.println("Gambler bets for each game : "+betAmount+"$");

		for (days = 1; days <= 20; days++) {
			int cash = stakeAmount;
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

			cash = cash - stakeAmount ;
			totalcash = totalcash+cash;
			if (totalcash > 0) {
				System.out.println("Total cash won after 20 days :"+totalcash);
			}else {
				System.out.println("Total cash lost after 20 days : "+totalcash);
			}
		}	
	}
}