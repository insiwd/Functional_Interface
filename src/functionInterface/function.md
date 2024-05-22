## Functional interface - Function

 Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.

```java 
package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
  public static void main(String[] args) {
  
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // Usar a Function com expressão lambda para dobrar todos os números
    // Quando criamos uma Function, devemos informar o tipo da entrada e saída
    // Podemos pegar esse Integer e transformar em Double/String também
    // 'dobrar' é o nome da variável
    // LAMBDA: tem o argumento (numero) e resultado -> (numero), 
								 // multiplicado por 2 !    
    Function<Integer, Integer> dobrar = numero -> numero * 2;


    // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
	List<Integer> numerosDobrados = numeros.stream()
//       recebendo um argumento tipo T (tipo integer) e retornando o mesmo tipo, só que multiplicado por 2. 
        .map(n -> n * 2) // mapear de um valor para outro valor
        .toList(); // depois guardando em uma lista

    // Imprimir a lista de números dobrados
    numerosDobrados.forEach(System.out::println);
  }
}
```