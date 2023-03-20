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


		System.out.println("Digite a numeração referente a opção que deseja");
		System.out.println("1 - Compra");
		System.out.println("2 - Venda");
		System.out.println("3 - Assitência");
		opcaoGeral = sc.nextInt();
		
		switch(opcaoGeral) {
			case 1:
				System.out.println("Que tipo de produto você deseja comprar:");
				opcaoCompra = sc.nextInt();
					switch(opcaoCompra) {
						case 1:
							System.out.println("Você deseja comprar produtos novos:");
						break;
						
						case 2:
							System.out.println("Você deseja comprar produtos usados:");
						break;	
						
						default:
						System.out.println("Opção inválida:");
						
					}
			break;
			
			case 2:
				System.out.println("Você deseja vender");
				opcaoVenda = sc.nextInt();
					switch(opcaoVenda) {
						case 1:
							System.out.println("Você deseja vender produtos novos:");
						break;
						
						case 2:
							System.out.println("Você deseja vender produtos usados:");
						break;	
						
						default:
						System.out.println("Opção inválida:");
					
				}
	
			break;
			
			case 3:
				System.out.println("Para qual produto você deseja assitência:");
				opcaoAssistencia = sc.nextInt();
					switch(opcaoAssistencia) {
						case 1:
							System.out.println("Você deseja assistência para produtos novos:");
						break;
						
						case 2:
							System.out.println("Você deseja assistência produtos usados:");
						break;	
						
						default:
						System.out.println("Opção inválida:");

				
			}
			break;
			
			default:	
				System.out.println("Opção inválida:");

		}
	}
}
