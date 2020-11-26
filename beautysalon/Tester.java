package com.azt.beautysalon;

public class Tester {
	public static void main(String[] args) {
		Visit visitPremium = new Visit("Bas", null);
		visitPremium.getCustomer().setMember(true);
		visitPremium.getCustomer().setMemberType("Premium");
		visitPremium.setServiceExpense(150);
		visitPremium.setProductExpense(100);
		System.out.println(visitPremium);
		System.out.println("Total Expense: " + visitPremium.getTotalExpense());

		Visit visitGold = new Visit("Hin", null);
		visitGold.getCustomer().setMember(true);
		visitGold.getCustomer().setMemberType("Gold");
		visitGold.setServiceExpense(150);
		visitGold.setProductExpense(100);
		System.out.println(visitGold);
		System.out.println("Total Expense: " + visitGold.getTotalExpense());

		Visit visitSilver = new Visit("Max", null);
		visitSilver.getCustomer().setMember(true);
		visitSilver.getCustomer().setMemberType("Silver");
		visitSilver.setServiceExpense(150);
		visitSilver.setProductExpense(100);
		System.out.println(visitSilver);
		System.out.println("Total Expense: " + visitSilver.getTotalExpense());

		Visit visiter = new Visit("Dream", null);
		visiter.setServiceExpense(150);
		visiter.setProductExpense(100);
		System.out.println(visiter);
		System.out.println("Total Expense: " + visiter.getTotalExpense());
	}
}
