import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;


public class Encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//Generate a secret key for DES encryption algorithm
            KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
            SecretKey myDesKey = keygenerator.generateKey();

            //Get the instance of Cipher class for DES
            Cipher desCipher;
            desCipher = Cipher.getInstance("DES");

            //Get User Input Text
            Scanner scanner  = new Scanner(System.in);
            System.out.print("Enter Text: ");
            String userText = scanner.nextLine();
            //Convert user text into byte array
            byte[] text = userText.getBytes("UTF8");


            //Encrypt user text and stored it in byte array
            desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
            byte[] textEncrypted = desCipher.doFinal(text);

            String s = new String(textEncrypted);
            System.out.println(s);

            //Decrypt user text and stored it into byte array
            desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
            byte[] textDecrypted = desCipher.doFinal(textEncrypted);

            s = new String(textDecrypted);
            System.out.println(s);
        }catch(Exception e)
        {
            System.out.println("Exception");
        }
	}

}
