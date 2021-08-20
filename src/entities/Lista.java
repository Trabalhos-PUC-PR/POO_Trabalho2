package entities;

import java.util.Arrays;

public class Lista {

	private Double[] vetor;

	public Lista(int pos) {
		// ele instancia o Vetor vetor com o n�mero
		// de posi��es digitadas pelo usu�rio
		this.vetor = new Double[pos];
	}

	public void adicionar(double valor) {
		for (int i = 0; vetor.length > i; i++) {
			// por padr�o um vetor com tipo Double tem seus
			// valores iniciais nulos, quando ele achar um
			// espa�o vazio, o programa insere o valor digitado
			// pelo usuario
			if (vetor[i] == null) {
				vetor[i] = valor;
				return;
				// esse return serve pro programa n�o inserir o valor em todos
				// os espa�os vazios do vetor. E ele n�o da problema
				// por que ele n�o retorna nada, s� pede pra sair do
				// m�todo
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
			// em String, j� que com casting normal n�o funciona :(
			return ("valor: " + vetor[pos].toString());
		} catch (NullPointerException e) {
			// se apontar pra um espa�o null, pegar o erro e trat�-lo
			// retornando a String "�ndice inv�lido"
			return "�ndice inv�lido";
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
		// StringBuilder � uma classe que serve pra concatenar v�rias partes
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
			// se ele n�o ta na ultima posi��o do vetor, incluir a virgula
			// depois do valor
			if (sum + 1 != vetor.length) {
				sb.append(", ");
			}
			sum++;
		}
		sb.append("]");
		return sb.toString();
	}

	// eu s� criei esse outro m�todo pq esse m�todo do Arrays existe
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
