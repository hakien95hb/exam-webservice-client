/**
 * EmployeeService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.exam.service;

public interface EmployeeService extends java.rmi.Remote {
    public void save(com.exam.service.Employee arg0) throws java.rmi.RemoteException;
    public void updateEmployee(com.exam.service.Employee arg0, long arg1) throws java.rmi.RemoteException;
    public com.exam.service.Employee[] getEmployee() throws java.rmi.RemoteException;
}
