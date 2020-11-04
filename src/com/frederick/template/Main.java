package com.frederick.template;

public class Main {
    public static void main(String[] args) {
        var task1 = new TransferMoneyTask(new AuditTrail());
        task1.execute();

        var task2 = new GenerateReportTask();
        task2.execute();
    }
}
