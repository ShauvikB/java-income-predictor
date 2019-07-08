package com.cts.iiht.fsd.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class PredictionInput extends Report {
	private BigDecimal startingSalary;
	private int incrementPercent;
	// Quarterly/Half-Yearly/Annually
	private int incrementFrequency;
	private int deductionInIncome;
	// Quarterly/Half-Yearly/Annually
	private int deductionFrequency;
	private int predictionFreq;
	
	public PredictionInput() {}
	
	public PredictionInput(BigDecimal startingSalary, int incrementPercent, int incrementFrequency,
			int deductionInIncome, int deductionFrequency, int predictionFreq) {
		super();
		this.startingSalary = startingSalary;
		this.incrementPercent = incrementPercent;
		this.incrementFrequency = incrementFrequency;
		this.deductionInIncome = deductionInIncome;
		this.deductionFrequency = deductionFrequency;
		this.predictionFreq = predictionFreq;
	}



	@Override
	public String toString() {
		return "PredictionInput [startingSalary=" + startingSalary.setScale(2, RoundingMode.HALF_UP)
				+ ", incrementPercent=" + incrementPercent
				+ ", incrementFrequency=" + incrementFrequency + ", deductionInIncome=" + deductionInIncome
				+ ", deductionFrequency=" + deductionFrequency + ", predictionFreq=" + predictionFreq + "]";
	}



	public BigDecimal getStartingSalary() {
		return startingSalary;
	}



	public void setStartingSalary(BigDecimal startingSalary) {
		this.startingSalary = startingSalary;
	}



	public int getIncrementPercent() {
		return incrementPercent;
	}



	public void setIncrementPercent(int incrementPercent) {
		this.incrementPercent = incrementPercent;
	}



	public int getIncrementFrequency() {
		return incrementFrequency;
	}



	public void setIncrementFrequency(int incrementFrequency) {
		this.incrementFrequency = incrementFrequency;
	}



	public int getDeductionInIncome() {
		return deductionInIncome;
	}



	public void setDeductionInIncome(int deductionInIncome) {
		this.deductionInIncome = deductionInIncome;
	}



	public int getDeductionFrequency() {
		return deductionFrequency;
	}



	public void setDeductionFrequency(int deductionFrequency) {
		this.deductionFrequency = deductionFrequency;
	}



	public int getPredictionFreq() {
		return predictionFreq;
	}



	public void setPredictionFreq(int predictionFreq) {
		this.predictionFreq = predictionFreq;
	}
	
	
	
}