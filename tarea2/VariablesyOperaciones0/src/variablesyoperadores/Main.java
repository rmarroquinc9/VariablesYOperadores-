package variablesyoperadores;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("====INGRESO DE VARIABLES===");
		
		System.out.println("Ingrese un numero entero");
		 int numeroEntero = sc.nextInt();
		 
		 
		System.out.println("Ingrese un número decimal");
		double numeroDecimal = sc.nextDouble();
		
		sc.nextLine();

		System.out.println("Ingrese un texto");
		String texto = sc.nextLine();
		
		System.out.print("Ingrese true o false: ");
		boolean valorBooleano = sc.nextBoolean();
		
		System.out.println("\nValores ingresados:");
		System.out.println("Entero: " + numeroEntero);
		System.out.println("Decimal: " + numeroDecimal);
		System.out.println("Texto:" + texto);
		System.out.println("Booleano;" + valorBooleano);
		
		System.out.println("\n==OPERACIONES CON INT===");
		
		System.out.println("Ingrese  primer número entero:");
		int a = sc.nextInt();
		
		System.out.println("Ingrese segundo número entero: ");
		int b =sc.nextInt();
		
		System.out.println("Suma: " + (a + b));
		System.out.println("Resta: " + (a - b));
		System.out.println("Multiplicación: " + (a * b));
		System.out.println("División" + (a / b));
		
		
		System.out.println("\nDivisión entre enteros NO muestra decimales por que ambos operados sin int.");
		
		System.out.println("\n==OPERACIONES DE DOUBLE==");
		 double da = a;
		 double db = b;
		 System.out.println("División float" + (da / db));
		 
		 System.out.println("\n==OPERACIONES CON FLOAT==");
		 float fa = a;
		 float fd = b;
		 System.out.println("División float:" + (fa / fd));
		 
		 
		 System.out.println("\n==OPERACIONES CON SHORT==");
		 short sa = (short) a;
		 short sb = (short) b;
		 System.out.println("Suma short:" + (sa + sb));
		 
		 System.out.println("\n==OPERACIONES CON BYTE==");
		 byte ba = (byte) a;
		 byte bb = (byte) b;
		 
		 System.out.println("Suma byte: " + (ba + bb));
		 
		 System.out.println("\n==OPERACIONES LÓGICAS==");
		 
		 System.out.println("Ingrese primer número: ");
		 int n1 = sc.nextInt();
		 
		 System.out.println("Ingrese segundo número: ");
		 int n2 = sc.nextInt();
		 
		 
		 System.out.println("¿n1 > n2? " + ( n1 > n2 ));
		 System.out.println("¿n1 < n2 " + ( n1 < n2));
		 System.out.println("¿n1 == n2? " + (n1 == n2) );
		 System.out.println("ADN  (n1>0 && n2>0):" + (n1 > 0 && n2 > 0));
		 System.out.println("OR (n1>0 || n2>0): " + (n1 > 0 || n2 > 0));
		 
		 
		 System.out.println("Ingrese su edad: ");
		 int edad = sc.nextInt();
		 
		 if (edad < 12)
			 System.out.println("Niñi");
		 else if (edad <= 17)
			 System.out.println("Adolecente");
		 else if (edad <= 59)
			 System.out.println("Adulto");
		 else 
			 System.out.println("Adulto mayor ");
		 
		 System.out.println("\n==DÍA DE LA SEMANA==");
		 int dia = sc.nextInt();
		 
		 switch (dia) {
		 case 1: System.out.println("Lunes"); break;
		 case 2: System.out.println("Martes"); break;
		 case 3: System.out.println("Miércoles"); break;
		 case 4: System.out.println("Jueves"); break;
		 case 5: System.out.println("Viernes"); break;
		 case 6: System.out.println("Sábado"); break;
		 case 7: System.out.println("Domingo"); break;
		 default: System.out.println("Número invalido");
		 

		 }
		 
		 System.out.println("\n==LOGIN=6☺");
	
		 sc.nextLine();
		 
		 System.out.print("Usuario: ");
		 String user = sc.nextLine();
		 
		 System.out.print("Contraseña");
		 String pass = sc.nextLine();
		 
		 String usuarioCorrecto = "admin";
		 String contraseñaCorrecta = "1234";
		 
		 if (!user.equals(usuarioCorrecto))
	            System.out.println("Usuario no registrado");
	        else if (!pass.equals(contraseñaCorrecta))
	            System.out.println("Contraseña incorrecta");
	        else
	            System.out.println("Acceso concedido");

	        sc.close();
		 

	}

}
