package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int opcaoGeral = 0;
		int opcaoCompra = 0;
		int opcaoVenda = 0;
		int opcaoAssistencia = 0;


		System.out.println("Digite a numera��o referente a op��o que deseja");
		System.out.println("1 - Compra");
		System.out.println("2 - Venda");
		System.out.println("3 - Assit�ncia");
		opcaoGeral = sc.nextInt();
		
		switch(opcaoGeral) {
			case 1:
				System.out.println("Que tipo de produto voc� deseja comprar:");
				opcaoCompra = sc.nextInt();
					switch(opcaoCompra) {
						case 1:
							System.out.println("Voc� deseja comprar produtos novos:");
						break;
						
						case 2:
							System.out.println("Voc� deseja comprar produtos usados:");
						break;	
						
						default:
						System.out.println("Op��o inv�lida:");
						
					}
			break;
			
			case 2:
				System.out.println("Voc� deseja vender");
				opcaoVenda = sc.nextInt();
					switch(opcaoVenda) {
						case 1:
							System.out.println("Voc� deseja vender produtos novos:");
						break;
						
						case 2:
							System.out.println("Voc� deseja vender produtos usados:");
						break;	
						
						default:
						System.out.println("Op��o inv�lida:");
					
				}
	
			break;
			
			case 3:
				System.out.println("Para qual produto voc� deseja assit�ncia:");
				opcaoAssistencia = sc.nextInt();
					switch(opcaoAssistencia) {
						case 1:
							System.out.println("Voc� deseja assist�ncia para produtos novos:");
						break;
						
						case 2:
							System.out.println("Voc� deseja assist�ncia produtos usados:");
						break;	
						
						default:
						System.out.println("Op��o inv�lida:");

				
			}
			break;
			
			default:	
				System.out.println("Op��o inv�lida:");

		}
	}
}
