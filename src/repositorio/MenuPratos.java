package repositorio;

public interface MenuPratos {
    public default void menuPratos() {
        System.out.println("Menu Pratos Feitos");
        System.out.println("1- Parmegiana de Frango - R$ 24,00");
        System.out.println("2- Bife a Cavalo - R$ 21,00");
        System.out.println("3- Risoto de 2 queijos - R$ 49,50");
        System.out.println("4- Strogonoff de Frango - R$ 33,50");
        System.out.println("0- Sair do Menu Pratos Feitos");
    }

    public default double getPrecoPratos(int opcao) {
        switch (opcao) {
            case 1:
                return 24.00;
            case 2:
                return 21.00;
            case 3:
                return 49.50;
            case 4:
                return 33.50;
            default:
                return 0;
        }
    }
}
