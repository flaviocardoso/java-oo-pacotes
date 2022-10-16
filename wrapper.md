### Wrapper

<p>java.lang.Integer é uma exemplo de Wrapper.</p>
<p>Classes que contém funcionalidades e encapsulam a váriavel de tipo primitivo.</p>

<p>Autoboxing / unboxing</p>

```
int dia = Integer.parseInt("13");
// int dia = Integer.valeOf("13");
```

<table>
  <tr>
    <th>Tipo primitivo</th>
    <th>wrappers</th>
  <tr>
  <tr>
    <td>double (8 bytes)</td>
    <td>java.lang.Double</td>
  </tr>
    <tr>
    <td>float (4 bytes)</td>
    <td>java.lang.Float</td>
  </tr>
    <tr>
    <td>long (8 bytes)</td>
    <td>java.lang.Long</td>
  </tr>
    <tr>
    <td>int (4 bytes)</td>
    <td>java.lang.Integer</td>
  </tr>
    <tr>
    <td>short (2 bytes)</td>
    <td>java.lang.Short</td>
  </tr>
    <tr>
    <td>byte (1 bytes)</td>
    <td>java.lang.Byte</td>
  </tr>
    <tr>
    <td>char (2 bytes)</td>
    <td>java.lang.Character</td>
  </tr>
    <tr>
    <td>boolean</td>
    <td>java.lang.Boolean</td>
  </tr>
</table>

<p>Para cada primitivo existe uma classe chamada Wrapper.</p>
<p>Para guardar um primitivo numa coleção é preciso criar um objeto que embrulha o valor. Essa criação do objeto wrapper é autoboxing.</p>
<p>A retirada do valor primitivo do objeto wrapper é unboxing.</p>
<p>Autoboxing e unboxing acontecem automaticamente.</p>
<p>As classes wrapper possuem vários métodos auxiliares.</p>
<p>Todas as classes wrappers que representam um valor numérico possuem a classe java.lang.Number como pai, mas podemos referenciar também a classe java.lang.Object que é pai de todas.</p>
