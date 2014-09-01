package com.lendingtree.model;

/**
 * @purpose : model class used in MortgageData for storing the calculated values with respect to month
 * @author : ankit
 *
 */
public class Detail {
	
	private int months;
	private double principal;
	private double interest;
	private double balance;
	public int getMonths() {
		return months;
	}
	public void setMonths(int months) {
		this.months = months;
	}
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
