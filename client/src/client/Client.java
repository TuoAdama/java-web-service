/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.net.URL;
import ws.CalculatriceService;
import ws.Operation;

/**
 *
 * @author tuo
 */
public class Client{
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://192.168.1.165:8080/ws/demo?wsdl");
        CalculatriceService cal = new CalculatriceService(url);
        Operation operation = cal.getCalculatricePort();
        System.out.println(operation.addtion(10, 20));
        System.out.println(operation.multiplication(40, 20));
    }
    
}
