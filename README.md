#Fábrica de Navios


###Incremento da Fábrica de Navios V2 ([FabricaNaviosV2](http://alitigeller.github.io/FabricanaviosV2/)), que implementa os padrões Factory Method, Abstract Factory, Protótipo e Singleton, acrescentando o padrão Builder.

###Class Diagram 1:
![](https://github.com/alitigeller/FabricaNaviosV3/blob/master/Class%20Diagram0.jpg?raw=true)

###Class Diagram 2:
![](https://github.com/alitigeller/FabricaNaviosV3/blob/master/Class%20Diagram1.jpg?raw=true?raw=true)
(Note que a interface Navio é a mesma nos dois dois diagramas, que foram divididos para não ficar muito "poluído")

A classe Director constrói o objeto utilizando as classes builder's, que, por sua vez, define como as partes do objeto (nesse caso, Navio) devem ser criadas.
