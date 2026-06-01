### FurColor

Foi criado um enum para representar as cores de pelagem dos gatos. Cada constante possui um código (`code`) e um nome de exibição (`displayName`). Também foi implementado o método `fromCode(int code)` para buscar a cor pelo código.

### Cat

Foi criada a classe `Cat`, que herda de `Animal`. Foram adicionados os atributos específicos do gato, os métodos sobrescritos (`makeSound()`, `sleep()` e `displayInfo()`), os métodos sobrecarregados `move()`, além de `purr()` e `loseLife()`.

## Decisões tomadas

* Utilizei `enum` para as cores porque são valores fixos.
* Os atributos do enum foram declarados como `final` para garantir imutabilidade.
* O atributo `lives` foi inicializado com valor 7 conforme solicitado.
* O método `fromCode()` lança `IllegalArgumentException` quando o código não existe.

## Como testei

* Criei objetos `Cat` com diferentes atributos.
* Testei os métodos `makeSound()`, `sleep()`, `move()`, `purr()` e `loseLife()`.
* Verifiquei a exibição das informações com `displayInfo()`.
* Testei `FurColor.fromCode()` com códigos válidos e inválidos.

Os testes mostraram que os métodos funcionam conforme esperado e que o enum retorna corretamente as cores associadas aos códigos.
