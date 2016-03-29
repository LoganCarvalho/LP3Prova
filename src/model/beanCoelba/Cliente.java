package model.beanCoelba;

import model.daoCoelba.ClienteDao;

public class Cliente {
    private String nome, cep, email, cpf, telefone;
    private int numero;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public Cliente(){
        
    }
    
    public Cliente(String nome, String telefone, String email, String cpf, String cep, int numero){
        setNome(nome);
        setTelefone(telefone);
        setEmail(email);
        setCpf(cpf);
        setCep(cep);
        setNumero(numero);
    }
    
    public boolean inserir() {
        return(new ClienteDao().inserir(this));
    }
    
    public boolean pesquisar() {
        return(new ClienteDao().pesquisar(this));
    }
    
    public boolean update() {
        return(new ClienteDao().update(this));
    }
    
    public boolean excluir() {
        return(new ClienteDao().excluir(this));
    }
    
    
}
