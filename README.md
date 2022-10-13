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

