package admins;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class AdminUsuarioTest {
    
    AdminUsuario admin = new AdminUsuario();
    
    @Test
    public void testDeLoginValidandCMDoUsuarioYContrasenya() {
        String user = "jpereira";
        String pass = "a1b2c3";
        
        admin.loginUser(user, pass);
        
    }
    
    @Test
    public void testDeLoginValidandoUsuarioYContrasenyaNoNulos() {
        String user = "";
        String pass = "";
        
        admin.loginUser(user,pass);
        
    }
}
