package dominio;

import repositorio.MenuBebidas;
import repositorio.MenuDoces;
import repositorio.MenuPorcoes;
import repositorio.MenuPratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente implements MenuPratos, MenuBebidas, MenuDoces, MenuPorcoes {
    private String nome;
    private int idade;
    private List<String> pedidos;
    private double total;
    Scanner scanner = new Scanner(System.in);

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.pedidos = new ArrayList<>();
        this.total = 0;
    }

    public void imprimirPedidos() {
        System.out.println("Pedidos Feitos");
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido foi feito");
        } else {
            for (String pedido : pedidos) {
                System.out.println(pedido);
            }
        }
        System.out.printf("Valor Conta: R$ %.2f\n", total);
        System.out.printf("Valor Conta c/ 10 %% do Garçom: R$ %.2f\n", (total*0.1) + total);

    }

    public void pedidoPratos() {
        System.out.print("Escolha uma opção do Menu de Pratos: ");
        int menuPratos = scanner.nextInt();
        String pedido = "";
        double preco = 0;
        switch (menuPratos) {
            case 1:
                pedido = "Parmegiana de Frango";
                preco = getPrecoPratos(menuPratos);
                break;
            case 2:
                pedido = "Bife a Cavalo";
                preco = getPrecoPratos(menuPratos);
                break;
            case 3:
                pedido = "Risoto de 2 queijos";
                preco = getPrecoPratos(menuPratos);
                break;
            case 4:
                pedido = "Strogonoff de Frango";
                preco = getPrecoPratos(menuPratos);
                break;
            default:
                System.out.println("Escolha não disponível no cardápio");
                pedido = "Nenhum prato";
        }
        pedidos.add(pedido + " - R$ " + preco);
        total += preco;
        System.out.println(pedido + " adicionado ao pedido.");
        System.out.printf("Preço: R$ %.2f\n", preco);
    }

    public void pedidoPorcoes() {
        System.out.print("Escolha uma opção do Menu de Porções: ");
        int menuPorcoes = scanner.nextInt();
        String pedido = "";
        double preco = 0;
        switch (menuPorcoes) {
            case 1:
                pedido = "Fritas c/ Cheddar e Bacon";
                preco = getPrecoPorcoes(menuPorcoes);
                break;
            case 2:
                pedido = "Bolinho de Costela";
                preco = getPrecoPorcoes(menuPorcoes);
                break;
            case 3:
                pedido = "Tiras de Tilápia";
                preco = getPrecoPorcoes(menuPorcoes);
                break;
            case 4:
                pedido = "Frango a Passarinho";
                preco = getPrecoPorcoes(menuPorcoes);
                break;
            default:
                System.out.println("Escolha não disponível no cardápio");
                pedido = "Nenhuma porção";
        }
        pedidos.add(pedido + " - R$ " + preco);
        total += preco;
        System.out.println(pedido + " adicionado ao pedido.");
        System.out.printf("Preço: R$ %.2f\n", preco);
    }

    public void pedidoDoces() {
        System.out.print("Escolha uma opção do Menu de Doces: ");
        int menuDoces = scanner.nextInt();
        String pedido = "";
        double preco = 0;
        switch (menuDoces) {
            case 1:
                pedido = "Petit Gateu";
                preco = getPrecoDoces(menuDoces);
                break;
            case 2:
                pedido = "Brownie c/ Sorvete";
                preco = getPrecoDoces(menuDoces);
                break;
            case 3:
                pedido = "Churros";
                preco = getPrecoDoces(menuDoces);
                break;
            case 4:
                pedido = "Taça de Sorvete";
                preco = getPrecoDoces(menuDoces);
                break;
            default:
                System.out.println("Escolha não disponível no cardápio");
                pedido = "Nenhum doce";

        }
        pedidos.add(pedido + " - R$ " + preco);
        total += preco;
        System.out.println(pedido + " adicionado ao pedido.");
        System.out.printf("Preço: R$ %.2f\n", preco);
    }

    public void pedidoBebidas() {
        System.out.print("Escolha uma opção do Menu de Bebidas: ");
        int menuBebidas = scanner.nextInt();
        String pedido = "";
        double preco = 0;
        switch (menuBebidas) {
            case 1:
                pedido = "Coca-Cola Zero";
                preco = getPrecoBebidas(menuBebidas);
                break;
            case 2:
                pedido = "Suco de Laranja";
                preco = getPrecoBebidas(menuBebidas);
                break;
            case 3:
                pedido = "Água";
                preco = getPrecoBebidas(menuBebidas);
                break;
            case 4:
                if (idade < 18) {
                    System.out.println("Venda não autorizada para menores de 18 anos");
                    return;
                }
                pedido = "Heineken";
                preco = getPrecoBebidas(menuBebidas);
                break;
            default:
                System.out.println("Escolha não disponível no cardápio");
                pedido = "Nenhuma bebida";

        }
        pedidos.add(pedido + " - R$ " + preco);
        total += preco;
        System.out.println(pedido + " adicionado ao pedido.");
        System.out.printf("Preço: R$ %.2f\n", preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
