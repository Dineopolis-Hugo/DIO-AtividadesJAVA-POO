package Enums;

public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "São paulo", 11),
    RIO_JANEIRO ("RJ", "Rio de janeiro" ,12),
    PIAUI ("PI","Piaui" ,13),
    MARANHAO ("MA", "Maranhão" ,14),
    CEARA ("CE", "Ceará" ,15),
  //DEPOIS DE CADA ENUM PRECISA COLOCAR A VÍRGULA PARA ELE IDENTIFICAR COMO OUTRO OBJETO DIFERENTE

    //eu posso adicionar objetos dps no enum, como exemplo de CEARÁ, que foi adicionado posteriormente
;
    private  String nome;
    private String sigla;
    private int ibge; //add posteriormente
    //Atributos (SEMPRE PRIVATE)

    //Construtor
    private EstadoBrasileiro(String sigla,String nome, int ibge){
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
            //Nesse caso ta private pois ninguém precisa vê-lo,
            //pois eu ja defini os parâmetros acima
    }
    public int getIbge(){
        return ibge;
    }
    public String getSigla() {
        return sigla;
        //Método get para obter informações
    }
    public String getNome(){
        return nome;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
        //Método to Upper Case() para deixar tudo em CAIXA ALTA (MAIÚSCULO)
    }
}
