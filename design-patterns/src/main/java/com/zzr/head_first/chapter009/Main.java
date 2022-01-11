package com.zzr.head_first.chapter009;

/**
 * @author zhaozhirong
 * @date 2022/1/9 10:56 上午
 */
public class Main {

    public static void main(String[] args) {
        MenuComponent dinnerMenu = new Menu("DINNER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert MENU", "Dinner");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        dinnerMenu.add(new MenuItem("chaomian", "chaomian", false, 10));

        dinnerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("kuanchaomian", "kuanchaomian", false, 10));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

    }

}
