package Interfejsy.zad5;

 public class UserAuthentication implements  Authentication{
      private String name;
      private  String password;

  @Override
   public boolean login(String name,String password){
        if(this.name==name && this.password==password){
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
   if(this.name==name && this.password==oldPassword){
    this.password=newPassword;
    return true;
   }
   return false;
  }

}
