package Interfejsy.zad5;

public class AdminAuthentication implements  Authentication{

    private String name;
    private  String password;

    @Override
    public boolean login(String name,String password){
        if(this.name.equals(name) && this.password.equals(password)){
            return  true;
        }
        return false;
    }
    @Override
    public void logout(){
        System.out.println("Zostałeś wylogowany");
    }
    @Override
    public boolean resetPassword(String login,String oldPassword,String newPassword){
        if(this.name.equals(name) && this.password.equals(oldPassword)){
            this.password=newPassword;
            return true;
        }
        return false;
    }

}
