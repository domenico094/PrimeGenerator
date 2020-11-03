package it.unical.PrimeGenerator;

import java.util.LinkedList;
import java.util.List;

public class MyMath {
	
	public MyMath() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Integer> primeNumberGenerator(int n)	{
		List<Integer> primeNumbers = new LinkedList<Integer>();
		if(n>=2) {
			primeNumbers.add(2);
			System.out.println("Modifica");
		}
		for(int i = 3; i <=n; i+=2)	{
			if(IsPrime(1)) {
				primeNumbers.add(i);
			}
		}
		
		return primeNumbers;
	}
	
	public boolean IsPrime(int number) {
		if(number < 2)	{
			return false;
		}
		
		for(int i = 2; i*i < number; i++) {
			if(number % i == 0)	{
				return false;
			}
		}
		return true;
	}
	
}
