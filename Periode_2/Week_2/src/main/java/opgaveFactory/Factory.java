package opgaveFactory;

import practicum.Pizza;

abstract public class Factory {

    public Factory(){

    }

    abstract public Pizza createPizzaFunghi();
    abstract public Pizza createPizzaHawaii();
    abstract public Pizza createPizzaALTonno();
}
