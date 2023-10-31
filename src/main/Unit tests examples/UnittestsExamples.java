package decathlon;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnittestsExamples {

        @Test
        public void testUserName(){
            User2 user2 = new User2("name", "password");
            String expected = "name";
            String actual = user2.getUserName();
            assertEquals(expected,actual);
        }
        @Test
        public void testPassword(){
            User2 user2 = new User2("name","Gurka");
            String expected = "Gurka";
            String actual = user2.getPassword();
            assertEquals(expected,actual);
        }
        @Test
        public void testChangeUserName(){
            User2 user2 = new User2("name","Gurka");
            String expected = "adam";
            user2.updateUserName("adam");
            String actual = user2.getUserName();
        }
        @Test
        public void testNameAtLeastFourChars(){
            User2 user2 = new User2("Biomechanical", "thingsarenull");
            String expected = "Biomechanical";
            user2.updateUserName("get");
            String actual = user2.getUserName();
            assertEquals(expected,actual);
        }
        @Test
        public void testNoUserName(){
            User2 user2 = new User2("HejHejHej", "longlongmam");
            String expected = "HejHejHej";
            user2.updateUserName("");
            String actual = user2.getUserName();
        }
        @Test
        public void testFourLetterUserName(){
            User2 user2 = new User2("Staffan", "longlongman");
            String expected = "Gurk";
            user2.updateUserName("Gurk");
            String actual = user2.getUserName();
            assertEquals(expected,actual);
        }
        @Test
        public void testTooLongPassword(){
            User2 user2 = new User2("Staffan", "longlongman");
            String expected = "longlongman";
            user2.changePassword("averylongpasswordthatisntreallyveryfeasibleisithowaboutthathuhdontyouthinkthisislongenough?");
            String actual = user2.getPassword();
            assertEquals(expected,actual);
        }
        @Test
        public void testTypeOfUser(){
            User2 user2 = new User2("Adam", "Password");
            String expected = "normal";
            String actual = user2.getTypeOfUser();
            assertEquals(expected,actual);
        }
        @Test
        public void testChangeTypeOfUser(){
            User2 user2 = new User2("Adam", "Password");
            String expected = "admin";
            user2.changeTypeOfUser("admin");
            String actual =  user2.getTypeOfUser();
            assertEquals(expected,actual);
        }
        @Test
        public void testChangeWrongTypeOfUser() {
            User2 user2 = new User2("Adam", "Password");
            String expected = "normal";
            user2.changeTypeOfUser("super user");
            String actual = user2.getTypeOfUser();
            assertEquals(expected,actual);
        }
        @Test
        public void testPasswordContainsSpecial() {
            User2 user2 = new User2("Adam", "Gaston57!");
            String expected = "Gaston57!";
            user2.changePassword("Mumriken");
            String actual = user2.getPassword();
            assertEquals(expected,actual);
        }
        @Test
        public void testWrongPasswordChangeSpecial() {
            User2 user2 = new User2("Adam", "Gaston57!");
            String expected = "Gaston57&";
            user2.changePassword("Gaston57&");
            String actual = user2.getPassword();
            assertEquals(expected,actual);
        }
        @Test
        public void testLowerAndUpperCase() {
            User2 user2 = new User2("Adam", "Password!");
            String expected = "Password!";
            user2.changePassword("gotfried!");
            String actual = user2.getPassword();
            assertEquals(expected,actual);
        }
        @Test
        public void testGoldMember(){
            User2 user2 = new User2("Adam", "Password!");
            String expected = "gold member";
            user2.changeTypeOfUser("gold member");
            String actual = user2.getTypeOfUser();
            assertEquals(expected, actual);
        }
        @Test
        public void testGoldMemberSet(){
            User2 user2 = new User2("Adam", "Password!");
            String expected = "gold member";
            String actual = user2.getTypeOfUser(20);
            assertEquals(expected, actual);
        }

    }
}
