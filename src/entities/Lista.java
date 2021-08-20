package entities;

import java.util.Arrays;

public class Lista {

	private Double[] vetor;

	public Lista(int pos) {
		// ele instancia o Vetor vetor com o número
		// de posições digitadas pelo usuário
		this.vetor = new Double[pos];
	}

	public void adicionar(double valor) {
		for (int i = 0; vetor.length > i; i++) {
			// por padrão um vetor com tipo Double tem seus
			// valores iniciais nulos, quando ele achar um
			// espaço vazio, o programa insere o valor digitado
			// pelo usuario
			if (vetor[i] == null) {
				vetor[i] = valor;
				return;
				// esse return serve pro programa não inserir o valor em todos
				// os espaços vazios do vetor. E ele não da problema
				// por que ele não retorna nada, só pede pra sair do
				// método
			}
		}
	}

	public int tamanho() {
		int sum = 0;
		for (int i = 0; vetor.length > i; i++) {
			if (vetor[i] != null) {
				sum++;
			}
		}
		return sum;
	}

	public String get(int pos) {
		try {
			// .toString() serve pra converter o valor do tipo Double
			// em String, já que com casting normal não funciona :(
			return ("valor: " + vetor[pos].toString());
		} catch (NullPointerException e) {
			// se apontar pra um espaço null, pegar o erro e tratá-lo
			// retornando a String "índice inválido"
			return "índice inválido";
		}

	}

	public void set(int pos, double valor) {
		vetor[pos] = valor;
	}

	public void limpar() {
		for (int i = 0; vetor.length > i; i++) {
			vetor[i] = null;
		}

	}

	public void remove(int pos) {
		try {
			vetor[pos] = null;
		} catch (NullPointerException e) {
			return;
		}
	}

	public String imprimir() {
		// StringBuilder é uma classe que serve pra concatenar várias partes
		// de um String, eu usei ela mais pela eficiencia, concatenar com uma
		// String normal funciona do mesmo jeito
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		int sum = 0;
		for (Double a : vetor) {
			if (a == null) {
				sb.append(a);
			} else {
				// String.format formata de acordo com o que ta entre aspas
				// no caso numeros decimais devem ter 2 casas
				sb.append(String.format("%.2f", a));
			}
			// se ele não ta na ultima posição do vetor, incluir a virgula
			// depois do valor
			if (sum + 1 != vetor.length) {
				sb.append(", ");
			}
			sum++;
		}
		sb.append("]");
		return sb.toString();
	}

	// eu só criei esse outro método pq esse método do Arrays existe
	public String imprimir(String facil) {
		return Arrays.toString(vetor);
	}

	public boolean estaVazia() {
		int sum = 0;
		for (Double a : vetor) {
			if (a == null) {
				sum++;
			}
		}
		if (sum == vetor.length) {
			return true;
		}
		return false;
	}

	public boolean estaCheia() {
		int sum = 0;
		for (Double a : vetor) {
			if (a != null) {
				sum++;
			}
		}
		if (sum == vetor.length) {
			return true;
		}
		return false;
	}

}
