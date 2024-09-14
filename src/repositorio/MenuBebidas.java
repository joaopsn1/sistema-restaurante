package repositorio;

public interface MenuBebidas {
    public default void menuBebidas() {
        System.out.println("Menu Bebidas");
        System.out.println("1- Coca-Cola Zero - R$ 5,00");
        System.out.println("2- Suco de Laranja - R$ 7,00");
        System.out.println("3- Água - R$ 2,00");
        System.out.println("4- Heineken - R$ 10,00");
        System.out.println("0- Sair do Menu Bebidas");
    }

    public default double getPrecoBebidas(int opcao) {
        switch (opcao) {
            case 1:
                return 5.00;
            case 2:
                return 7.00;
            case 3:
                return 2.00;
            case 4:
                return 10.00;
            default:
                return 0;
        }
    }
}
