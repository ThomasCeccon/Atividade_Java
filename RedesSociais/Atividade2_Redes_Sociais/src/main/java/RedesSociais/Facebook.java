package RedesSociais;

public class Facebook extends RedeSocial implements VideoConferencia,Compartilhamento{

    public Facebook(String senha, int valorAmigos) {
        super();
    }

    //sobrescrita de metodo
    @Override
    public void Compartilhar() {
        System.out.println("Compartilhou no Facebook!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Esta fazendo streaming no Facebook!");
    }

    //sobrescrita dos metodos redes sociais
    @Override
    public void postarFoto() {
        System.out.println("Postou foto no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou video no Facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentario no Facebook");
    }

    @Override
    public void CurtirPublicacao() {
        System.out.println("Curtiu publicacao no facebook");
    }
}
