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
public class Admin extends User{

    
//  private String code;

    public Admin(String code, String type, String name, String email, String comment, int points, String service) {
        super(type, name, email, comment, service);
//        this.code = code;
    }

//    public String getCode() {
//        return code;
//    }

//    public void setCode(String code) {
//        this.code = code;
//    }

//    @Override
//    public String toString() {//hereda y agrego el code
//       
//       return super.toString()+ " code = "+ getCode();
//    }
//    
//    
//    }

    @Override
    public void AGREGARNOMBRE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String AGREGARNOMBRE2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
