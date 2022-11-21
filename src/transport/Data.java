package transport;

public class Data {
    private String login;
    private String password;
    private String confirmPassword;


    public Data(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public static boolean dataVerification(Data data) throws WrongLoginException, WrongPasswordException {
        System.out.println("начата проверка данных");
        if (data.getLogin().length() > 1
                && data.getLogin().length() < 20
                && data.getLogin() != null
                && !data.getLogin().isBlank()
                && !data.getLogin().matches("[A-Za-z0-9_]")) {
        } else {
            throw new WrongLoginException("неверное имя пользователя.");
        }
        if (data.getPassword().length() > 1
                && data.getPassword().length() < 20
                && data.getPassword() != null
                && !data.getPassword().isBlank()
                && !data.getPassword().matches("[A-Za-z0-9_]")
                && data.getPassword().equals(data.getConfirmPassword())
        ) {
            return true;
        } else {
            throw new WrongPasswordException("неверный пароль/пароли не совпадают.");
        }
    }


    public static boolean checkLogin(Data data) throws WrongLoginException {
        if (data.getLogin().length() > 1
                || data.getLogin().length() < 20
                || data.getLogin() != null
                || !data.getLogin().isBlank()
                || !data.getLogin().matches("[A-Za-z0-9_]")) {
            return true;
        } else {
            throw new WrongLoginException("Login");
        }
    }

    public static boolean checkPassword(Data data) throws WrongPasswordException {
        if (data.getPassword().length() > 1
                || data.getPassword().length() < 20
                || data.getPassword() != null
                || data.getPassword().isBlank()
                || !data.getPassword().matches("[A-Za-z0-9_]")
                || data.getPassword().length() == data.getConfirmPassword().length()) {
            return true;
        } else {
            throw new WrongPasswordException("Password");

        }

    }

    @Override
    public String toString() {
        return "Data{" + "login='" + login + '\'' + ", password='" + password + '\'' + ", confirmPassword='" + confirmPassword + '\'' + '}';
    }

    public static void det() {
        System.out.println("hgjh");
    }
}


