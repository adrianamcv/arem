package arem;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class promedio {
	public static void main(String[] args) {
		int EPS;
        double DH;

        File f = new File("C:\\Users\\marce\\Desktop\\numeros.txt");

        try  (Scanner entrada = new Scanner(f)) {

            System.out.println("EPS: ");

            while (entrada.hasNextInt()) { 
               EPS = entrada.nextInt(); 
               System.out.print(EPS + " ");  
            }
            
            System.out.println(" ");
            System.out.println("DH: ");

            while (entrada.hasNextDouble()) { 
                DH = entrada.nextDouble();
                System.out.print(DH + " ");   
            }
        } 
        
        catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } 
        
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
	public static double promedio ( int [ ] ESP) {
		double prom = 0.0;
		for (int i=0;i<11;i++) {
			prom += ESP[i];
		}
	}
	public static double desviacion ( int [ ] ESP ) {
	    double prom, sum = 0; int i, n = ESP.length;
	    prom = promedio ( ESP );
	    for ( i = 0; i < n; i++ ) 
	      sum += Math.pow ( ESP [ i ] - prom, 2 );
	    return Math.sqrt ( sum / ( double ) n );
	  }
	
	
	}

