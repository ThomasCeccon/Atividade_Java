package RedesSociais;

public class Instagram extends RedeSocial {

    public Instagram(String senha, int valorAmigos) {
        super(senha,valorAmigos);
    }

   //sobrscrita de metodos de redes sociais
   @Override
   public void postarFoto() {
       System.out.println("Postou foto no Instagram");
   }

    @Override
    public void postarVideo() {
        System.out.println("Postou vídeo do Instagram");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentário no Instagram");
    }

    @Override
    public void CurtirPublicacao() {
        System.out.println("Curtiu publicação no Instagram");
    }

}
