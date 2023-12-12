package practicum_composite;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu mainmenu = new Menu("Main menu");
        Menu officemenu = new Menu("Office");
        Menu tmpmenu = new Menu("School");

        mainmenu.add(new MenuOption("Paint", "mspaint"));
        mainmenu.add(new MenuOption("Notepad", "notepad"));
        officemenu.add(new MenuOption("Microsoft Word", "C:\\Program Files\\Microsoft Office\\root\\Office16\\WINWORD.EXE"));
        officemenu.add(new MenuOption("Microsoft Excel", "C:\\Program Files\\Microsoft Office\\root\\Office16\\EXCEL.EXE"));

        tmpmenu.add(new MenuOption("Blackboard", ""));
        tmpmenu.add(new MenuOption("Digirooster", ""));
        tmpmenu.add(new MenuOption("Uitschrijven", ""));

        mainmenu.add(officemenu);
        mainmenu.add(tmpmenu);
        tmpmenu.add(mainmenu);
        officemenu.add(mainmenu);
//        mainmenu.add(officemenu);
        Menu currentMenu = mainmenu;

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println();
            System.out.println("*** "+currentMenu.getTitle()+" ***");
            System.out.println();
            for (int number = 1; number<=currentMenu.menuOptionCount(); number++) {
                Component menuOption = currentMenu.getMenuOption(number);
                System.out.println(number + ". " + menuOption.getTitle());
            }
            System.out.println();
            System.out.println("0. Quit");
            choice = Integer.parseInt(scanner.nextLine());
            if ((choice > 0) && (choice <= currentMenu.menuOptionCount())) {
                Component menuItem = currentMenu.getMenuOption(choice);

                if (menuItem instanceof MenuOption) {
                    ((MenuOption)menuItem).execute();
                }

                if (menuItem instanceof Menu) {
                    currentMenu=(Menu)menuItem;
                }
            }
        } while(choice!=0);

        Component menuItem = currentMenu.getMenuOption(choice);
    }

}