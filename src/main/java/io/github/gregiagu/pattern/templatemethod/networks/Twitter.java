package io.github.gregiagu.pattern.templatemethod.networks;

public class Twitter 
implements Network{

    @Override
    public boolean logIn(String userName, String password) {
        if ( userName.length() > 0 && password.length() > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public void logOut() {
        System.out.println("You have successfully logged out from Twitter.");
    }

    @Override
    public Boolean sendData(byte[] bytes) {
        System.out.println("Message: '" + new String(bytes) + "' was posted on Twitter." );
        return true;
    }

    @Override
    public String getPassword() {
        return "l0*Pahnnd85";
    }

    @Override
    public String getUserName() {
        return "usrname@email.com";
    }

}
