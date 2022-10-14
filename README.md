# Java Orientado a Objetos : Pacotes
Trabalhando com pacotes

<p>FQN - (Full Qualified Name) é nome completo da classe, composto pelo nome do pacote e o nome da classe.<p>
<p> FQN = Nome Pacote . Nome Simples da Classe. </p>
<p></p>
<p>Packages: são diretórios que tem significado especial dentro do código fonte Java, a palavra chave <b>packages</b> deve ser a primeira declaração e servem para organização e agrupar as classes e interfaces.</p>

<p> Boa prática: nomenclatura de pacotes -> (Nome do site ao contrario).(nome do projeto). Por organização e por convenção, precisamos segiur o domínio da empresa. Ou seja, se a empresa tem como domínio cbbf.gov.br, os pacotes devem ser subpacotes de br.gov.cbpf. Depois do nome do projeto vem a organização de pastas do sistema.</p>

<p> O modificador default do Java restrige acesso a nível de pacote. Logo, se não for definido algum modificador, seja na classe, método, ou atributo, apenas classes do mesmo pacote podem acessar essas informações. </p>

#### Estrutura - em arquivo.
* Uma declaração <b>package</b> só pode ter uma.
* A declaração <b>import</b> é opcional.
* É possível repetir a declaração <b>import</b> para importações de packages diferentes. O <b>import</b> facilita o uso da classe pois não precisamos do Full Qualified Name.
* A definição da classe sempre deve vir por último, após package e import.

#### Modificadores: 
* Temos quatro modificados: private, default, protected e public, que vai do mais restrivo para o menos restritivo.
* <<package private>> - (ausência do modificador), também chamada de package private ou default, o membro fica vísivel na classe e no package, mas é invísivel fora do pacote (nem para os filhos).
* protected - funciona igual ao *"<<package private>>" mas adiciona a visibilidade para os filhos (chamado de <b>publico para os filhos</b>). (classe, package e classe filho).

<p>Quando se tira o acesso publico de uma classe transformamos essa classe em <b>package private</b>, ou seja, é só vísivel dentro do pacote em que ela está contida.</p>
<p>Modificadores podem ser usados na definição da classe, atributo, construtor e método.</p>
<p></p>

#### Javadoc
```
/**
 *
 */
```
* É preciso ter instalado o JDK para poder gerar a documentação javadoc.
* O javadoc é uma documentação para desenvolvedores.
* Apenas os membros públicos são considerados detalhes da implementação e não podem ser utilizados para outras classes.
<p>Detalhes sobre tags: </p>

* @author - usado na classe ou interface
* @version - usado na classe ou interface
* @param - usado no método e construtor
* @return - usado apenas no método
* @exception ou @throws - no método ou construtor
* @see
* @since
* @serial
* @deprecated

### JAR (Java ARchive)
* É um formato padrão do mundo Java para distrubir código compilado. Qualquer biblioteca ou projeto vai usar JAR(s) para distribuir o código.
* É um arquivo compactado com ZIP.

<p>JAR executavel pela linha de comando. Somente JAR executavel podem ser executado.</p>

```
java -jar executavel.jar
```

<p>Na nossa biblioteca temos a pasta META-INFO que tem um arquivo que tem nossa configuração MANIFEST.MF. Podemos ver que tanto a biblioteca quanto o executável tem esse manifest, que no caso do executável direciona qual o main que vai executar.</p>
  
```
Manifest-Version: 1.0
Main-Class: br.com.flaviocardoso.escola.testes.TesteAluno
```
  
### Maven

<p>A necessidade de organizar, centralizar e versionar os JARs dessa biblioteca e gerenciar as dependências entre elas, foram criadas ferramentas entre elas específicas e no mundo Java se destacou o Maven. O Maven organiza os JARs (código compilado, código fonte e documentação) em repositório central que é publico e pode ser pesquisado. => [https://mvnrepository.com/]. O Maven é bem parecido com apt ou rpm.</p>
  
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

