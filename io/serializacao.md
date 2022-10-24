
## serialUID

```
private static final long serialVersionUID = 1L;
```

* Funciona em cascata. Quando uma classe utiliza a serialização, tanto para herança tanto para composição, as classes precisam implementar o `java.io.Serializable` .
* Para não usar uma classe na seriazação pode utilizar a palavra chave `transient` no atributo. Quando isso ocorre a classe quando transforma não consegue mais buscar essa informação.</p>
* Não precisa colocar explicitamente o atributo serialVersionUID, mas é um boa prática.

<p>O serialVersionUID é da classe (por isso estático) e define a versão ou identificação numérica da classe, é gerada quando não explicita. Cada vez que alteramos algo incompátivel na classe, devemos alterar o seu valor.</p>
<p>Sempre quando serializamos o objeto, também será serializado o valor do serialVersionUID.</p>

<p>Classe Livro</p?
```
public class Livro implements Serializable {

  private static final long serialVersionUID = 1L;

  public Autor autor;
  /*
  */
}
```

<p>Classe Autor</p>
```
class Autor implements Serializable {

  private static final long serialVersionUID = 2L;
  
  private String nome;
  /*
  */
}
```

<p>Teste</p>
```
public class TesteSerializacaoComposicao {
  public static void main(String[] args) throws Exception {
    Autor autor = new Autor();
    autor.setNome("Nome Teste");
    
    Livro livro = new Livro();
    livro.setTitulo("Serialização");
    livro.setAutor(autor);
    
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("livro.bin"));
    oos.writeObject(livro);
    oos.close();
    
    ObjectInputStream ois = new ObjectInputputStream(new FileInputStream("livro.bin"));
    Livro livroSerializado = (Livro) ois.readObject();
    ois.close();
    System.out.println(livroSerializado.getAutor().getNome());
  }
}
```

<p>Ambas as classes precisam implementar a interface Serializable. Ocorrerá uma exceção NotSerializableException, caso não implementada.</p>
