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
public class Client extends User{
//     private String sucursal;

    public Client(String sucursal, String type, String name, String email, String comment, int points, String service) {
       super(type, name, email, comment, service);
//        this.sucursal = sucursal;
    }

//    public String getSucursal() {
//        return sucursal;
//    }
//
//    public void setSucursal(String sucursal) {
//        this.sucursal = sucursal;
//    }

//    @Override
//    public String toString() {//hereda de contact y agrego sucursal
//    
//       return super.toString() + " sucursal = "+ getSucursal();
//    }
//    
//    
//}
//}

    @Override
    public void AGREGARNOMBRE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String AGREGARNOMBRE2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}