
## Function Object

<p>Objeto que só encapsula uma função/método/procedimento. - Um objeto que criamos para encapsular uma função ou método.</p>
<p>As classes anôminas facilitam um pouco a criação desses objetos.</p>

## Classe anônimina

<p>É gerada uma classe anômina. É criado um objeto do tipo da classe que implementamos.</p>

## Lambdas

```
// Exemplo
List<String> nomes = new ArrayList<String>();
nomes.add("Super Mario");
nomes.add("Yoshi");
nomes.add("Donkey Kong");

//Collections.sort(nomes, (s1, s2) -> Integer.compare(s1.length(), s2.length())); // lambda comparator usando collections
nomes.sort((s1, s2) -> Integer.compare(s1.length(), s2.length())); // lambda comparator usando a própria lista

nomes.forEach((n) -> System.out.println(n)); // lambda da lista loop foreach Consumer
```

## Mais

<p>Interator</p>
<p>Interator é uma objeto que possui no mínimo dois métodos: hasNext() e next(). Ou seja, você pode usá-lo para perguntar se existe um próximo elemento e pedir o próximo elemento.</p>

```
// Exemplo
// List<String> nomes = new ArrayList<String>(); // lista com elementos que se repetem
List<String> nomes = new HashSet<String>(); // lista com elementos que não podem se repetir
nomes.add("Super Mario");
nomes.add("Yoshi");
nomes.add("Donkey Kong");

Iterator<String> it = nomes.iterator();

while(it.hasNext()) {
  System.out.println(it.next());
 }
```
