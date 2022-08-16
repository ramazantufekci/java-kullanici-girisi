import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName,password,soru,yeniPassword,eskiPassword="java123";
        Scanner girdi = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        userName = girdi.nextLine();

        System.out.print("Şifreniz : ");
        password = girdi.nextLine();
        if(userName.equals("patika")&&password.equals("java123")){
            System.out.println("Giriş Yaptınız !");
        }else {
            System.out.println("Bilgileriniz Yanlış !");
            if(userName.equals("patika") && !password.equals("java123")){
                System.out.print("Şifreyi sıfırlamak istermisiniz?(e/h)");
                soru = girdi.nextLine();
                if(soru.equals("e")){
                    System.out.print("Yeni şifrenizi giriniz : ");
                    yeniPassword = girdi.nextLine();
                    if(yeniPassword!=eskiPassword){
                        System.out.println("Şifre oluşturuldu.");
                    }else{
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                }
            }
        }
    }
}
