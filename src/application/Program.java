package application;

import entities.Lista;

public class Program {

	public static void main(String[] args) {

		// Cria uma lista que poder� conter no m�ximo 10 n�meros
		Lista lista = new Lista(10);

		lista.adicionar(5); // Adiciona o n�mero 5 ao final da lista
		lista.adicionar(10.3); // Adiciona o n�mero 10.3 ao final da lista

		// Imprime 2, j� que � a quantidade de n�meros j� inseridos
		System.out.println("tamanho: " + lista.tamanho());

		// Imprimindo os elementos da lista
		for (int i = 0; i < lista.tamanho(); i++) {
			System.out.println("elemento " + i + " valor " + lista.get(i));
		}

		// Imprime ��ndice inv�lido�
		System.out.println(lista.get(2));

		// Adiciona -10 ao final da lista
		lista.adicionar(-10);

		// Imprime -10
		System.out.println(lista.get(2));

		lista.set(1, 1000); // Troca o valor 10.3, no �ndice 1, por 1000

		lista.limpar(); // Remove todos os elementos da lista

		lista.remove(2);

		System.out.println(lista.imprimir());

		System.out.println("Vazia? " + lista.estaVazia());
		System.out.println("Cheia? " + lista.estaCheia());

		/* Bonus:
		 * 
		 * 1. Adicione um m�todo remover que retira um n�mero de um �ndice v�lido da
		 * lista. Por exemplo, se a lista contiver os valores [0, 10, 5, 100] o comando
		 * lista.remove(2) deixaria a lista com os valores [0, 5, 100]
		 * 
		 * 2. Crie um m�todo imprimir() que imprima os n�meros da lista entre colchetes
		 * e separados por v�rgulas, sempre com 2 casas decimais. Ex. [0, 5, 100]
		 * 
		 * 3. Adicione os m�todos estaVazia() e estaCheia() que indica esses status a
		 * respeito da lista
		 * 
		 * 4.Certifique-se que voc� encapsulou corretamente sua lista.
		 * 
		 */

	}

}
