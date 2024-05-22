## Functional interface - Consumer Interface 
- Representa uma operação que aceita um argumento do tipo T, e não retorna nenhum resultado
- É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream, sem modificar ou retornar um valor.

--> implementando um consumer

```java
(MAIN)

// 1 criamos uma lista de números inteiros
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

// 2 imprimir os números pares no Stream usando lambda expression e forEach
numeros.forEach(n -> {
	if (n % 2 == 0) {
		sout(n);
	}
});
```

