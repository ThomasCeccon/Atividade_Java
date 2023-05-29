package RedesSociais;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Definindo quantas posicoes de redes sociais
        RedeSocial []redeSocials=new RedeSocial[4];
        ArrayList<RedeSocial> redeSocials1=new ArrayList<>();

        //instanciando as classes filhas
        Instagram instagramNovo = new Instagram("asdasd", 123);
        Facebook facebookNovo = new Facebook("abcd", 100);
        Twitter twitterNovo = new Twitter("asas", 200);
        GooglePlus googlePlusNovo = new GooglePlus("ssds", 400);


        //criando um usuario
        Usuario u1 = new Usuario("Thales", "thales.g@gmail.com");

        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("Usuario: " + u1.getNome());
        System.out.println("Email: " + u1.getEmail());
        System.out.println("----------------------");

        //definindo a posicao de cada objeto
        redeSocials[0]=instagramNovo;
        redeSocials[1]=facebookNovo;
        redeSocials[2]=twitterNovo;
        redeSocials[3]=googlePlusNovo;

        //adicionando 2 redes sociais
        u1.addRedesSociais(instagramNovo);
        u1.addRedesSociais(facebookNovo);

        //prover o compartilhamento de posts
       // facebookNovo.Compartilhar();
        u1.redesociais.get(0).CurtirPublicacao();
        u1.redesociais.get(1).CurtirPublicacao();
      // u1.redesociais.get(2).CurtirPublicacao();




    }
}