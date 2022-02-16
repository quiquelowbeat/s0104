package n1exercici1;

import java.util.ArrayList;

public class MonthsClass {
	
	private ArrayList<String> arrayMonth;
	
	public MonthsClass() {
		
		arrayMonth = new ArrayList<String>();
		
		arrayMonth.add("Enero");
		arrayMonth.add("Febrero");
		arrayMonth.add("Marzo");
		arrayMonth.add("Abril");
		arrayMonth.add("Mayo");
		arrayMonth.add("Junio");
		arrayMonth.add("Julio");
		arrayMonth.add("Agosto");
		arrayMonth.add("Septiembre");
		arrayMonth.add("Octubre");
		arrayMonth.add("Noviembre");
		arrayMonth.add("Diciembre");
	
	}
	
	public int getSize() {
		
		return this.arrayMonth.size();
		
	}
	
	public boolean arrayIsEmpty() {
		
		return (this.arrayMonth.isEmpty()) ? true : false;
		
	}
	
	public String getAugust() {
		
		return this.arrayMonth.get(7);
		
	}
	
	
	
	
}
