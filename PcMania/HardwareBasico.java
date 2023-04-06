package PcMania;

public class HardwareBasico {
    //atributos
    String nomeHardware;
    int memoriaRam;
    float clock;
    float capacidade;

    public HardwareBasico(String nome,float clock, int memoriaRam, float capacidade) {
        this.nomeHardware = nome;
        this.clock = clock;
        this.memoriaRam = memoriaRam;
        this.capacidade = capacidade;
    }
}