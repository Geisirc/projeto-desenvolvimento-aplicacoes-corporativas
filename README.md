# Exercícios de Padrões GOF

## DECORATOR
### Funcionamento

<p>
A descrição original do Padrão Decorator é: "O Padrão Decorator anexa responsabilidades adicionais a um objeto dinamicamente. Os decoradores fornecem uma alternativa flexível de subclasse para estender a funcionalidade".

O Padrão Decorator tem como característica o seguinte:
<ul>
<li>
Os decoradores têm o mesmo supertipo que os objetos que eles decoram;
</li>
<li>
Você pode usar um ou mais decoradores para englobar um objeto;
</li>
<li>
Uma vez que o decorador tem o mesmo supertipo que o objeto decorado, podemos passar um objeto decorado no lugar do objeto original (englobado);
</li>
<li>
O decorador adiciona seu próprio comportamento antes e/ou depois de delegar o objeto que ele decora o resto do trabalho;
</li>
<li>
Os objetos podem ser decorados a qualquer momento, então podemos decorar os objetos de maneira dinâmica no tempo de execução com quantos decoradores desejarmos.
</li>
</ul>
</p>

### Fonte: <a href="https://www.devmedia.com.br/padrao-de-projeto-decorator-em-java/26238">DEVMEDIA</a>


## OBSERVER
###Funcionamento

<p>
O padrão Observer funciona como assinaturas de jornais e revistas, ou seja, temos uma editora que publica as edições e pessoas que assinam os jornais ou revistas dessa editora e sempre recebem as novas edições assim que elas são publicadas. Enquanto a pessoa é assinante ela continua recebendo as edições na sua casa. Se a pessoa cancelar a assinatura do jornal ou da revista ela para de receber as edições.

O padrão Observer funciona da mesma forma, no entanto, tem-se que a editora (que publica) é o chamado SUBJECT no Padrão Observer e os assinantes (que recebem as novas publicações) são os chamados OBSERVER.

Os OBSERVERs registram-se no SUBJECT para receber atualizações quando os dados do SUBJECT são alterados. Os OBSERVERs também podem cancelar o seu registro e dessa forma não receber mais nenhuma atualização do SUBJECT.
</p>

### Fonte: <a href="https://www.devmedia.com.br/padrao-de-projeto-observer-em-java/26163">DEVMEDIA</a>
