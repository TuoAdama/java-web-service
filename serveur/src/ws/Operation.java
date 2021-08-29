/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Operation {
    
    @WebMethod
    public int addtion(int a, int b);
    
    @WebMethod
    public int soustration(int a, int b);
    
    @WebMethod
    public int multiplication(int a, int b);
}
