package dominio;

import repositorio.MenuBebidas;
import repositorio.MenuDoces;
import repositorio.MenuPorcoes;
import repositorio.MenuPratos;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Cliente implements MenuPratos, MenuBebidas, MenuDoces, MenuPorcoes {
    private String nome;
    private int idade;
    private List<String> pedidos;
    private double total;
    Scanner scanner = new Scanner(System.in);
    Locale localeDefault = Locale.getDefault();
    NumberFormat nfa = NumberFormat.getCurrencyInstance(localeDefault);

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.pedidos = new ArrayList<>();
        this.total = 0;
    }

    public void imprimirPedidos() {
        System.out.println("Pedidos Feitos");
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido foi feito!");
        } else {
            for (String pedido : pedidos) {
                System.out.println(pedido);
            }
            System.out.println("Valor Conta: " + nfa.format(total));
            System.out.println("Valor Conta c/ 10 % do Garçom: " + nfa.format((total * 0.1) + total));
        }
    }

    public void pedidoPratos() {
        int menuPratos;
        String pedido = "";
        double preco = 0;
        do {
            System.out.print("Escolha uma opção do Menu de Pratos: ");
            menuPratos = scanner.nextInt();
            switch (menuPratos) {
                case 0:
                    pedido = "Nenhum prato";
                    break;
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
                    System.out.println("Opção não disponível no cardápio! Escolha uma válida!");
            }
        } while (menuPratos < 0 || menuPratos > 4);
        if (menuPratos == 0) {
            System.out.println(pedido + " adicionado ao pedido.");
        } else {
            pedidos.add(pedido + " - " + nfa.format(preco));
            total += preco;
            System.out.println(pedido + " adicionado ao pedido.");
            System.out.println("Preço: " + nfa.format(preco));
        }
    }

    public void pedidoPorcoes() {
        int menuPorcoes;
        String pedido = "";
        double preco = 0;
        do {
            System.out.print("Escolha uma opção do Menu de Porções: ");
            menuPorcoes = scanner.nextInt();
            switch (menuPorcoes) {
                case 0:
                    pedido = "Nenhuma porção";
                    break;
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
                    System.out.println("Opção não disponível no cardápio! Escolha uma válida!");
            }
        } while (menuPorcoes < 0 || menuPorcoes > 4);
        if (menuPorcoes == 0) {
            System.out.println(pedido + " adicionado ao pedido.");
        } else {
            pedidos.add(pedido + " - " + nfa.format(preco));
            total += preco;
            System.out.println(pedido + " adicionado ao pedido.");
            System.out.println("Preço: " + nfa.format(preco));
        }
    }

    public void pedidoDoces() {
        int menuDoces;
        String pedido = "";
        double preco = 0;
        do {
            System.out.print("Escolha uma opção do Menu de Doces: ");
            menuDoces = scanner.nextInt();
            switch (menuDoces) {
                case 0:
                    pedido = "Nenhum doce";
                    break;
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
                    System.out.println("Opção não disponível no cardápio! Escolha uma válida!");
            }
        } while (menuDoces < 0 || menuDoces > 4);
        if (menuDoces == 0) {
            System.out.println(pedido + " adicionado ao pedido.");
        } else {
            pedidos.add(pedido + " - " + nfa.format(preco));
            total += preco;
            System.out.println(pedido + " adicionado ao pedido.");
            System.out.println("Preço: " + nfa.format(preco));
        }
    }

    public void pedidoBebidas() {
        int menuBebidas;
        String pedido = "";
        double preco = 0;
        do {
            System.out.print("Escolha uma opção do Menu de Bebidas: ");
            menuBebidas = scanner.nextInt();
            switch (menuBebidas) {
                case 0:
                    pedido = "Nenhuma bebida";
                    break;
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
                    System.out.println("Opção não disponível no cardápio! Escolha uma válida!");
            }
        } while (menuBebidas < 0 || menuBebidas > 4);
        if (menuBebidas == 0) {
            System.out.println(pedido + " adicionado ao pedido.");
        } else {
            pedidos.add(pedido + " - " + nfa.format(preco));
            total += preco;
            System.out.println(pedido + " adicionado ao pedido.");
            System.out.println("Preço: " + nfa.format(preco));
        }
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
