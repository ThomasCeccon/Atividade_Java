package PcMania;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //declaracao das variaveis
        boolean flag = true;
        int opcao; // Promocao1 , promocao2, promocao3

        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        //iniciar cada posicao do array computador com 100 posicoes
        Computador[] c1 = new Computador[100];
        Computador[] c2 = new Computador[100];
        Computador[] c3 = new Computador[100];
        //instanciar a memoria e adicionar valores
        MemoriaUSB memoriaUSB1=new MemoriaUSB("Pen-Drive",16);
        MemoriaUSB memoriaUSB2=new MemoriaUSB("Pen-Drive",32);
        MemoriaUSB memoriaUSB3=new MemoriaUSB("Pen-Drive",1000);

        //colocar valores a cada instancia
        Computador comp1 = new Computador("Positivo", 2300, "Pentium core i3", 2200, 8, 500, "Sistema Operacional Linux Ubuntu", 32,memoriaUSB1);
        Computador comp2 = new Computador("Acer", 5800, "Pentium core i5", 3370, 16, 1, "Sistema Operacional Windows 8", 64,memoriaUSB2);
        Computador comp3 = new Computador("Vaio", 1800, "Pentium Core i7", 4500, 32, 2, "Sistema Operacional Windows 10", 64,memoriaUSB3);

        //instancia de cliente
        Cliente cliente=new Cliente();

        cliente.nome="Joao";
        cliente.cpf=10101001;

        //entrada de dados
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("Bem vindo a melhor loja de Pcs da região, PC MANIA!!!");
        Thread.sleep(500);
        System.out.println("Estamos com algumas promoções, para agilizar vou mostrá-las pra você!!");
        Thread.sleep(500);
        System.out.println("--------------------------------------------------------------------------------------------------------------------");

        comp1.mostraPCConfigs1();
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        Thread.sleep(2000);

        comp2.mostraPCConfigs1();
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        Thread.sleep(2000);

        comp3.mostraPCConfigs1();
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        Thread.sleep(2000);


        System.out.println("Se interessou por alguma promoção?");
        System.out.println("1-Promocao 1");
        System.out.println("2-Promocao 2");
        System.out.println("3-Promocao 3");

        while(flag == true){

            System.out.print("Digite e aguarde: ");
            opcao = entrada.nextInt();
            //animacao pesquisando
            System.out.print("pesquisando.");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.println(".");
            Thread.sleep(500);

            switch (opcao){
                case 1:
                    comp1.mostraPCConfigs();
                    System.out.println("Se interessou, gostaria de comprar?");
                    System.out.println("Digite (1/comprar-2/nao comprar)" );
                    int comprar= entrada.nextInt();
                    if(comprar==1){
                        cliente.promo1++;
                        Thread.sleep(500);
                        System.out.println("PC comprado");

                    }
                    else{
                        Thread.sleep(500);
                        System.out.println("Veja outras promoções!");
                    }
                    break;

                case 2:
                    comp2.mostraPCConfigs();
                    System.out.println("Digite (1/comprar-2/nao comprar)" );
                    int comprar2= entrada.nextInt();
                    if(comprar2==1){
                        cliente.promo2++;
                        Thread.sleep(500);
                        System.out.println("PC comprado");
                    }
                    else{
                        Thread.sleep(500);
                        System.out.println("Veja outras promoções!");
                    }
                    break;


                case 3:
                    comp3.mostraPCConfigs();
                    System.out.println("Digite (1/comprar-2/nao comprar)" );
                    int comprar3= entrada.nextInt();
                    if(comprar3==1){
                        cliente.promo1++;
                        Thread.sleep(500);
                        System.out.println("PC comprado");
                    }
                    else{
                        Thread.sleep(500);
                        System.out.println("Veja outras promoções!");
                    }
                    break;

                case 0:
                    flag = false;
                    System.out.print("Saindo da PC MANIA.");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.println(".");
                    Thread.sleep(500);

                    break;

                default:
                    System.out.println("Só temos 3 promoções, digite novamente!");
                    break;
            }

            if(cliente.promo1 > 0)
            {
                System.out.println( cliente.nome+" comprou " + cliente.promo1 + " do PC 1");
            }
            if(cliente.promo2 > 0 )
            {
                System.out.println(cliente.nome +" comprou " + cliente.promo2 + " do PC 2");
            }
            if(cliente.promo3 > 0 )
            {
                System.out.println( cliente.nome +" comprou " + cliente.promo3 + " do PC 3");
            }

            float Total_valor = cliente.calculaTotalCompra();
            System.out.println("Total a pagar de R$ " +Total_valor);
        }

    }
}
