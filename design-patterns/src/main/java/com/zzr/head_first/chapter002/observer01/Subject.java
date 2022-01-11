package com.zzr.head_first.chapter002.observer01;

import com.zzr.head_first.chapter002.observer01.observer.Observer;

/**
 * @author zhaozhirong
 * @date 2022/1/1 10:11 下午
 */
public interface Subject {

    void registerObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObservers();

}
