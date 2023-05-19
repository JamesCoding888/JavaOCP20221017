package com.ocp.day19.jdbc.connection;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class JDBCEncryption {
    private static final String ALGORITHM = "AES";
    private static final String KEY = "4A23027820742BC80B0A9E3B54DEC34729CE74CD76C0208F90301D2B5920EDE9";

    public static String encrypt(String value) {
        try {
            SecretKeySpec secretKey = new SecretKeySpec(hexStringToByteArray(KEY), ALGORITHM);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedValue = cipher.doFinal(value.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(encryptedValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String decrypt(String encryptedValue) {
        try {
            SecretKeySpec secretKey = new SecretKeySpec(hexStringToByteArray(KEY), ALGORITHM);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decodedValue = Base64.getDecoder().decode(encryptedValue);
            byte[] decryptedValue = cipher.doFinal(decodedValue);
            return new String(decryptedValue, StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static byte[] hexStringToByteArray(String hexString) {
        int length = hexString.length();
        byte[] byteArray = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            byteArray[i / 2] = (byte) ((Character.digit(hexString.charAt(i), 16) << 4)
                    + Character.digit(hexString.charAt(i + 1), 16));
        }
        return byteArray;
    }

    public static void main(String[] args) {
        String url = encrypt("jdbc:mysql://localhost:3306/JavaDB?useUnicode=true&characterEncoding=utf-8");
        String user = encrypt("User1");
        String password = encrypt("1234");

        System.out.println("Encrypted URL: " + url);
        System.out.println("Encrypted User: " + user);
        System.out.println("Encrypted Password: " + password);

        // To decrypt the values, you can use the decrypt method
        String decryptedUrl = decrypt(url);
        String decryptedUser = decrypt(user);
        String decryptedPassword = decrypt(password);

        System.out.println("Decrypted URL: " + decryptedUrl);
        System.out.println("Decrypted User: " + decryptedUser);
        System.out.println("Decrypted Password: " + decryptedPassword);
    }
}
