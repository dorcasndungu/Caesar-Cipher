import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continueCycle = true;

        while (continueCycle) {
            System.out.println("This is Caesar-cipher,it enables you to encode and decode messages with the use of a key. What would you like to do? Enter one of the following options:\n 1.Encode\n 2.Decode\n 3.Exit");
            Integer pickedOption = scanner.nextInt();

            if (pickedOption.equals(1)) {

                System.out.println("Ready to encrypt?Enter a key ranging from 1 to 25");
                Integer integerKey = scanner.nextInt();
                System.out.println("Enter your text:");
                String enteredString= scanner.next();


                encrypt encrypting = new encrypt(enteredString, integerKey);
                if (encrypting.validReceivedString() && encrypting.validKey()) {
                    System.out.println(String.format("\"Your encrypted text is %s for text %s using key %d", encrypting.encryption(),encrypting.getReceivedString(),encrypting.getEncryptKey()));
                } else if (!encrypting.validReceivedString()) {
                    System.out.println("Please enter a valid text (valid texts consist of letters only)");
                } else {
                    System.out.println("Please enter a valid key ranging from 1 to 25");
                }

            } else if (pickedOption.equals(2)) {
                System.out.println("Ready to decrypt?Enter a key ranging from 1 to 25");
                Integer integerKey = scanner.nextInt();
                System.out.println("Enter your text:");
                String enteredString= scanner.next();


                decrypt decrypting = new decrypt(enteredString, integerKey);
                if (decrypting.validReceivedString() && decrypting.validKey()) {
                    System.out.println(String.format("\"Your decrypted text is %s for text %s using key %d", decrypting.decryption(),decrypting.getReceivedString(),decrypting.getDecryptKey()));
                } else if (!decrypting.validReceivedString()) {
                    System.out.println("Please enter a valid text (valid texts consist of letters only)");
                } else {
                    System.out.println("Please enter a valid key ranging from 1 to 25");
                }
            } else if (pickedOption.equals(3)) {
                continueCycle = false;
                System.out.println("Bye :-)");

            } else {
                System.out.println("Please choose one of the options.");
            }
        }
    }
}


