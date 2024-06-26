package C_13_compositionAndEnumeration.Orders.model.entities;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Client {

    //Instanciando objeto para formtação de data
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 

    private String name;
    private String email;
    private Date birthDate;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    @Override
	public String toString() {
		return name + " (" + sdf.format(birthDate) + ") - " + email;
 	}
    
}
