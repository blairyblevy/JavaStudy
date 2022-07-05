public class App1 {

	public static void main(String[] args) {
		
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expensRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double expense = valueOfSupply * expensRate;
		double income = valueOfSupply - expense ;
		double devidend1 = income * 0.5;
		double devidend2 = income * 0.3;
		double devidend3 = income * 0.2;
		
		
		System.out.println("ValueOfSupply : "+ valueOfSupply);
		System.out.println("Vat : " + vat);		
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		System.out.println("Devidend 1 = " + devidend1);
		System.out.println("Devidend 2 = " + devidend2);
		System.out.println("Devidend 3 = " + devidend3);
		
		
}
