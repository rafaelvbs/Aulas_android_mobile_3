package br.digitalHouse.herancaClasseAbstrata;

public abstract class Pessoa {
    protected String nome;
    private String sobrenome;
    private String cpf;
    private String sexo;

    public Pessoa(String novoNome, String novoSexo) {
        nome = novoNome;
        sexo = novoSexo;
    }

    public abstract void respirar(String nome);//metodos abstratos não podem ter implementação logica por isso não tem {}, porem pode por parametro dentro do ()


    public void cadastroPessoa(String nome,String sobrenome){
    System.out.println("dados da Pessoa: " + nome+" " +sobrenome);
    }

    public void cadastroPessoa(String nome,String sobrenome, String sexo){
        System.out.println("dados atualizados: "+nome+" e "+sexo);
    }

    public void cadastroPessoa(String nome){
        System.out.println("dados Simples: "+nome);
    }

    public boolean estudar(boolean status) {
        return false;
    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   // public void setSexo(String sexo) {
     //   this.sexo = sexo;
   // }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    }
