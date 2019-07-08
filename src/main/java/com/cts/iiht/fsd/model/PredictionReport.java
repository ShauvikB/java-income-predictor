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
public class PredictionReport extends Report {
	private int year;
	private BigDecimal startingSalary;
	private BigDecimal incrementAmount;
	private BigDecimal deductionAmount;
	private double salaryGrowth;
	
	public PredictionReport() {}

	public PredictionReport(int year, BigDecimal startingSalary, BigDecimal incrementAmount, BigDecimal deductionAmount,
			double salaryGrowth) {
		super();
		this.year = year;
		this.startingSalary = startingSalary;
		this.incrementAmount = incrementAmount;
		this.deductionAmount = deductionAmount;
		this.salaryGrowth = salaryGrowth;
	}

	@Override
	public String toString() {
		return "PredictionReport [year=" + year + ", startingSalary=" + startingSalary.setScale(2, RoundingMode.HALF_UP)
				+ ", incrementAmount=" + incrementAmount.setScale(2, RoundingMode.HALF_UP) + ", deductionAmount="
				+ deductionAmount.setScale(2, RoundingMode.HALF_UP) + ", salaryGrowth=" + salaryGrowth + "% ]";
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

	public BigDecimal getIncrementAmount() {
		return incrementAmount;
	}

	public void setIncrementAmount(BigDecimal incrementAmount) {
		this.incrementAmount = incrementAmount;
	}

	public BigDecimal getDeductionAmount() {
		return deductionAmount;
	}

	public void setDeductionAmount(BigDecimal deductionAmount) {
		this.deductionAmount = deductionAmount;
	}

	public double getSalaryGrowth() {
		return salaryGrowth;
	}

	public void setSalaryGrowth(double salaryGrowth) {
		this.salaryGrowth = salaryGrowth;
	}
}