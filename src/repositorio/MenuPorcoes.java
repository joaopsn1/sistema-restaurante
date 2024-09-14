package repositorio;

public interface MenuPorcoes {
    public default void menuPorcoes() {
        System.out.println("Menu Porções");
        System.out.println("1- Fritas c/ Cheddar e Bacon - R$ 32,00");
        System.out.println("2- Bolinho de Costela - R$ 28,00");
        System.out.println("3- Tiras de Tilápia - R$ 22,00");
        System.out.println("4- Frango a Passarinho - R$ 25,00");
        System.out.println("0- Sair do Menu Porções");
    }

    public default double getPrecoPorcoes(int opcao) {
        switch (opcao) {
            case 1:
                return 32.00;
            case 2:
                return 28.00;
            case 3:
                return 22.00;
            case 4:
                return 25.00;
            default:
                return 0;
        }
    }
}
