package RedesSociais;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    //atributos
    private String nome;
    private String email;


    //arrayList passando as posicoes de redes sociais
    private ArrayList<RedeSocial> redeSocials;

    //metodo construtor
    public Usuario(String nome, String email, ArrayList<RedeSocial> redeSocials) {
        this.nome = nome;
        this.email = email;
        this.redeSocials = redeSocials;
    }


    //get e set
    public ArrayList<RedeSocial> getRedeSocials() {
        return redeSocials;
    }

    public void setRedeSocials(ArrayList<RedeSocial> redeSocials) {
        this.redeSocials = redeSocials;
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
}
