### java.util - Precisa ser importada
  
  * Arrays, ArrayList, LinkedList, List, Vector, Collection, Set, HashSet
  
#### Arrays - java.util.Arrays
  
  * A primeira posição em Java é zero.
  * Serve para guardar elementos (valores primitivos ou referências)
  * Usam colchetes ([]) sintaticamente.
  * Tem um tamanho fixo.
  * É um objeto.
  * Sempre inicializa com valores padrão. // int - 0, String - null, Object - null
  * Posição inválida tem exceção ArrayIndexOutBoundException.
  * Possue atributo length para saber o comprimento.
  * Forma literal para criar uma Array com uso de chaves ({}).
  * É uma estrutura de dados.
  * double[] precos = new double[5] ou double precos[] = new double[5];
  * double[] precos = {2.54, 3.49, 5.67, 4.97, 8.56};
  * No lugar do double pode ser também uma classe que nós criamos para fazer uma referência de objetos.
  
  <p>Podemos receber valores ao chamar o programa Java na linha de comando com o array String[] do método main. > java classMain [valores com espaços]</p>
  
```
int[] numeros = new int[3]; // inicializa o array com 0, todos os membros da array. 3 é a quantidade de membros.
numeros[posicao];
```
  <p></p>
  <p>Arrays: Forma literal</p>
  
  ```
  int[] refs = {}; // membros separados por vírgula.
  ```
  
  <p>Desvantagens do Array:</p>
  
  * Não podemos sabemos quais os elementos que pode ter, só a quantidade de elementos.
  * Uma vez a array criado sempre terá o mesmo tamanho de elementos.
  * Os arrays realmente tem a sua própria sintaxe, o que dificulta a legibilidade do código.
  
#### ArrayList - java.util.ArrayList (.Precisa ser importado ) -> List -> Collection

* Guarda referências.
* É do pacote "java.util".
* Usa internamente um array.
* Adiona elemento no ultimo da lista.
* Usa métodos size, get, remove, etc.
* Generics parametrizam classes e se definir o tipo dos elementos. ArrayList<Class> = new ArrayList<Class>()
  
  <p>ArrayList é um array dinâmico, ou seja, por debaixo dos panos é usado um array, mas sem se preocupar com os detalhes e limitações.</p>
  <p>A ArrayList tem construtor sobrecarregado que pode receber um tamanho inicial mas continua dinâmica.</p>
  
  ```
  ArrayList lista = new ArrayList(26);
  ```
  
  <p>Lista a partir de outra</p>
  
  ```
  ArrayList lista = new ArrayList(26);
  lista.add("banana");
  lista.add("maca");
  Array outraLista = new ArrayList(lista);
  ```
  
  
#### List - java.util.List -> java.util.Collection
  
 * É uma interface. Quem implementa essa interface é ArrayList e LinkedList.
 * Todas a lista tem uma ordem de inserção. Os itens estão na mesma posição que foram inseridos.
 * Todas as listas possuem um índice, no qual são acessados, mesmo possuindo elementos duplicados.

  <p> A LinkedList é uma lista duplamante linkada e a ArrayList representa um array com redimensionamento dinâmico.</p>
  <p> ArrayList</p>
  <p> - Acesso fácil e perfomático pelo índice. - Elementos precisam ser copiados quando não há mais capacidade.</p>
  <p> LinkedList</p>
  <p> - Inserção e remoção preformática em qualquer posição, também no início. - Acesso mais demorado pelo índice, é preciso pesquisar os elementos. </p>
  <p></p>
  <p>Transformando uma Array para List - java.util.Arrays<p>
  <p>A classe java.util.Arrays possui vários métodos estáticos auxiliares para trabalhar com arrays.</p>
 
  ```
  String[] arrayString = { "texto", "criado", "incremento" };
  List<String> lista = Arrays.asList(arrayString); 
  ```
 
  <p>As listas fazem parte de coleções (java.util.Collection). As listas garantem a ordem de inserção. Todas as listas possuem um índice, ou seja são sequências.</p>
  
#### Vector - java.util.Vector

<p> - Vector é threadsafe. - Como o ArrayList, o Vector também usa um array por baixo. - O Vector implementa List.</p>

<p> Vector -> List -> Collection </p>
  
  <p> - Set, java.util.Set, também são colecões, mas não aceitam duplicações. </p>
