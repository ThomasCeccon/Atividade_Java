package RedesSociais;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    //atributos
    private String nome;
    private String email;


    //associcao por composicao listando as redes sociais
    ArrayList<RedeSocial> redesociais = new ArrayList<>();


    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    //adicionar rede social
    public void addRedesSociais(RedeSocial redeSocial) {
        redesociais.add(redeSocial);

    }

    //metodo para adicionar redes sociais
    public void Usuario(RedeSocial[] redeSociais) {

        for(int i=0;i< redesociais.size();i++){

            if(redeSociais[i]!=null){
                if(redeSociais[i] instanceof Instagram){
                    Instagram inst=(Instagram) redeSociais[i];
                    //colocar informacoes
                    System.out.println("Informaçoes do instagram");
                    System.out.println("Senha do Instagram: "+ inst.getSenha());
                    System.out.println("Quantidade de sequidores no instagram: "+ inst.getNumAmigo());
                    inst.postarFoto();
                    inst.postarComentario();
                    inst.CurtirPublicacao();

                    System.out.println("==============");
                }
                else if(redeSociais[i] instanceof Facebook){
                    Facebook face=(Facebook) redeSociais[i];
                    //colocar informacoes
                    System.out.println("Informaçoes do facebook");
                    System.out.println("Senha do Facebook: "+ face.getSenha());
                    System.out.println("Quantidade de sequidores no Facebook: "+ face.getNumAmigo());
                    face.postarVideo();
                    face.fazStreaming();
                    face.Compartilhar();
                    System.out.println("==============");
                }
                else if(redeSociais[i] instanceof Twitter t){
                    Twitter twit=(Twitter) redeSociais[i];
                    //colocar informacoes
                    System.out.println("Informaçoes do Twitter");
                    System.out.println("Senha do Twitter: "+ twit.getSenha());
                    System.out.println("Quantidade de sequidores no Twitter: "+ twit.getNumAmigo());
                    twit.postarFoto();
                    twit.postarVideo();
                    twit.CurtirPublicacao();
                    System.out.println("==============");
                }
                else{
                    GooglePlus goplus=(GooglePlus) redeSociais[i];
                    //colocar informacoes
                    System.out.println("Informaçoes do Google Plus");
                    System.out.println("Senha do Google Plus: "+ goplus.getSenha());
                    System.out.println("Quantidade de sequidores no Google Plus: "+ goplus.getNumAmigo());
                    goplus.postarFoto();
                    goplus.postarVideo();
                    goplus.postarComentario();
                    System.out.println("==============");

                }
            }
        }
    }

    //get e set
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

