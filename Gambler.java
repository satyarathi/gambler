package com.workshop;

public class Gambler {

	public static void main(String[] args) {

		int stakeAmount = 100;
		int betAmount = 1;
		int winCash = stakeAmount + stakeAmount/2;
		int lostCash = stakeAmount - stakeAmount/2;
		int wincount = 0;
		int loosecount = 0;
		int days;
		int totalcash = 0;

		System.out.println("Gambler's stake amount : "+stakeAmount+"$");
		System.out.println("Gambler bets for each game : "+betAmount+"$");

		for (days = 1; days <= 30; days++) {
			int cash = stakeAmount;
			while ((cash != winCash) && (cash != lostCash)) {

				double chance =  Math.random();
				if (chance > 0.5) {
					System.out.println("Gambler won");
					wincount++;
					cash++;
					System.out.println("current cash : "+cash);
				}else {
					System.out.println("Gambler lost");
					loosecount++;
					cash--;
					System.out.println("current cash : "+cash);
				}
			}
			System.out.println("Total no of win : "+wincount);
			System.out.println("Total no of lost : "+loosecount);

			cash = cash - stakeAmount ;
			totalcash = totalcash+cash;
			if (totalcash > 0) {
				System.out.println("Total cash won in a month :"+totalcash);
			}else {
				System.out.println("Total cash lost in a month : "+totalcash);
			}
		}	
	}
}