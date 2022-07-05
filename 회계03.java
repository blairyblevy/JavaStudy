public class ArrayApp {

	public static void main(String[] args) {				
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expensRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double expense = valueOfSupply * expensRate;
		double income = valueOfSupply - expense ;
		
		//변수가 많아지면 실수할 확률이 높아진다 --> 배열 사용!
		double[] devidendRates = new double[3];
		devidendRates[0] = 0.5;
		devidendRates[1] = 0.3;
		devidendRates[2] = 0.2;
		
		double devidend1 = income * devidendRates[0];
		double devidend2 = income * devidendRates[1];
		double devidend3 = income * devidendRates[2];
		
	
		
		
		System.out.println("ValueOfSupply : "+ valueOfSupply);
		System.out.println("Vat : " + vat);		
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		System.out.println("Devidend 1 = " + devidend1);
		System.out.println("Devidend 2 = " + devidend2);
		System.out.println("Devidend 3 = " + devidend3);
		
		
		
		
		

	}

}
