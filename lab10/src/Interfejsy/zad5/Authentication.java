package Interfejsy.zad5;

public interface Authentication {
    public boolean login(String namem,String password);

    public void logout();

    public boolean resetPassword(String namem,String oldPassword,String newPassword);
}