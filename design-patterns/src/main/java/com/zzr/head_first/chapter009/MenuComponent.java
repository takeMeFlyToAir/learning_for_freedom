package com.zzr.head_first.chapter009;

import java.util.Iterator;

/**
 * @author zhaozhirong
 * @date 2022/1/9 10:57 上午
 */
public abstract class MenuComponent {

    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public Double getPrice(){
        throw new UnsupportedOperationException();
    }

    public Boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }

    public Iterator createIterator(){
        throw new UnsupportedOperationException();
    }

}
