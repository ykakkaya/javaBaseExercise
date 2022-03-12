package com.company;
import java.util.*;
public class UserNamePassword {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = "java";
        String password = "123456";
        System.out.println("kullanıcı adınızı giriniz");
        String user = scanner.nextLine();
        System.out.println("şifrenizi giriniz");
        String pass = scanner.nextLine();
        if (user.equals(userName) && pass.equals(password)) {
            System.out.println("giriş işlemi başarılı");
        } else {
            System.out.println("hatalı giriş şifrenizi sıfırlamak istermisiniz? \n evet için: 1\n hayır için :2");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    System.out.println("yeni şifreyi giriniz");
                    String newPassword;
                    newPassword = scanner.next();

                    if (password.equals(newPassword) ) {
                        System.out.println("şifre oluşturulamadı.Lütfen başka şife deneyiniz");
                    } else {
                        System.out.println("şifre oluşyturuldu");
                        password = newPassword;
                        System.out.println("yeni şifreniz :" + password);

                    }
                    break;
                case 2:
                    System.out.println("daha sonra rekrar deneyiniz");
                    break;
                default:
                    System.out.println("işlem başarısız");
                    break;
            }
        }
    }
}