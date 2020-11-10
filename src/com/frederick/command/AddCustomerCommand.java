package com.frederick.command;

import com.frederick.command.fx.Command;

public class AddCustomerCommand implements Command {
    private CustomerService service;

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    public void execute() {
        service.addCustomer();
    }
}
