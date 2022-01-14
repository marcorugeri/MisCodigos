package app.java;
import java.util.Scanner;
 

public class BancoUno {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String nombre = "admin", contraseña = "admin123", letra ="s", opcion, name, psw;
		int tokenRandom = (int)(Math.random()*999999+1);
		String tkn, token = String.valueOf(tokenRandom);
		while(token.length() < 6) {
             token = "0" + token;}
        byte contador = 3;
		
			
			System.out.println("\t Bienvenido al sistema bancario");		
		
			System.out.println("Su token generado es: "+token);
		
			System.out.print("Por favor introduzca su nombre: ");
				name = sc.nextLine().toLowerCase();
		
			System.out.print("Por favor introduzca su ContraseÃ±a: ");
				psw = sc.nextLine();
				
			System.out.print("Por favor introduzca su token: ");
				tkn = sc.nextLine();
			
		while (!(nombre.equals(name)) || !(contraseña.equals(psw)) || !(token.equals(tkn))){ 
	            
				System.out.println ("Datos invalidos, quedan "+contador+" intentos, Desea volver a intentarlo (S/N)");
				opcion = sc.nextLine();
				boolean choise = letra.equals(opcion); 
				          	
				if(choise){
				
				System.out.print("Por favor introduzca su nombre: ");
					name = sc.nextLine().toLowerCase();
	    		
	    		System.out.print("Por favor introduzca su ContraseÃ±a: ");
	    			psw = sc.nextLine();
	    		
	    		System.out.print("Por favor introduzca su token: ");
	    			tkn = sc.nextLine();
	    			contador --;
	                	
	             if (contador <= 0){
	                System.out.println("cuenta bloqueada, contacte al banco");
	                break;}
				}else
					break;
			}
	               
	     if (nombre.equals(name) && contraseña.equals(psw) && (token.equals(tkn))){
	        	   
	        	    System.out.println("Bienvenido al Online Banking");
	        	    
	        }
	           System.out.println("FIN DEL PROGRAMA");
		}
	        
	}				


			
		
	
	
	
	
		
		