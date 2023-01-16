package ej01_RuizMedina_Barbara;

import java.util.Scanner;

public class Ej01_IMC {

	public static void main(String[] args) {
		// Cálculo de índice de masa corporal de los pacientes. 
		
		System.out.println("EL programa determinará el IMC de los pacientes e indicará el estado en que se encuentra en función de su valor.");
		
		Scanner teclado = new Scanner (System.in);
		
		double peso = 0;
		double altura = 0;
		
		System.out.println("Introduzca el peso del paciente, en kg:");
		peso = teclado.nextDouble();
		System.out.println("Introduzca la altura del paciente, en metros:");
		altura = teclado.nextDouble();
		
		double imc = 0;
		imc = peso / (Math.pow(altura, 2));
		String resultado = "";
		
		if (imc <= 0) { 
			System.err.println("Error. El IMC calculado no puede ser negativo. Revise los datos e inicie de nuevo el procedimiento."); 
			System.exit(-1); //control de error, sale del programa
			}
		
		//considero que, en los intervalos, el valor mínimo es menor o igual y el máximo es menor.
		if (imc <= 18.5) {
			resultado = "'bajo peso'.";
		} else if (imc <= 24.9) {
			resultado = "'peso normal (saludable)'.";
		} else if (imc <= 29.9) {
			resultado = "'sobrepeso'.";
		} else if (imc <= 40) {
			resultado = "'obesidad premórbida'.";
		} else {
			resultado = "'obesidad mórbida'.";
		}
		System.out.printf("El paciente de %.2f kg y %.2fm de altura tiene un IMC de %.2f, con un diagnóstico de %s", peso, altura, imc, resultado);
		
		teclado.close();
	}
}
