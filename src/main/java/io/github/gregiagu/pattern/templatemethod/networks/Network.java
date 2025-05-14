package io.github.gregiagu.pattern.templatemethod.networks;

public interface Network {

    default Boolean post(String message) {

        if ( logIn(getUserName(), getPassword()) ) {
            Boolean result = sendData( message.getBytes() );
            logOut();
            return result;
        }
        return false;
    }

    boolean logIn(String userName, String password);

    void logOut();

    Boolean sendData(byte[] bytes);

    String getPassword();

    String getUserName();
}
