
<p>Ordenação dos elementos de uma lista</p>
<p>+ (java.util.Comparator) - O comparator é um parâmetro do método sort da lista e da classe Collections.</p>
<p>+ (java.lang.Comparable) - Defini a ordem natural dos elementos.</p>
<p></p>
<p>Ordem natural - É a ordem definida pelo próprio elemento de lista. A classe que define o seu próprio critério de ordenação implementado a interface 'java.lang.Comparable'.</p>
<p>Para ordem natural a implementação da Comparable exige a criação do método compareTo, que precisa ser chamdo pelo algoritmo interno do método sort() da lista.</p>
<p></p>
<p>Para reverter a ordem de lista você pode usar o método reverse da classe Collections: Collections.reverse(lista) </p>
<p>Para embaralhar existe o método shuffle: Collections.shuffle(lista) </p>
<p>Para rotacionar existe o método rotate: Collections.rotate(lista) </p>
