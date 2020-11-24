package com.frederick.observer_pull;

public class Chart implements Observer {
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void Update() {
        System.out.println("Chart got updated: " + dataSource.getChartValue());
    }
}
