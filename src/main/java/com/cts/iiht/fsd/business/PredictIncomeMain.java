package com.cts.iiht.fsd.business;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.cts.iiht.fsd.model.DeductionReport;
import com.cts.iiht.fsd.model.IncrementReport;
import com.cts.iiht.fsd.model.PredictionInput;
import com.cts.iiht.fsd.model.PredictionReport;
import com.cts.iiht.fsd.model.Report;

/**
 * This call is the main entry point for the income prediction.
 *
 */
public class PredictIncomeMain {

	final static Logger logger = Logger.getLogger(PredictIncome.class);

	public void invokeIncomeReport(PredictionInput input) {

		PredictIncome predictIncome = new PredictIncome();
		Map<String, List<? extends Report>> reportMap = predictIncome.incomeReport(input);

		List<IncrementReport> incrementList = (List<IncrementReport>) reportMap.get("IncrementReport");
		List<DeductionReport> deductionList = (List<DeductionReport>) reportMap.get("DeductionReport");
		List<PredictionReport> predictionList = (List<PredictionReport>) reportMap.get("PredictionReport");

		// Print Increment Report
		logger.info("<------------------- Increment Report ------------------->");
		incrementList.forEach(increment -> {
			if (isReportNeeded(increment.getYear())) {
				logger.info(increment);
			}
		});
		// Print Deduction Report
		logger.info("<------------------- Deduction Report ------------------->");
		deductionList.forEach(deduction -> {
			if (isReportNeeded(deduction.getYear())) {
				logger.info(deduction);
			}
		});
		// Print Prediction Report
		logger.info("<------------------- Prediction Report ------------------->");
		predictionList.forEach(prediction -> {
			if (isReportNeeded(prediction.getYear())) {
				logger.info(prediction);
			}

		});

	}
	

	/**
	 * @param year
	 * @return
	 */
	private boolean isReportNeeded(int year) {
		return year == 2005 || year == 2010 || year == 2020 || year == 2030 || year == 2050;
	}

	public static void main(String[] args) {
		
	  int startingSalary;
	  int incrementPercent;
	  int incrementFrequency;
	  int incomeDeduction;
	  int deductionFrequency;
     
      Scanner in = new Scanner(System.in);
     
      System.out.println("Enter starting salary");
      startingSalary = in.nextInt();
     
      System.out.println("Enter increment percentage");
      incrementPercent = in.nextInt();
   
      System.out.println("Enter increment frequency");
      incrementFrequency = in.nextInt();
      
      System.out.println("Enter income deduction");
      incomeDeduction = in.nextInt();
      
      System.out.println("Enter deduction frequncy");
      deductionFrequency = in.nextInt();
		
      if (validateInputs(startingSalary, incrementPercent, incrementFrequency, incomeDeduction, deductionFrequency)) {
    	  
		PredictIncomeMain main = new PredictIncomeMain();
		PredictionInput input = new PredictionInput();
		input.setStartingSalary(new BigDecimal(startingSalary));
		input.setIncrementFrequency(incrementFrequency);
		input.setDeductionFrequency(deductionFrequency);
		input.setIncrementPercent(incrementPercent);
		input.setDeductionInIncome(incomeDeduction);

		main.invokeIncomeReport(input);
      }

	}

	/**
	 * 
	 * @param startingSalary
	 * @param incrementPercent
	 * @param incrementFrequency
	 * @param incomeDeduction
	 * @param deductionFrequency
	 * @return
	 */
	private static boolean validateInputs(int startingSalary, int incrementPercent, int incrementFrequency,
			int incomeDeduction, int deductionFrequency) {
		boolean isValid = true; 
		if (startingSalary < 1) {
			logger.error("Salary cannot be less than 1");
			isValid = false;
		}
		if (incrementPercent < 0 || incomeDeduction < 0) {
			logger.error("Increment and deduction cannot be negative");
			isValid = false;
		}
		if (incrementFrequency < 1 || deductionFrequency < 1) {
			logger.error("Increment and deduction frequencies cannot be less than 1");
			isValid = false;
		}
		return isValid;
	}

}
