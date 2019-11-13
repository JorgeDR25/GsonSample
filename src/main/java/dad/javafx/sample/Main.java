package dad.javafx.sample;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		boolean comprueba=true;
		
		
		
		Persona p=new Persona();
		
		while(comprueba) {
		try{
			System.out.println("Introduce nombre");
			p.setNombre(entrada.nextLine());
			System.out.println("Introduce apellidos");
			p.setApellidos(entrada.nextLine());
			System.out.println("Introduce edad");
			p.setEdad(entrada.nextInt());
			comprueba=false;
		}catch(Exception Exception) {
			System.out.println("Error, vuelva a introducir los datos");
		}
		}
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
		
		
	}

}
