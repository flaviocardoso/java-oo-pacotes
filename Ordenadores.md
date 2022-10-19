
<p>Ordenação dos elementos de uma lista</p>

* Para ordenar uma lista é preciso definir um critério de ordenação.
* O algoritmo de ordenação já foi implementado na lista no método sort na classe Collections.
* Collections é uma fachada com vários métodos auxiares para trabalhar com as coleções, principais listas.

<p> Há duas formas de definir esse critério: </p>
<p>+ (java.util.Comparator) - O comparator é um parâmetro do método sort da lista e da classe Collections.</p>
<p>+ (java.lang.Comparable) - Defini a ordem natural dos elementos.</p>
<p></p>
<p>Ordem natural - É a ordem definida pelo próprio elemento de lista. A classe que define o seu próprio critério de ordenação implementado a interface 'java.lang.Comparable'.</p>
<p>Para ordem natural a implementação da Comparable exige a criação do método compareTo, que precisa ser chamdo pelo algoritmo interno do método sort() da lista.</p>
<p></p>
<p>Para reverter a ordem de lista você pode usar o método reverse da classe Collections: Collections.reverse(lista) </p>
<p>Para embaralhar existe o método shuffle: Collections.shuffle(lista) </p>
<p>Para rotacionar existe o método rotate: Collections.rotate(lista) </p>

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

<p>No wrapper tem métodos que podem fazer comparações.</p>
<p>Dentro do método compareTo(), pode no caso de Double, Double.compare(dA, dB) usado no método natural. Para o uso deste Collections.sort(null).</p>
