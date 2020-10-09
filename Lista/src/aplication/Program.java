 package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); // Adicinado elemento na posição 2
		
		System.out.println(list.size()); // imprimi o tamanho da lista
		
		
		for(String x : list) {
			System.out.println(x);
			
		}
		
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); 
		
		// filtramas a lista com nomes que inician com a letra A
		// convertida para Stream,  filtramos o predicado
		// fizemos a operação lambda
		// em seguida convertemos novamente para lista comcomando collect
		
		System.out.println("-----------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		// comando que localiza o primeiro elemento que começa com a letra A a lista
		// comando orElse, caso não identifiqyue a letra A na lista retorna nulo
		
		System.out.println(name);
		System.out.println("-----------------");

		
		
		
		for (String x : result) {
			System.out.println(x);
			
		}
			 
		list.remove("Anna"); // A liste tem uma operação que remover dados a partir da compração
		list.remove(1); // remoção do dado da posição 1 da lista
		list.removeIf(x -> x.charAt(0) == 'M');// Remoção por predicado, remove o elemento da lista que começa com a letra M
		
		
		
		
		
		System.out.println("-----------------");

		
		for (String x : list) {
		System.out.println(x);
		}
		System.out.println("-----------------");
		
		System.out.println("Index of Bobo " + list.indexOf("Bob"));// Comando index encontra a posição do elemento
		System.out.println("Index of Marco" + list.indexOf("Marco"));// Qando o elemento não é encontrado, seu resultado é -1
	}
}