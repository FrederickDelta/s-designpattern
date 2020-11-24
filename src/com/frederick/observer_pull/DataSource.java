package com.frederick.observer_pull;

public class DataSource extends Subject {
    private int spreadSheetValue;
    private int chartValue;

    public int getSpreadSheetValue() {
        return spreadSheetValue;
    }
    public int getChartValue() {
        return chartValue;
    }

    public void setValue(int spreadSheetValue, int chartValue) {
        this.spreadSheetValue = spreadSheetValue;
        this.chartValue = chartValue;
        this.notifyObservers();
    }
}
