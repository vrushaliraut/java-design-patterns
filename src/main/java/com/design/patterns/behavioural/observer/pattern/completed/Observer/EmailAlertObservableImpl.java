package com.design.patterns.behavioural.observer.pattern.completed.Observer;

import com.design.patterns.behavioural.observer.pattern.completed.Observable.StockObservable;

public class EmailAlertObservableImpl implements NotificationAlertObserver {
    private String email;
    private StockObservable observable;

    public EmailAlertObservableImpl(String email, StockObservable iphoneStockObservable) {
        this.email = email;
        this.observable = iphoneStockObservable;
    }

    @Override
    public void update() {
        sendEmail(email);
    }

    private void sendEmail(String email) {
        System.out.println("mail sent to :" + email);

    }
}
