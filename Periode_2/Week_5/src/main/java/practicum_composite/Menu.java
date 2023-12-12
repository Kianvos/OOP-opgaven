package practicum_composite;

import java.util.ArrayList;

public class Menu extends Component {

    private ArrayList<Component> menuOptions;

    public Menu(String title) {
        super(title);
        this.menuOptions = new ArrayList<>();
    }

    public void add(Component menuOption) {
        menuOptions.add(menuOption);
    }

    public Component getMenuOption(int number) {
        return this.menuOptions.get(number - 1);
    }

    public int menuOptionCount() {
        return this.menuOptions.size();
    }

}
