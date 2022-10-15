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
