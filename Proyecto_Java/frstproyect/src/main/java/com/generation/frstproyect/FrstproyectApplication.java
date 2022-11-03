package com.generation.frstproyect;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;

import org.springframework.asm.Label;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.frstproyect.models.Perro;
import com.generation.frstproyect.models.Botella;
import com.generation.frstproyect.models.Frasco;
import com.generation.frstproyect.models.Lata;
import com.generation.frstproyect.models.Parlante;


@SpringBootApplication
public class FrstproyectApplication {

	public static void main(String[] args) {
		/*Perro perroDefault = new Perro();// Creación de perro con el constructor por defecto
		Perro perroCompleto = new Perro("Max","rulos","Salchicha",true);
		Perro perroQuiltro  = new Perro("Pelusa","Liso");

		perroDefault.setNombre("copi-copi");
		perroDefault.setPelaje("Pelo duro");
		perroDefault.setRaza("Gucci");
		perroDefault.setVacunado(true);

		System.out.println(perroDefault.getNombre());

		System.out.println("Perro por default: "+perroDefault.toString());
		System.out.println("Perro completo: "+perroCompleto.toString());
		System.out.println("Perro quiltro: "+perroQuiltro.toString());

		perroDefault.ladrar();
		perroCompleto.caminar();
		System.out.println(perroQuiltro.truco("da la pata"));
		System.out.println(perroCompleto.adopcion());
		System.out.println(perroQuiltro.adopcion());*/

		/*Parlante parlanteDefault = new Parlante();

		Parlante parlante1 = new Parlante("Master-G","Ultraforce 1","Negro con rojo",60);
		parlante1.setColor("Negro con azul");

		Parlante parlante2 = new Parlante("JBL","GO2","Azul",7);
		String color2 =parlante2.getColor();
		String marca2 = parlante2.getMarca();
		String modelo2 = parlante2.getModelo();

		System.out.println("Parlante default: "+parlanteDefault.toString());

		System.out.println("Parlante 1: "+parlante1.toString());

		System.out.println("Parlante 2: "+parlante2.toString());

		System.out.println("Características del parlante 2: "+color2+","+marca2+" y "+modelo2);

		parlanteDefault.setMarca("Samsung");
		parlanteDefault.setModelo("Sound Tower MX-T40");
		parlanteDefault.setColor("Negro");
		parlanteDefault.setTamano(53);

		System.out.println("Parlante default llenado: "+parlanteDefault.toString());*/

		/*Console console = System.console();
		// Contador será nuestra var que nos dirá cuantos objetos vamos a crear
		Integer contador = Integer.parseInt(console.readLine("Ingrese la cantidad de botellas que desea agregar"));
		// Creamos un hashMap, donde nuestra clave será la botella y el valor el objeto ( las características de la botella en este caso)
		Map <String,Botella> jabaBotella = new HashMap<>();
		// Iteramos nuestro contador para ingresar las características
		for (int i =1;i<=contador;i++){
			//Creamos el objeto "botella" vacío para poder ingresar las características
			Botella botella = new Botella();
			System.out.println("Ingrese los datos de la botella número "+i+": \n");
			// Con el método set, ingresamos los valores a nuestra botella
			botella.setLiquido(console.readLine("Ingrese el contenido de la botella: "));
			botella.setMarca(console.readLine("Ingrese la marca de la botella: "));
			botella.setMaterial(console.readLine("Ingrese el material de la botella: "));
			botella.setmL(Integer.parseInt(console.readLine("Ingrese la capacidad de la botella en ml: ")));
			// Ingresamos la botella y el número como clave, y las características de la botella como valor
			jabaBotella.put("Botella "+i,botella);
			System.out.println("------------------------------------------------------------------");*/

			

		//}	
		//System.out.println(jabaBotella);


		Botella botella = new Botella();
		System.out.println("Botella 1: "+botella);
		Botella botella2 = new Botella("Plástico",300,"Bebida","Tapa rosca");
		System.out.println("Botella 2: "+botella2+"\n");
		botella.contener();
		botella.usoBotella();

		System.out.println("-----------------------------------------");	

		Frasco frasco = new Frasco();
		System.out.println("Frasco 1: "+frasco);
		Frasco frasco2 = new Frasco("Vidrio",1000,"Arroz","Cubica");
		System.out.println("Frasco 2: "+frasco2+"\n");
		frasco.contener();
		frasco.usoFrasco();

		System.out.println("-----------------------------------------");	
		
		Lata lata = new Lata();
		System.out.println("Lata 1: "+lata);
		Lata lata2 = new Lata("Aluminio",450,"Palmitos",true);
		System.out.println("Lata 2: "+lata2+"\n");
		lata.contener();
		lata.usoLata();


	}

}
