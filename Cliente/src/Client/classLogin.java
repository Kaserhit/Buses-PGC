package Client;

import java.util.ArrayList;
import java.util.List;

public class classLogin {
    public List<String> user = new ArrayList<String>();
    public List<String> pass = new ArrayList<String>();
    
    public classLogin() {
        user.add("Admin");
        pass.add("admin");
    }
    
    public boolean Verificar(String users, String passw) {
        boolean result = false;
        if (user.contains(users) == true) {
            if (pass.contains(passw) == true) {
                result = true;
            }
        }
        return result;
    }

    public List<String> getUser() {
        return user;
    }

    public void setUser(ArrayList<String> user) {
        this.user = user;
    }

    public List<String> getPass() {
        return pass;
    }

    public void setPass(ArrayList<String> pass) {
        this.pass = pass;
    }
}
