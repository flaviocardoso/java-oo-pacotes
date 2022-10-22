# java.io

## Leitura

<p>InputStream <- FileInputStream</p>
<p></p>
<p>Reader <- InputStreamReader</p>
<p>Reader <- BufferedReader</p>

## Escrita

<p>OutputStream <- FileOutputStream</p>
<p></p>
<p>Writer <- OutputStreamWriterr</p>
<p>Writer <- BufferedWriter</p>
  
### FileWriter (java.io.FileWriter)
  
```
BufferWriter bw = new BufferWriter(new FileWriter("file.txt"))
```

```
Writer bw = new BufferWriter(new FileWriter("file.txt"))
```

* FileWriter é usado para escrever caracteres.
* FileWriter é usado para estabelecer uma saída com um arquivo.
* FileWriter não é um OutputStream. O FileWriter é um Writer. A classe FileWriter estende a classe OutputStreamWriter, que por sua vez estende da classe Writer. Então o FileWriter é um OutputStreamWriter e é um Writer.
