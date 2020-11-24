package com.frederick.observer_pull;

public class Main {
    public static void main(String[] args) {
        var dataSource = new DataSource();

        var sheet1 = new SpreadSheet(dataSource);
        var sheet2 = new SpreadSheet(dataSource);
        var chart1 = new Chart(dataSource);
        var chart2 = new Chart(dataSource);

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart1);
        dataSource.addObserver(chart2);

        var spreadSheetValue = 3;
        var chartValue = 4;
        dataSource.setValue(spreadSheetValue, chartValue);
    }
}
