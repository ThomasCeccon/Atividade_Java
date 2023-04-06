package PcMania;

import java.sql.SQLOutput;
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
        MemoriaUSB memoriaUSB3=new MemoriaUSB(" HD Externo",1000);

        //colocar valores a cada instancia
        Computador computador = null;
        Computador comp1 = new Computador("Positivo", 2300, "Pentium core i3", 2200, 8, 500, "Sistema Operacional Linux Ubuntu", 32,memoriaUSB1);
        Computador comp2 = new Computador("Acer", 5800, "Pentium core i5", 3370, 16, 1, "Sistema Operacional Windows 8", 64,memoriaUSB2);
        Computador comp3 = new Computador("Vaio", 1800, "Pentium Core i7", 4500, 32, 2, "Sistema Operacional Windows 10", 64,memoriaUSB3);
        Cliente cliente=new Cliente();

        //entrada de dados
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("Bem vindo a melhor loja de Pcs da região, PC MANIA!!!");
        Thread.sleep(500);
        System.out.println("Estamos com algumas promoções, para agilizar vou mostrá-las pra você!!");
        Thread.sleep(500);
        System.out.println("Pode nos informar o seu nome e Cpf? ");
        cliente.nome = entrada.nextLine();
        cliente.cpf = entrada.nextLong();
        System.out.println("Ótimo, cadastro feito!Pode nos falar o quanto no máximo pode gastar?");
        cliente.carteira = entrada.nextFloat();
        float carteira_inicial = cliente.carteira;
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


        while(flag == true){
            System.out.println("Se interessou por alguma promoção?");
            System.out.println("0-Para para ir pagar");
            System.out.println("1-Promocao 1");
            System.out.println("2-Promocao 2");
            System.out.println("3-Promocao 3");
            System.out.println("4-Consultar saldo da carteira");
            System.out.println("--------------------------------------------------------------------------------------------------------------------");


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
                    System.out.println("Se interessou, gostaria de adicionar ao carrinho?");
                    System.out.println("Digite (1/adicionar-2/nao adicionar)" );
                    int comprar= entrada.nextInt();

                    if(comprar == 1 && cliente.carteira < comp1.preco){
                        Thread.sleep(500);
                        System.out.println("Saldo Insuficiente para comprar esse dispositivo");
                        System.out.println("Veja outras promoções!");
                    }
                    if(comprar == 2){
                        Thread.sleep(500);
                        System.out.println("Veja outras promoções!");
                    }
                    if(comprar==1 && cliente.carteira >= comp1.preco){
                        cliente.promo1++;
                        cliente.carteira -= comp1.preco;
                        Thread.sleep(500);
                        System.out.println("PC adicionado");
                    }


                    System.out.println("--------------------------------------------------------------------------------------------------------------------");
                    break;

                case 2:
                    comp2.mostraPCConfigs();
                    System.out.println("Digite (1/Adicionar ao carrinho -2/nao adicionar)" );
                    int comprar2= entrada.nextInt();


                    if(comprar2 == 1 && cliente.carteira < comp2.preco){
                        Thread.sleep(500);
                        System.out.println("Saldo Insuficiente para comprar esse dispositivo");
                        System.out.println("Veja outras promoções!");
                    }
                    if(comprar2 == 2){
                        Thread.sleep(500);
                        System.out.println("Veja outras promoções!");
                    }
                    if(comprar2==1&& cliente.carteira >= comp2.preco){
                        cliente.promo2++;
                        cliente.carteira -= comp2.preco;
                        Thread.sleep(500);
                        System.out.println("PC adicionado");
                    }


                    System.out.println("--------------------------------------------------------------------------------------------------------------------");
                    break;

                case 3:

                    comp3.mostraPCConfigs();
                    System.out.println("Digite (1/Adicionar ao carrinho-2/nao adicionar)" );
                    int comprar3= entrada.nextInt();


                    if(comprar3 == 1 && cliente.carteira < comp3.preco){
                        Thread.sleep(500);
                        System.out.println("Saldo Insuficiente para comprar esse dispositivo");
                        System.out.println("Veja outras promoções!");
                    }
                    if(comprar3 == 2){
                        Thread.sleep(500);
                        System.out.println("Veja outras promoções!");
                    }
                    if(comprar3==1&& cliente.carteira >= comp3.preco){
                        cliente.promo3++;
                        cliente.carteira -= comp3.preco;
                        Thread.sleep(500);
                        System.out.println("PC adicionado");
                    }

                    System.out.println("--------------------------------------------------------------------------------------------------------------------");

                    break;
                case 4:
                    System.out.println("Sua carteira possue saldo de: R$" + cliente.carteira);
                    System.out.println("--------------------------------------------------------------------------------------------------------------------");

                    break;
                case 0:
                    flag = false;
                    System.out.print("Indo do caixa.");
                    Thread.sleep(500);
                    System.out.print(".");
                    Thread.sleep(500);
                    System.out.println(".");
                    Thread.sleep(500);
                    System.out.println("--------------------------------------------------------------------------------------------------------------------");

                    break;

                default:
                    System.out.println("Só temos 5 opcoes, digite novamente!");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------");

                    break;
            }
        }
        float valor_total = cliente.calculaTotalCompra();
        System.out.println("Suas compras ficaram: R$" + valor_total);
        System.out.print("Confirmar compra(true/false): ");
        boolean confirmar_compra = entrada.nextBoolean();
        if(confirmar_compra == true){
            System.out.print("Emitindo nota fiscal.");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.println(".");
            Thread.sleep(500);
            System.out.println("|--------------------------------------------------");
            System.out.println("|                      Pc Mania                    |");
            System.out.println("|   Cliente: " + cliente.nome);
            System.out.println("|   Cpf: " + cliente.cpf);
            System.out.println("|   Cliente: " + cliente.nome);
            System.out.println("|   Total: R$" + valor_total);
            System.out.println("|   Saldo conta: R$"+cliente.carteira);
            System.out.println("|                     VOLTE SEMPRE                  |");
            System.out.println("|---------------------------------------------------|");

        }
        else
        {
            System.out.println("Suas compras ficaram: R$ 0");
            System.out.println("Seu saldo de carteira ficou: R$" + carteira_inicial);
        }

    }
}