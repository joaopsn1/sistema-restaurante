package dominio;

import repositorio.MenuBebidas;
import repositorio.MenuDoces;
import repositorio.MenuPorcoes;
import repositorio.MenuPratos;

public class Restaurante implements MenuPratos, MenuPorcoes, MenuDoces, MenuBebidas {
    @Override
    public void menuPratos() {
        MenuPratos.super.menuPratos();
    }

    @Override
    public void menuPorcoes() {
        MenuPorcoes.super.menuPorcoes();
    }

    @Override
    public void menuDoces() {
        MenuDoces.super.menuDoces();
    }

    @Override
    public void menuBebidas() {
        MenuBebidas.super.menuBebidas();
    }
}
