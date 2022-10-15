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
