package test;

import dominio.Cliente;
import dominio.Restaurante;

public class RestauranteTest {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        Cliente cliente = new Cliente("João Pedro", 22);

        restaurante.menuPratos();
        System.out.println("--------------------------");
        restaurante.menuPorcoes();
        System.out.println("--------------------------");
        restaurante.menuDoces();
        System.out.println("--------------------------");
        restaurante.menuBebidas();
        System.out.println("--------------------------");

        cliente.pedidoPratos();
        System.out.println("--------------------------");
        cliente.pedidoPorcoes();
        System.out.println("--------------------------");
        cliente.pedidoDoces();
        System.out.println("--------------------------");
        cliente.pedidoBebidas();
        System.out.println("--------------------------");
        cliente.imprimirPedidos();
    }
}
