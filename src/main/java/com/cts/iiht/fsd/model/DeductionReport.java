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
public class DeductionReport extends Report {
	private int year;
	private BigDecimal startingSalary;
	// Quarterly/Half-Yearly/Annually
	private int noOfDeductions;
	private int deductionPercent;
	private BigDecimal deductionAmount;
	
	public DeductionReport() {}

	public DeductionReport(int year, BigDecimal startingSalary, int noOfDeductions, int deductionPercent,
			BigDecimal deductionAmount) {
		super();
		this.year = year;
		this.startingSalary = startingSalary;
		this.noOfDeductions = noOfDeductions;
		this.deductionPercent = deductionPercent;
		this.deductionAmount = deductionAmount;
	}

	@Override
	public String toString() {
		return "DeductionReport [year=" + year + ", startingSalary=" + startingSalary.setScale(2, RoundingMode.HALF_UP)
				+ ", noOfDeductions=" + noOfDeductions + ", deductionPercent=" + deductionPercent + ", deductionAmount="
				+ deductionAmount.setScale(2, RoundingMode.HALF_UP) + "]";
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

	public int getNoOfDeductions() {
		return noOfDeductions;
	}

	public void setNoOfDeductions(int noOfDeductions) {
		this.noOfDeductions = noOfDeductions;
	}

	public int getDeductionPercent() {
		return deductionPercent;
	}

	public void setDeductionPercent(int deductionPercent) {
		this.deductionPercent = deductionPercent;
	}

	public BigDecimal getDeductionAmount() {
		return deductionAmount;
	}

	public void setDeductionAmount(BigDecimal deductionAmount) {
		this.deductionAmount = deductionAmount;
	}
}