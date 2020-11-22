package com.frederick.observer;

public class Main {
    public static void main(String[] args) {
        var dataSource = new DataSource();

        var sheet1 = new SpreadSheet();
        var sheet2 = new SpreadSheet();
        var chart1 = new Chart();
        var chart2 = new Chart();

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart1);
        dataSource.addObserver(chart2);

        dataSource.notifyObservers();
    }
}
