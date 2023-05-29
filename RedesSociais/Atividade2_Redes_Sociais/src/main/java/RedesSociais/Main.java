package RedesSociais;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //instanciando as classes filhas
        Instagram instagramNovo = new Instagram("asdasd", 123);
        Twitter twitterNovo = new Twitter("asas", 200);
        Facebook facebookNovo = new Facebook("abcd", 100);
        GooglePlus googlePlusNovo = new GooglePlus("ssds", 400);


        //Definindo quantas posicoes de redes sociais
        ArrayList<RedeSocial> redeSocialArrayList = new ArrayList<>();

        //adicionando as redes sociais desejadas
        redeSocialArrayList.add(instagramNovo);
        redeSocialArrayList.add(twitterNovo);


        //criando um usuario
        Usuario u1 = new Usuario("Thomas", "cecconthomas275@gmail.com", redeSocialArrayList);

        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.println("Usuario: " + u1.getNome());
        System.out.println("Email: " + u1.getEmail());
        System.out.println("----------------------");

        //percorrendo
        for (RedeSocial redeSocials:u1.getRedeSocials()) {

                if (redeSocials instanceof Instagram  instagram) {
                    instagram.postarComentario();
                    instagram.CurtirPublicacao();
                    instagram.postarVideo();
                    System.out.println("----------------------");
                } else if (redeSocials instanceof Twitter twitter) {
                    twitter.postarFoto();
                    twitter.postarComentario();
                    twitter.Compartilhar();
                    System.out.println("----------------------");
                } else if (redeSocials instanceof Facebook facebook) {
                    facebook.Compartilhar();
                    facebook.fazStreaming();
                    facebook.postarVideo();
                    System.out.println("----------------------");

                } else if (redeSocials instanceof GooglePlus googlePlus) {
                    googlePlus.postarVideo();
                    googlePlus.Compartilhar();
                    googlePlus.postarComentario();
                    System.out.println("----------------------");
            }

        }
    }
}
