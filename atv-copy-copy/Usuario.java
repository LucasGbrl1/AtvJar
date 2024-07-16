  

/**
 * Classe que representa um usuário no sistema.
 */
public class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    /**
     * Método para login do usuário.
     */
    public void login() {
        System.out.println(nome + " logado com sucesso!");
    }

    /**
     * Método para logout do usuário.
     */
    public void logout() {
        System.out.println(nome + " deslogado com sucesso!");
    }
}
