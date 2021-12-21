/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package software;

import java.util.Map;

/**
 *
 * @author mahmouderradi
 */
public class Software {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoginInfo loginInfo = new LoginInfo();
				
	//LoginFrame loginPage = new LoginFrame(LoginInfo.getLoginInfo());
        
        LoginFrame loginPage = new LoginFrame();
        
        loginPage.setVisible(true);

    }
    
}
