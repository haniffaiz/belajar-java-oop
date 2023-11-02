package programmer.zaman.now.application;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.ValidationException;
import programmer.zaman.now.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("hanz", "123");

        try{
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException e){
            System.out.println("Data tidak valid : " + e.getMessage());
        } finally {
            System.out.println("Error ga error ini selslu di eksekusi");
        }
    }
}
