package br.digitalHouse.herancaClasseAbstrata;

public class principal {
    public static void main(String[] args) {

        Crianca bebe=new Crianca("Maria","feminino");
        System.out.println(bebe.getNome());
      //  System.out.println(bebe.setSexo()); PORQUE NAO FUNFA
        bebe.estudar(false);//retornou o metodo sobrescrito de criança



    Pessoa alguem=new Pessoa("rafael","feminino");
    alguem.estudar(false);
    alguem.cadastroPessoa("João","Silva","Masc");


    }
}
