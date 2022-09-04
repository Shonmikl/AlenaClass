package tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
    public int a;

    private Connection getNewConnection() throws SQLException {
        String url = "jdbc:h2:mem:test";
        String user = "sa";
        String passwd = "sa";
        return DriverManager.getConnection(url, user, passwd);
    }

    // мд сН вН имя(глагол) параметры тело
    //public  static  void  name ()
    //private non static smth (........) {return;}
    //protected
    //package private
    //static вступает в интимную связь только с классом
    //non static вступает в интимную связь ТОЛЬКО с объектом
         public void getSmth(String... s) {

         }



    public static void main(String[] args) {
       Integer a = 0;
        int b = 0;
        Test test = new Test();
        test.getSmth();
    }
}