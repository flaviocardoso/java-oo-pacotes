### java.lang
  
* Possui classes essencias para qualquer programa. As classes String e System são apenas dois exemplos de vários outros.
* Não precisa de import, é automaticamente importado, mas nada impede colocar o import explicitamente import java.lang.*. 
* Outras classes como Exception, RuntimeException, NullPointer e AritmeticException. Todas essas classes vem do pacote java.lang.
  
  <p>Classe String</p>
  * Os objetos da classe String são imútaveis. Isso significa que uma vez criado, não pode ser alterado, por isso qualquer alteração criado, não pode ser alterado, por isso qualquer alteração cria uma novo objeto String. Ex.: String nome = "Flavio"; String nomeAlterado = nome.replace('F', 'f');. O replace não altera a String original e sim devolve uma nova String. Para contemplar a alteração devemos pegar o resultado do método replace. Tem outros métodos do String: toUpperCase, toLowerCase, indexOf, charAt, length, isEmpty, contains, substring, trim.
  * Já é definida pelo java.lang e não precisa ser importado.
  * Há uma diferença entre criação com new e a criação com aspas duplas: Usar aspas duplas é boa prática pois a JVM pode executar várias otimizações por baixo dos panos.
  
 ```
 String nome = "Flavio"; // object literal
 String outro = new String("Alura"); // má prática, sempre prefira a sintaxe literal
  
 String novo = nome.replace("F", "f");
 novo = novo.toLowerCase();
 int pos = novo.indexOf("vi");
 char o = novo.charAt(5);
 String sub = novo.substring(3);
 int comprimento = novo.length();
 System.out.println(novo);
 ```
 
 <p>+ Interface CharSequence</p>
 <p>A classe String recebem uma variável do tipo CharSequence. O tipo CharSequence é uma interface que a própria classe String e StringBuild implementa.</p>
 <p>+ Classe StringBuilder</p>
 <p>O StringBuilder é uma classe comum. Ela tem um objeto mutável para usarmos atribuição sem novas referências.</p>
 
 ```
 StringBuilder builder = new StringBuilder("Teste"); // CharSequence builder 
 // buider métodos
 String texto = builder.toString(); // transforma o builder em String - CharSequence texto
 ```
 
### java.lang.Object
 * Qualquer objeto poder ser referenciado pelo tipo Object, tornando ela a forma mais genérica de refernciar um objeto.
 * Não é preciso deixar explícito na declaração de uma classe que ela deve herdar de Object, o compilador automaticamente insere a declaração.
 * Sendo que qualquer classe que pode herar de Object, o classe que herdou possui métodos da classe Object.
 * toString() - Devolve informações sobre o estado do objeto. Se pode sobrescrever o método nas classes.
  
  ```
  @Override
  piblic String toString() {
    // implementação
  }
  ```
 
<p>Depois que implementa o método a classe se comporta como com uma String de formato diferente do padrão do Object e mostra a mensagem que criamos, e podemos criar toString nas classes filhas também, deixando as classe mais reutilizáveis.</p>
