package com.zzr.head_first.chapter009;

import java.util.Iterator;

/**
 * @author zhaozhirong
 * @date 2022/1/9 11:22 上午
 */
public class Waitress {

    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    public void printVegetarianMenu(){
        Iterator iterator = allMenus.createIterator();
        while (iterator.hasNext()){
            MenuComponent component = (MenuComponent) iterator.next();
            try {
                if(component.isVegetarian()){
                    component.print();
                }
            }catch (UnsupportedOperationException e){

            }
        }
    }

}
