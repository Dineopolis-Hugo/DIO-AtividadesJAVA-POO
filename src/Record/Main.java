package Record;

public class Main {
    public static void main(String[] args) {
        var person = new Person("João" , 15 );

        System.out.println(person.getInfo());
        System.out.println(person.name());
        //No record o atributo é acessado atrravés de método

    }
}
