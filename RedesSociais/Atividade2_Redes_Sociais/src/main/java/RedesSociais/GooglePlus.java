package RedesSociais;

public class GooglePlus extends RedeSocial implements VideoConferencia,Compartilhamento {

    public GooglePlus(String senha, int numAmigo) {
        super(senha, numAmigo);
    }

    //metodos
    @Override
    public void Compartilhar() {
        System.out.println("Compartilhou no Google plus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez streaming no GooglePlus");
    }

    //sobrscrita de metodos de redes sociais
    @Override
    public void postarFoto() {
        System.out.println("Postou foto no Google Plus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou video no Google Plus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentario no Google Plus");
    }

    @Override
    public void CurtirPublicacao() {
        System.out.println("Curtiu Publicacao no Google Plus");
    }

}
