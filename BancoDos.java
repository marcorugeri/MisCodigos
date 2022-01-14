package Clases;

import java.util.Scanner;

public class BancoDos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String nombre = "admin", contraseña = "admin123", letra ="s", name, psw, opcion = null;
        boolean choise; 
        int tokenRandom = (int)(Math.random()*999999+1);
		String tkn, token = String.valueOf(tokenRandom);
		while(token.length() < 6) {
             token = "0" + token;}

        System.out.println("Bienvenido a Online Banking, por favor ingrese las credenciales solicitadas: ");

        System.out.println("Su Token generado es: " + token);


        for (int i = 2; i > 0; i--) {
            System.out.print("Introduzca el Usuario: ");
            name = sc.nextLine().toLowerCase();
            System.out.print("Introduzca la Contraseña: ");
            psw = sc.nextLine();
            System.out.print("Ingrese la Clave token: ");
            tkn = sc.nextLine();


            boolean usuarioCorrecto = name.equals(nombre);
            boolean claveCorrecta = psw.equals(contraseña);
            boolean tknCorrecto = token.equals(tkn);


            if(usuarioCorrecto && claveCorrecta && tknCorrecto){
                System.out.println("Credenciales correctas, Bienvenido a su Online Banking");
                break;

            } else if(!usuarioCorrecto && !claveCorrecta && !tknCorrecto){
                System.out.println("Error en credenciales, le queda "+i+" intentos, desea intentarlo de nuevo? (S/N)");
                opcion = sc.nextLine();
                
                
            } else if(choise = opcion.equals(letra)) {
            	
            } else {
            	            	
            	break; 
            } if (i == -1) {
            	System.out.println("Usuario Bloqueado, por favor contacte al banco");
            }
            
  }
            System.out.println("FIN DEL PROGRAMA");
}
}
	
	
