package com.frederick.observer_pull;

public class SpreadSheet implements Observer {
    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void Update() {
        System.out.println("SpreadSheet got notified: " + dataSource.getSpreadSheetValue());
    }
}
