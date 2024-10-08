package com.design.patterns.behavioural.observer.pattern.completed.Observer;

import com.design.patterns.behavioural.observer.pattern.completed.Observable.StockObservable;

public class MobileAlertObservableImpl implements NotificationAlertObserver {

    private String username;
    private StockObservable observable;

    public MobileAlertObservableImpl(String username, StockObservable observable) {
        this.username = username;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMessageOnMobile(username);
    }

    private void sendMessageOnMobile(String username) {
        System.out.println("message sent to :" + username);

    }

}
