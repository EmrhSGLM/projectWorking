package pojos;

public class US018User {

    private String login;
    private boolean activated;


    public US018User(String login, boolean activated) {
        this.login = login;
        this.activated = activated;
    }

    public US018User(){}


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    @Override
    public String toString() {
        return "US018User{" +
                "login='" + login + '\'' +
                ", activated=" + activated +
                '}';
    }
}
