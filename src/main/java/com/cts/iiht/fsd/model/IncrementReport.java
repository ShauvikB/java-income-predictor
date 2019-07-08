package com.cts.iiht.fsd.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class IncrementReport extends Report {
	private int year;
	private BigDecimal startingSalary;
	// Quarterly/Half-Yearly/Annually
	private int noOfIncrements;
	private int incrementPercent;
	private BigDecimal incrementAmount;
	
	public IncrementReport() {}

	public IncrementReport(int year, BigDecimal startingSalary, int noOfIncrements, int incrementPercent,
			BigDecimal incrementAmount) {
		super();
		this.year = year;
		this.startingSalary = startingSalary;
		this.noOfIncrements = noOfIncrements;
		this.incrementPercent = incrementPercent;
		this.incrementAmount = incrementAmount;
	}



	@Override
	public String toString() {

		return "IncrementReport [year=" + year + ", startingSalary=" + startingSalary.setScale(2, RoundingMode.HALF_UP)
				+ ", noOfIncrements=" + noOfIncrements + ", incrementPercent=" + incrementPercent + ", incrementAmount="
				+ incrementAmount.setScale(2, RoundingMode.HALF_UP) + "]";
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public BigDecimal getStartingSalary() {
		return startingSalary;
	}

	public void setStartingSalary(BigDecimal startingSalary) {
		this.startingSalary = startingSalary;
	}

	public int getNoOfIncrements() {
		return noOfIncrements;
	}

	public void setNoOfIncrements(int noOfIncrements) {
		this.noOfIncrements = noOfIncrements;
	}

	public int getIncrementPercent() {
		return incrementPercent;
	}

	public void setIncrementPercent(int incrementPercent) {
		this.incrementPercent = incrementPercent;
	}

	public BigDecimal getIncrementAmount() {
		return incrementAmount;
	}

	public void setIncrementAmount(BigDecimal incrementAmount) {
		this.incrementAmount = incrementAmount;
	}
	
	

}