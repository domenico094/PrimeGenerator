package it.unical.PrimeGenerator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	MyMath math = MyMath();
        System.out.println( math.primeNumberGenerator(20) );
    }
}
