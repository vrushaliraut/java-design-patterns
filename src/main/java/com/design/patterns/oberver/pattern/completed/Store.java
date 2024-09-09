package com.design.patterns.oberver.pattern.completed;

import com.design.patterns.oberver.pattern.completed.Observable.IphoneObservableImpl;
import com.design.patterns.oberver.pattern.completed.Observable.StockObservable;
import com.design.patterns.oberver.pattern.completed.Observer.EmailAlertObservableImpl;
import com.design.patterns.oberver.pattern.completed.Observer.NotificationAlertObserver;
import com.design.patterns.oberver.pattern.completed.Observer.MobileAlertObservableImpl;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObservableImpl("vrushali@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObservableImpl("aa@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObservableImpl("vrushali_username", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}
