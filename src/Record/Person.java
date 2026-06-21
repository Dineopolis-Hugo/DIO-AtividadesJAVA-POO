package Record;

public record Person(String name ,int age) {
    //record declara atributos dentro do construtor dele

    //Record é uma classe imutável,você cria e não pode mudar os atributos,

    public Person(String name){
        this(name,  1);
        //podemos colocar constritores secundários também
        //Esse por exemplo pega o nome do construtor 1 e o age de si (se não tiver a age no construtor 1)
    }

    public String getInfo(){
        return "name:" + name + " age: " + age;
        //podemos colocar métodos nos records
    }
}
