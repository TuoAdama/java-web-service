/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;

@WebService(endpointInterface = "ws.Operation")
public class Calculatrice implements Operation{

    @Override
    public int addtion(int a, int b) {
        System.out.println(a +" + " + b + " = " + (a+b));
        return a+b;
    }

    @Override
    public int soustration(int a, int b) {
        System.out.println(a +" - " + b + " = " + (a-b));
        return a-b;
    }

    @Override
    public int multiplication(int a, int b) {
        System.out.println(a +" * " + b + " = " + (a*b));
        return a*b;
    }
    
}
