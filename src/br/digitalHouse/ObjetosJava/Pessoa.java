package br.digitalHouse.ObjetosJava;

public class Pessoa {


    private String nomePessoa;
    //contrutor especifico
    public Pessoa(String novoNome){
        nomePessoa = novoNome;
    }

     //get
     public String getNomePessoa(){
         return nomePessoa;
     }
      //set
      public void   setNomePessoa(String novoNome){
          nomePessoa=novoNome;
      }
}
