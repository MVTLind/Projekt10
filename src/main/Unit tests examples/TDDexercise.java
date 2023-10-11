package decathlon;

public class TDDexercise {
        private String userName;
        private String password;
        private String typeOfUser;
        private int logins;
        public User2(String userName, String password) {
            this.userName = userName;
            this.password = password;
            logins = 1;
            typeOfUser = "normal";
        }
        public String getUserName() {
            return userName;
        }
        public String getPassword() {
            return password;
        }
        public void updateUserName(String name) {
            if (name.length() >= 4){
                userName = name;
            }
        }
        public void changePassword(String pass) {
            if (pass.chars().anyMatch(Character::isLowerCase) && pass.chars().anyMatch(Character::isUpperCase)){
                if (pass.length()<= 20 && pass.length() >= 7 && pass.matches(".*[!$#&].*")){
                    password = pass;
                }
            }

        }
        public String getTypeOfUser() {
            return typeOfUser;
        }
        public String getTypeOfUser(int logins) {
            if (logins >= 20) {
                typeOfUser = "gold member";
            }
            return typeOfUser;
        }
        public void changeTypeOfUser(String type) {
            if (type.equalsIgnoreCase("normal") || type.equalsIgnoreCase("admin") || type.equalsIgnoreCase("super") || type.equalsIgnoreCase("gold member")) {
                typeOfUser = type;
            }
        }
    }
}
