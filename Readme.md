# Como escrever testes de unidade com JUnit 5

> Nesse repositório tem um exemplo de como fazer testes de unidade com o *framework* de testes [JUnit 5](https://junit.org/junit5/docs/current/user-guide/).

Na classe [Principal](src/main/java/poo/Principal.java) é ilustrado como criar um objeto gerador de números pseudo-aleatórios com semente fixa. O uso da semente fixa pode ser útil para executar alguns tipos de teste, mas não foi usada nos testes de unidade deste repositório.

A classe [UtilitariaMatematica](src/main/java/poo/util/UtilitariaMatematica.java) apresenta um método para verificar se o número passado como parâmetro é um [número perfeito](https://pt.wikipedia.org/wiki/N%C3%BAmero_perfeito). Para essa classe foi criado um [conjunto de testes de unidade](src/test/java/poo/UtilitariaMatematicaTests.java) a fim de garantir que a implementação está correta. 

A classe [Triangulo](src/main/java/poo/formas/Triangulo.java) permite criar objetos para representar um triângulo, bastando para tal informar a dimensão dos três lados do triângulo. Se as dimensões fornecidas para os três lados não formarem um triângulo, então deverá ser criado um triângulo com as seguintes dimensões: (4,3,2). Contudo, não foi implementada a lógica nessa classe para garantir a regra, deixando aqui a oportunidade para você praticar e escrever a lógica que irá passar nos testes de unidade escritos na classe [TrianguloTests](src/test/java/poo/TrianguloTests.java).  


A classe [TrianguloTests](src/test/java/poo/TrianguloTests.java) possui uma implementação de todos os testes de unidade para garantir que a regra apresentada acima seja respeitada. Nessa classe é apresentado também um exemplo de como escrever testes [parametrizados](https://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests-sources), algo que facilita quando se deseja testar vários valores. No caso, foi necessário incluir a dependência para o pacote `org.junit.jupiter:junit-jupiter-params:5.7.0` no arquivo [build.gradle](build.gradle).

## Como criar um Jar executável com o gradle

Edite o arquivo [build.gradle](build.gradle) e inclua o seguinte bloco.

```groovy
jar {
    manifest {
        // Classe principal da aplicação
        attributes "Main-Class": "poo.Principal"
    }
}
```

Por fim, compile o projeto (sem executar os testes de unidade) com o comando `./gradlew build -x test` e execute a aplicação com a linha abaixo:

```bash
java -jar build/libs/teste-de-unidade-junit5-1.0.jar
```

## Executando os testes de unidade

Execute a tarefa `./gradlew test` e um relatório em HTML será colocado no subdiretório `build/reports/tests/test`. Se algum teste não passar, então o gradle lançará um aviso após a execução da tarefa. Por exemplo:

```bash
> Task :test FAILED

...

TrianguloTests > ladosComDimensaoZero() FAILED
    org.opentest4j.AssertionFailedError at TrianguloTests.java:23

14 tests completed, 7 failed

FAILURE: Build failed with an exception.
```

## Para atualizar a versão do gradle

Veja documentação oficial que está disponível em https://docs.gradle.org/current/userguide/upgrading_version_7.html

```bash
gradle wrapper --gradle-version 7.1.1
```