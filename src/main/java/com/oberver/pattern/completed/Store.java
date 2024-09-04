package com.oberver.pattern.completed;

import com.oberver.pattern.completed.Observable.IphoneObservableImpl;
import com.oberver.pattern.completed.Observable.StockObservable;
import com.oberver.pattern.completed.Observer.EmailAlertObservableImpl;
import com.oberver.pattern.completed.Observer.MobileAlertObservableImpl;
import com.oberver.pattern.completed.Observer.NotificationAlertObserver;

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
