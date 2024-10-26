package org.example;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IServiceCalculator extends Remote{
    int Add(int a , int b) throws RemoteException;
    int Subtract(int a , int b) throws RemoteException;
    int Multiply(int a , int b) throws RemoteException;
    int Divide(int a , int b) throws RemoteException;
}
