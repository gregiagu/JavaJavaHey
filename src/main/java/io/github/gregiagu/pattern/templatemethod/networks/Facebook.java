package io.github.gregiagu.pattern.templatemethod.networks;

public class Facebook
implements Network {

    @Override
    public boolean logIn(String userName, String password) {
        if ( userName.length() > 0 && password.length() > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public void logOut() {
        System.out.println("You have successfully logged out from Facebook.");
    }

    @Override
    public Boolean sendData(byte[] bytes) {
        System.out.println("Message: '" + new String(bytes) + "' was posted on Facebook." );
        return true;
    }

    @Override
    public String getPassword() {
        return "Ab**097";
    }

    @Override
    public String getUserName() {
        return "usr@name.com";
    }

}
