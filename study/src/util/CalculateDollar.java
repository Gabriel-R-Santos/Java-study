package util;

public class CalculateDollar {
	public static final double VAL_IOF = 6;
	public double valueDoller;
	public double quantyti;
	
	public String toString() {		
		double sumValue = (valueDoller * quantyti) + (((valueDoller * quantyti) * VAL_IOF)/ 100);
		return "Amount to be paid in reais = "+String.format("%.2f", sumValue) ;	
		
	}

}
