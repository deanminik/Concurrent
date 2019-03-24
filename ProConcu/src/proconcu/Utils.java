/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proconcu;

/**
 *
 * @author DeanBF
 */
public class Utils {
    //llenar la lista de clientes tanto administrador como cliente
    
    private User [] UsersList;

    public Utils() {
       UsersList = new User[4];
    }
     public void addDestinations(){
        UsersList[0] = new Client(sucursal, type, name, email, comment, 0, service);
        UsersList[1] = new Admin(code, type, name, email, comment, 0, service);
        UsersList[2] = new Client(sucursal, type, name, email, comment, 0, service);
        UsersList[3] = new Admin(code, type, name, email, comment, 0, service);
    }
    
}
