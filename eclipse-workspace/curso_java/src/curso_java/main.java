package curso_java;

import java.util.Locale;
import java.util.Scanner;


public class main{

	public static void main(String[] args){
		exec03();
	}
	
	public static void exec000() {
		String produto1 = "Computer";
		String produto2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

			System.out.println("Products:");
			System.out.printf(produto1+", which price $ %.2f%n",price1);
			System.out.printf(produto2+", which price is %.2f%n%n",price2);

			System.out.printf("Record: %d years old, code %d and gender %s%n%n",age,code,gender);
			
			System.out.printf("Measure with eight decimal places: %.8f%n",measure);
			System.out.printf("Rounded (three decimal places): %.3f%n",measure);
			Locale.setDefault(Locale.US);
			System.out.printf("US decimal point: %.3f",measure);
			System.out.println();
	}

	public static void exec1() {
		System.out.println("Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma\r\n"
				+ "mensagem explicativa");
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		int resposta = a + b;
		System.out.printf("SOMA: %d",resposta);
		sc.close();
	}
	
	public static void exec2() {
		System.out.println("Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro\r\n"
				+ "casas decimais ");
		
		Locale.setDefault(Locale.US);
		double raio,pi;
		pi = 3.14159;
		Scanner sc = new Scanner(System.in);
		raio = sc.nextDouble();

		double a = pi * Math.pow(raio,2);
		
		System.out.printf("A=%.4f",a);
		sc.close();
	}
	
	public static void exec3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto\r\n"
				+ "de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).");
		
		int a,b,c,d,diff;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diff = (a*b-c*d);
		System.out.printf("DIFERENÇA = %d",diff);
		sc.close();
	}
	
	public static void exec4() {
		System.out.println("Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por\r\n"
				+ "hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas\r\n"
				+ "decimais.");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horas; 
		double salario, valorHora;
		
		numero = sc.nextInt();

		horas = sc.nextInt();

		valorHora = sc.nextDouble();

		
		salario = valorHora * horas;
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f", numero, salario);
		sc.close();
		
		
		
	}
	
	public static void exec5() {
		System.out.println("Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o\r\n"
				+ "código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codPec1, numPec1, codPec2, numPec2;
		double preco1, preco2, diff1, diff2;
		
		codPec1 = sc.nextInt();
		numPec1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		codPec2 = sc.nextInt();
		numPec2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		diff1 = numPec1 * preco1;
		diff2 = numPec2 * preco2;
		
		System.out.printf("VALOR A PAGAR: $ %.2f",diff1+diff2);
		sc.close();
	}
	
	public static void exec6() {
		System.out.println("Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e\r\n"
				+ "mostre:\r\n"
				+ "a) a área do triângulo retângulo que tem A por base e C por altura.\r\n"
				+ "b) a área do círculo de raio C. (pi = 3.14159)\r\n"
				+ "c) a área do trapézio que tem A e B por bases e C por altura.\r\n"
				+ "d) a área do quadrado que tem lado B.\r\n"
				+ "e) a área do retângulo que tem lados A e B.");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a,b,c;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		
		//calc1
		double diff1 =  (a * c) / 2;
		//calc2
		double diff2 = 3.14159 * Math.pow(c, 2);
		//calc3
		double diff3 = (a + b) * c / 2;
		//calc4
		double diff4 = Math.pow(b, 2);
		//calc5
		double diff5 = a * b;
		
		
		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f",
				diff1,diff2,diff3,diff4,diff5);
		sc.close();
	}

	public static void exec01() {
		int senha, sDefault;
		senha = 0;
		sDefault = 2002;
		Scanner sc = new Scanner(System.in);
		System.out.println("manda a senha!");
		while(senha != sDefault) {
			senha = sc.nextInt();
			System.out.println(senha != sDefault ? "Não consegue né?" : "Chama");
		}
		sc.close();
		
	}

	public static void exec02() {
		Scanner sc = new Scanner(System.in);
		int x,y;
		x = sc.nextInt();
		y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			
			if (x>0) {
				System.out.println(y>0?"Primeiro":"Quarto");
			}else
				System.out.println(y>0?"Segundo":"Terceiro");
			x = sc.nextInt();
			y = sc.nextInt();
			
		}
		System.out.println(x == 0 || y == 0?"chama":"");
		sc.close();
	}
	
	public static void exec03() {
		System.out.println("s. Escreva"
				+ "um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma:\r\n"
				+ "1.Álcool \r\n"
				+ "2.Gasolina \r\n"
				+ "3.Diesel\r\n"
				+ "4.Fim)");
		int chama,opt1=0,opt2=0,opt3=0;
		Scanner sc = new Scanner(System.in);
		chama = sc.nextInt();
		while(chama > 0 && chama < 4) {
			switch (chama) {
			case 1: opt1 += 1;break;
			case 2: opt2 += 1;break;
			case 3: opt3 += 1;break;
			default:
				break;
			}
			System.out.printf("MUITO OBRIGADO%nAlcool: %d%nGasolina: %d%nDisel: %d%n",opt1,opt2,opt3);
			chama = sc.nextInt();

		}
		System.out.println("chama saiu");
	}
	
	
}

