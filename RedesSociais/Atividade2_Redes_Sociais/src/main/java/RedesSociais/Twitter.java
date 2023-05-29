package RedesSociais;

public class Twitter extends RedeSocial implements Compartilhamento{
    public Twitter(String senha, int numAmigo) {
        super(senha,numAmigo);
    }

    //sobrescrita de metodo
    @Override
    public void Compartilhar() {
        System.out.println("Compartilhou no Twitter!");
    }

    //sobrescrita do metodo redes sociais
    @Override
    public void postarFoto() {
        System.out.println("Postou foto no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou video no Twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentario no Twitter");
    }

    @Override
    public void CurtirPublicacao() {
        System.out.println("Curtiu publicacao no Twitter");
    }
}
