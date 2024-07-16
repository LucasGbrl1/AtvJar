package br.ufg.poo.g3;

public class Usuario {
    private String nome;
    private String matricula;
    private String curso;
    private String email;

    public Usuario(String nome, String matricula, String curso, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
    
    public String getCurso() {
        return curso;
    }

    public String getEmail() {
        return email;
    }

    public void login() {
        System.out.println(nome + " logado com sucesso!");
    }

    public void logout() {
        System.out.println(nome + " deslogado com sucesso!");
    }
}
