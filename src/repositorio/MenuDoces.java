package repositorio;

public interface MenuDoces {
    public default void menuDoces() {
        System.out.println("Menu Doces");
        System.out.println("1- Petit Gateu - R$ 20,00");
        System.out.println("2- Brownie c/ Sorvete - R$ 18,00");
        System.out.println("3- Churros - R$ 15,00");
        System.out.println("4- Taça de Sorvete - R$ 25,00");
        System.out.println("0- Sair do Menu Doces");
    }

    public default double getPrecoDoces(int opcao) {
        switch (opcao) {
            case 1:
                return 20.00;
            case 2:
                return 18.00;
            case 3:
                return 15.00;
            case 4:
                return 25.00;
            default:
                return 0;
        }
    }
}
