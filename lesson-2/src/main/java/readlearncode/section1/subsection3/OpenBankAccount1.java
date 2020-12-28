package readlearncode.section1.subsection3;

import readlearncode.section1.subsection2.*;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class OpenBankAccount1 {

    public static void main(String... args) {
        readlearncode.section1.subsection2.BankAccount account;
        int age = 21;
        if (age >= 18) {
            account = new readlearncode.section1.subsection2.BankAccount();
            System.out.println("Welcome. Your bank account is now open!");
        }
    }
}