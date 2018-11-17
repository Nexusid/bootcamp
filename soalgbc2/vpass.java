import java.util.Scanner;

public class vpass {
  public static void main(String[] args) {


      String inputPassword;

      // scanner untuk inputan
      Scanner input = new Scanner (System.in);

      // input password di sini
      System.out.print("Masukkan password kamu: ");
      inputPassword = input.next();
      passCheck(inputPassword);


  }

  public static void passCheck(String password){
      boolean valid = true;
      if(password.length() < 8){
          System.out.println("Password kurang dari 8 karakter.");
          valid = false;
      }
      String upperCase = "(.[A-Z].)";
      if(password.matches(upperCase)){
          System.out.println("Password harus terdapat minimal 1 huruf kapital.");
          valid = false;
      }
      String numbers = "(.[0-9].)";
      if(password.matches(numbers)){
          System.out.println("Password harus terdapat minimal 1 angka.");
          valid = false;
      }
      String specialChars = "(.[ ! # @ $ % ^ & * ( ) - _ = + [ ] ; : ' \" , < . > / ?].)";
      if(password.matches(specialChars)){
          System.out.println("Password harus terdapat minimal 1 special character");
          valid = false;
      }
      if(valid){
          System.out.println("Password valid");
      }
  }
}