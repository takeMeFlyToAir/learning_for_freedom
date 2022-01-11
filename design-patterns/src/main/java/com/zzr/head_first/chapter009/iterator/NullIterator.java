package com.zzr.head_first.chapter009.iterator;

import java.util.Iterator;

/**
 * @author zhaozhirong
 * @date 2022/1/9 11:35 上午
 */
public class NullIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
