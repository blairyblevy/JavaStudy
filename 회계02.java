public class App2 {

	public static void main(String[] args) {
		
		
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expensRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double expense = valueOfSupply * expensRate;
		double income = valueOfSupply - expense ;
		
		
		double devidend1;
		double devidend2;
		double devidend3;
		
		if(income > 10000.0) {
			devidend1 = income * 0.5;
			devidend2 = income * 0.3;
			devidend3 = income * 0.2;
		} else {
			devidend1 = income * 1.0;
			devidend2 = income * 0;
			devidend3 = income * 0;
		}
		
		System.out.println("ValueOfSupply : "+ valueOfSupply);
		System.out.println("Vat : " + vat);		
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		System.out.println("Devidend 1 = " + devidend1);
		System.out.println("Devidend 2 = " + devidend2);
		System.out.println("Devidend 3 = " + devidend3);

}
