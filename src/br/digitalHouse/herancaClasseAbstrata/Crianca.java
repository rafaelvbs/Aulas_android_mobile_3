package br.digitalHouse.herancaClasseAbstrata;

import java.sql.SQLOutput;

public class Crianca extends Pessoa {


    public Crianca(String novoNome, String novoSexo) {
        super(novoNome, novoSexo);
    }

    @Override// é obrigado a implementar o metodo da classe abstrata que pai
    public void respirar(String nome) {
        System.out.println("A pessoa está respirando");
    }

    @Override //sobrescrevendo o metodo estudar
    public boolean estudar(boolean status) {
        if (status) {
            System.out.println("a criança está estudando!");
            return true;
        } else {
            System.out.println("não te ninguem estudando");
            return false;
        }
    }
}
