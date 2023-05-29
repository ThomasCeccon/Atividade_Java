package RedesSociais;

public abstract class RedeSocial {
    //atributos
    protected String senha;
    protected int numAmigo;

    //get e set
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumAmigo() {
        return numAmigo;
    }

    public void setNumAmigo(int numAmigo) {
        this.numAmigo = numAmigo;
    }

    //metodos
    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();
    public  void CurtirPublicacao(){
        System.out.println("Foi curtida uma publicacao");
    };

}
