## Functional interface - Supplier 
-> supplier não recebe nenhum argumento, mas retorna um resultado do mesmo tipo passado
-> usada pra criar ou fornecer novos objetos de um determinado tipo


`Supplier<String> saudacao = () -> "Olá, seja bem vindo";` 
 - usamos arrow function que nem em js hauhauah
###### -> Usando Supplier para obter uma lista com 5 saudações
```java
	
// usamos Supplier com expressão Lambda para fornecer uma saudação personalizada.
Supplier<String> saudacao = () -> "Olá, seja bem vindo"

// usando Supplier para ter uma lista com 5 saudações
List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem vindo")
	.limit(3) // max-size
	.toList(); // manda pra lista 'listaSaudacoes'

// imprimindo as saudações
listaSaudacoes.forEach(System.out::println);
```