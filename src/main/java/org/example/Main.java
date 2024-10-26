package org.example;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws RemoteException {
            try{
                Registry registry= LocateRegistry.getRegistry("192.168.1.101", 1099);
                IServiceCalculator calculator = (IServiceCalculator) registry.lookup("Calculator");
                System.out.println("soustraction : " + calculator.Subtract(10,5));
                System.out.println("Adition : " + calculator.Add(10,5));
            }catch (NotBoundException e) {
                throw new RuntimeException(e);
            }
    }
}