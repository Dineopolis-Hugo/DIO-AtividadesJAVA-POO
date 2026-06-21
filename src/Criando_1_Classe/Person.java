package Criando_1_Classe;

import java.time.OffsetDateTime;

public class Person {
    private final String Name;
    //com o final esse atributo não pode ser alterado

    private int Age;
    private int LastYearAgeInc = OffsetDateTime.now().getYear();
    //O OFFSET DATE TIME puxa data e hora do dispositivo
    //O get year puxou especificamente o ANO em que o atributo idade foi implementado

    public Person (String name){
        this.Name = name;
        //Com este construtor e sem o setname eu não consigo alterar
        // o nome do objeto depois de criar

        this.Age = 1;
        //idade começa em 1

        //Como eu tenho apenas esse construtor com parametros, ele não deixa criar uma Person
        //Vazia, isso seria possivel se tivesse outro construtor sem parâmetro
    }
    public String getName(){
        return this.Name;
    }
    public int getAge(){
        return this.Age;
    }
    public void incAge(){
        if(this.LastYearAgeInc >= OffsetDateTime.now().getYear()) return;
        //se o ano em que eu criei a idade do objeto for maior que o ano ATUAL
        //Então chama o return (Fim de execução) senão aumenta a idade em 1

        //EX 2026 >= 2027? false então idade +1
        //EX 2026 >= 2026? true então chama o return (FIM de execução)

        this.Age +=1;
        this.LastYearAgeInc = OffsetDateTime.now().getYear();
        //transforma o ultimo ano em que eu mudei a idade no ano atual
        //ou seja, so tem como mudar a idade 1 vez ao ano
    }

}
