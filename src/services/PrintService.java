package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
	
	List<Integer> list = new ArrayList<Integer>();//Lista genérics
	
	public void addValue(Integer value) {//Que recebe um valor inteiro e add. na lista.
		list.add(value);
		
	}
	
	public Integer first() {//Devolve o primeiro elemento que está armazenado no print service
		if(list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		
		return list.get(0);
		
	}
	
	public void print() {
		System.out.print("[");
		if(!list.isEmpty()) {
			System.out.print(list.get(0)); //primeiro elemento
		}
		
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]"); //Aqui, fecha o colchetes
	}

}
