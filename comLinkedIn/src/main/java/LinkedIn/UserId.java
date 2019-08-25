package LinkedIn;

public class UserId {
    private String email;
    private String phone;
    private String password;

    public UserId(String email, String phone, String password){
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public String getEmail(){
        return email;
    }

    public String getPhone(){
        return phone;
    }

    public String getPassword(){
        return password;
    }





}
