/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package software;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author mahmouderradi
 */
public class LoginInfo { //UNUSED FOR NOW HASHMAP USED DIRECTLY IN LOGINNFRAME
    
    static Map<String,String> loginInfo = new HashMap<>();

    LoginInfo(){
        loginInfo.put("Software","Engineering");
        loginInfo.put("software","engineering");
        loginInfo.put("AZERTYUIOP","123456789");
    }

    public static Map<String,String> getLoginInfo(){
        
        return loginInfo;
        
    }

}
