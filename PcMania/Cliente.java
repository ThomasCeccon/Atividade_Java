package PcMania;

import java.sql.SQLOutput;

public class Cliente {
    //atributos
    String nome;
    long cpf;
    float carteira;
    Computador[] computadors = new Computador[100];


    int promo1=0;
    int promo2=0;
    int promo3=0;

    MemoriaUSB memoriaUSB1=new MemoriaUSB("Pen-Drive",16);
    MemoriaUSB memoriaUSB2=new MemoriaUSB("Pen-Drive",32);
    MemoriaUSB memoriaUSB3=new MemoriaUSB("Pen-Drive",1000);

    Computador comp1 = new Computador("Positivo", 2300, "Pentium core i3", 2200, 8, 500, "Sistema Operacional Linux Ubuntu", 32,memoriaUSB1);
    Computador comp2 = new Computador("Acer", 5800, "Pentium core i5", 3370, 16, 1, "Sistema Operacional Windows 8", 64,memoriaUSB2);
    Computador comp3 = new Computador("Vaio", 1800, "Pentium Core i7", 4500, 32, 2, "Sistema Operacional Windows 10", 64,memoriaUSB3);


    //metodos
    float calculaTotalCompra(){
        float total_compra = promo1 * comp1.preco + promo2 * comp2.preco + promo3 * comp3.preco;
        return total_compra;
    }
}