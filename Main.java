package desafioTargetSistemas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Resolução da questão 1

		System.out.println("Resolução da questão 1");

		// Declaração de variáveis

		int indice = 13;
		int soma = 0;
		int k = 0;

		// Construindo o laço de repetição while

		while (k < indice) {

			k += 1;

			soma += k;
		}

		// Retornando o resultado da soma de 1 a 13

		System.out.println("o valor da variável soma é: " + soma);

		System.out.println("----------------------------------------------------------------------------------------");

		System.out.println("Resolução da questão 2");

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int entrada = scan.nextInt();

		scan.close();

		int primeiroNumero = 0;
		int segundoNumero = 1;
		int proximoNumero = 0;
		boolean pertence = false;

		while (proximoNumero <= entrada) {
			if (proximoNumero == entrada) {
				pertence = true;
				break;
			}
			proximoNumero = primeiroNumero + segundoNumero;
			primeiroNumero = segundoNumero;
			segundoNumero = proximoNumero;
		}

		if (pertence) {
			System.out.println("O número " + entrada + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println("O número " + entrada + " não pertence à sequência de Fibonacci.");
		}
		
		System.out.println("----------------------------------------------------------------------------------------");
		
		System.out.println("Resolução da questão 3");
		
		
		System.out.println("Letra a)");
		
		
		System.out.println("Essa sequência é uma progressão aritmética de razão igual a 2, sendo assim, o próximo número é 9");
		
		
		System.out.println("Letra b)");
		
		
		System.out.println("Essa sequência é uma progressão geométrica de razão igual a 2, sendo assim, o próximo número é 128");
		
		System.out.println("Letra c)");
		
		
		System.out.println("A lógica é elevar a posição do número anterior, sendo assim o próximo número é 49");
		
		System.out.println("Letra d)");
		
		System.out.println("A lógica é multiplicar posição do próximo número por 2 e elevar ao quadrado, sendo assim, o proximo número é 100");
		
		System.out.println("Letra e)");
		
		System.out.println("A lógica é a da sequência de fibonacci, ou seja, o próximo número é igual a soma dos dois números anteriores, sendo assim,"
				+ " o próximo número é 13");
		
		
		System.out.println("Letra d)");
		
		System.out.println("a lógica dessa sequência é que a partir do quarto se adiciona 1 ao número atual, sendo assim, o próximo número é 20");
		
		System.out.println("----------------------------------------------------------------------------------------");
		
		
		System.out.println("Resolução da questão 4");
		
		
		System.out.println("Como os dois veículos estão saindo de cidades opostas em uma mesma rodovia, ao se cruzarem nesta rodovia,"
				+ " os dois estarão na mesma distância de ribeirão preto, só que o carro se afastando e o caminhão se aproximando");
		
		
		System.out.println("----------------------------------------------------------------------------------------");
		
		
		System.out.println("Resolução da questão 5");
		
        String entradaNormal = "exemplo";
        
        String entradaInvertida = "";
        for (int i = entradaNormal.length() - 1; i >= 0; i--) {
            entradaInvertida += entradaNormal.charAt(i);
        }
        
        System.out.println("String invertida: " + entradaInvertida);
		
	}
		

}
