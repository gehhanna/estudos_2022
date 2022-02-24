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
		
		// Stream # foi adicionado a partir da versão 8 do java - prepara um resultado de uma coleção.
		// para poder trabalhar no método stream.
		// function ou expressão lambda passa um parâmetro e retorna algo.
		// ao mesmo tempo que esta criando ele já retorna no mesmo método.
		System.out.println("Lista de nomes: ");
		// expressão lambda para imprimir os nomes que tiverem na lista.
		nomes.forEach((n) -> System.out.println(n));
		System.out.println("\nLista de pessoas: ");
		// esse método do stream e parecido com uma função do js.
		List<Pessoa> pessoas = nomes.stream().map((n) -> new Pessoa (n, gerarIdade(15,30))).collect(Collectors.toList());
		// -> corpo da função.
		pessoas.forEach((p) -> System.out.println(p.getNome() + " " + p.getIdade()));
		System.out.println("Lista de pessoas maiores de idade: ");
		// aqui e criado uma variável pessoasMaioresDeIdade, usasse o método stream e filter para filtrar, por idade maior que 18 anos.
		// e usa o collectors para transformar os dados que foram obtidos em uma lista.
		List<Pessoa> pessoasMaioresDeIdade = pessoas.stream().filter((p) -> p.getIdade() >=18).collect(Collectors.toList());
		pessoasMaioresDeIdade.forEach((p) -> System.out.println(p.getNome() + " " + p.getIdade()));
		
		System.out.println("Lista de pessoas ordenadas: ");
		// aqui usasse uma função para ordenar criando um comparador que e o p1  p2 recebendo as idades e armazenando do menor para o maior 
		// e imprimir esses valores.
		List<Pessoa> pessoasOrdenadas = pessoasMaioresDeIdade.stream().sorted((p1, p2) -> p1.getIdade() - p2.getIdade()).collect(Collectors.toList());
		pessoasOrdenadas.forEach((p) -> System.out.println(p.getNome() + " " + p.getIdade()));
		
		System.out.println("Soma das Idades: ");
		Integer totalIdade = pessoasOrdenadas.stream().map(p -> p.getIdade()).reduce(0,(somaIdade, idade) ->somaIdade += idade);
		System.out.println("Total: " + totalIdade);
	}
	
}