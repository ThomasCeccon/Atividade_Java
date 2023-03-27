package PcMania;

import java.sql.SQLOutput;

public class Computador {
    //atributos
    String marca;
    float preco;
    HardwareBasico hardwareBasico;
    SistemaOperacional sistemaOperacional;
    MemoriaUSB memoria;
    Cliente cliente; //associacao por agregacao de cliente
    //Computador[]  c1 = new Computador[100];

    //metodo construtor
    public Computador(String marca, float preco, String nomeHardware,float clock, int memoriaRam, float capacidade, String nomeSistema, int tipo,MemoriaUSB memousb) {
        this.marca = marca;
        this.preco = preco;
        hardwareBasico = new HardwareBasico(nomeHardware, clock, memoriaRam, capacidade);
        sistemaOperacional = new SistemaOperacional(nomeSistema, tipo);
        this.memoria=memousb;

    }

    public void mostraPCConfigs1(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Preco: R$" + this.preco);
        System.out.println("Processador: " + this.hardwareBasico.nomeHardware + " (" + this.hardwareBasico.clock + " Mhz)");
        System.out.println(this.hardwareBasico.memoriaRam + " Gb de Memória RAM");
        if(this.hardwareBasico.capacidade <= 10)
            System.out.println(this.hardwareBasico.capacidade + " Tb de HD");
        else
            System.out.println(this.hardwareBasico.capacidade + " Gb de HD");
        System.out.println(this.sistemaOperacional.nomeSistema + "(" + this.sistemaOperacional.tipo + " bits)");
    }
    //Computador computador;
    public void mostraPCConfigs(){
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Preco: R$" + this.preco);
        System.out.println("Processador: " + this.hardwareBasico.nomeHardware + " (" + this.hardwareBasico.clock + " Mhz)");
        if(this.hardwareBasico.capacidade <= 10)
            System.out.println(this.hardwareBasico.capacidade + " Tb de HD");
        else
            System.out.println(this.hardwareBasico.capacidade + " Gb de HD");
        System.out.println(this.sistemaOperacional.nomeSistema + "(" + this.sistemaOperacional.tipo + " bits)");
        addMemoriaUSB(memoria);
        System.out.println("--------------------------------------------------------------------------------------------------------------------");

    }

    public void addMemoriaUSB(MemoriaUSB musb){
        System.out.println("Acompanha "+memoria.nome+ " de "+memoria.capacidade+ "GB");
    }

}