package lambdaStefanini;

import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;
import java.util.stream.Collectors;

public class LambdaStream {
	
	static int gerarIdade(int min, int max) {
		return new SplittableRandom().nextInt(min, max);
	}

	public static void main(String[] args) {
		// aqui e criado um arrayList com os nomes de pessoas.
		List<String> nomes = Arrays.asList("Alice", "Joao", "Maria", "Pedro", "Raquel", "Samuel");
		
		// Stream # foi adicionado a partir da vers�o 8 do java - prepara um resultado de uma cole��o.
		// para poder trabalhar no m�todo stream.
		// function ou express�o lambda passa um par�metro e retorna algo.
		// ao mesmo tempo que esta criando ele j� retorna no mesmo m�todo.
		System.out.println("Lista de nomes: ");
		// express�o lambda para imprimir os nomes que tiverem na lista.
		nomes.forEach((n) -> System.out.println(n));
		System.out.println("\nLista de pessoas: ");
		// esse m�todo do stream e parecido com uma fun��o do js.
		List<Pessoa> pessoas = nomes.stream().map((n) -> new Pessoa (n, gerarIdade(15,30))).collect(Collectors.toList());
		// -> corpo da fun��o.
		pessoas.forEach((p) -> System.out.println(p.getNome() + " " + p.getIdade()));
		System.out.println("Lista de pessoas maiores de idade: ");
		// aqui e criado uma vari�vel pessoasMaioresDeIdade, usasse o m�todo stream e filter para filtrar, por idade maior que 18 anos.
		// e usa o collectors para transformar os dados que foram obtidos em uma lista.
		List<Pessoa> pessoasMaioresDeIdade = pessoas.stream().filter((p) -> p.getIdade() >=18).collect(Collectors.toList());
		pessoasMaioresDeIdade.forEach((p) -> System.out.println(p.getNome() + " " + p.getIdade()));
		
		System.out.println("Lista de pessoas ordenadas: ");
		// aqui usasse uma fun��o para ordenar criando um comparador que e o p1  p2 recebendo as idades e armazenando do menor para o maior 
		// e imprimir esses valores.
		List<Pessoa> pessoasOrdenadas = pessoasMaioresDeIdade.stream().sorted((p1, p2) -> p1.getIdade() - p2.getIdade()).collect(Collectors.toList());
		pessoasOrdenadas.forEach((p) -> System.out.println(p.getNome() + " " + p.getIdade()));
		
		System.out.println("Soma das Idades: ");
		Integer totalIdade = pessoasOrdenadas.stream().map(p -> p.getIdade()).reduce(0,(somaIdade, idade) ->somaIdade += idade);
		System.out.println("Total: " + totalIdade);
	}
	
}