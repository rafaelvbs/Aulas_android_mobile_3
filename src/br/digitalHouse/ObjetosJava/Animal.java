package br.digitalHouse.ObjetosJava;

public class Animal {
    // Atributos
    private String nomeAnimal;
    private String raca;
    private int idade;
    private String cor;
    private Pessoa donoAnimal;

    //boa pratica, declarar contrutores apos atributos)
    //construtor especifico - construtores iguais

    public Animal(String novoNomeAnimal){
        nomeAnimal=novoNomeAnimal;
    }

    //construtor padrão
    public Animal(){}

    //Exemplo get
    public  String getNomeAnimal(){
        return nomeAnimal;
    }
    public  int getIdade(){
        return idade;
    }
    public  String getRaca(){
        return raca;
    }
    public  String getCor(){
        return cor;
    }
    public Pessoa getDonoAnimal(){
        return donoAnimal;
    }

 // Exemplo Set
    public void setNomeAnimal(String novoNomeAnimal){
        nomeAnimal=novoNomeAnimal;
    }
    public void setIdade(int novaIdade){
        idade=novaIdade;
    }
    public void setRaca(String novoRaca){
        raca=novoRaca;
    }
    public void serCor(String novoCor){
        cor=novoCor;
    }

    public void setDonoAnimal(Pessoa novoDonoAniamal){
        donoAnimal=novoDonoAniamal;
    }


    public void brincar(){
        System.out.println("O animal está brincando");

    }
}
