package com.zzr.head_first.chapter009;

import com.zzr.head_first.chapter009.iterator.NullIterator;

import java.util.Iterator;

/**
 * @author zhaozhirong
 * @date 2022/1/9 11:13 上午
 */
public class MenuItem extends MenuComponent {

    private String name;

    private String description;

    private boolean vegetarian;

    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public Boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        System.out.print(" " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println("," + getPrice());
        System.out.println("    ----" + getDescription());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
