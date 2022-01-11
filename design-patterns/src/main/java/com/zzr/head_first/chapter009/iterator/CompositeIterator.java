package com.zzr.head_first.chapter009.iterator;

import com.zzr.head_first.chapter009.Menu;
import com.zzr.head_first.chapter009.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author zhaozhirong
 * @date 2022/1/9 11:37 上午
 */
public class CompositeIterator implements Iterator {

    private Stack<Iterator> stack;

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.isEmpty()){
            return false;
        }else {
            Iterator iterator = stack.peek();
            if(!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()){
            Iterator iterator = stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if(component instanceof Menu){
                stack.push(component.createIterator());
            }
            return component;
        }
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
