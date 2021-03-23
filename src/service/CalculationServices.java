package service;

import java.util.List;

public  class CalculationServices {
	
	public static Integer max(List<Integer> lista)  {
		if(lista.isEmpty()) {
			throw new IllegalStateException("Lista Vazia");
			
		}
		Integer max=0;
		for(Integer x: lista) {
			if(x.compareTo(max)>0) {
				max=x;
				
			}
			
		}
	
		return max;
		
		
	}

}
