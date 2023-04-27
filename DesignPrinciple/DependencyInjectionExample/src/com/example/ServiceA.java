package com.example;

public class ServiceA implements Service {
    @Override
    public void write(String message) {
        System.out.println(message);
    }
}

class Client {
    private Service service;

    // injects via the constructor
    public Client(Service service) {
        this.service = service;
    }
    public void doSomething() {
        service.write("This is a message");
    }
    public void setService(Service service) {
        this.service = service;
    }

    public static void main(String[] args) {
        Service service1 = new ServiceA();  // the injector
        Client client = new Client(service1);   // injects via the constructor
        client.doSomething();

        client.setService(service1);
    }

}