package com.ocp.day19.jdbc.connection;
/*
	The code provided demonstrates a Java program that connects to a MySQL database using encrypted URL, username, and password values. 
	
	It also includes key verification to ensure the validity of the encryption key before establishing the database connection.
	  
	  
	Note: 
	
		In the code provided, the implementation of the verifyKey() method assumes the existence of a table named MasterKeyTable with a column named encryption_key, 
		which stores the valid encryption keys. 
	
		You need to modify this method to match your specific database schema and key verification logic.
*/
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class TestConnection4MySQLWithEncryption {
	// ALGORITHM: The encryption algorithm used, which is AES (Advanced Encryption Standard)
    private static final String ALGORITHM = "AES";
    // KEY: The encryption key used for encryption and decryption. It is a hexadecimal string
    private static final String KEY = "4A23027820742BC80B0A9E3B54DEC34729CE74CD76C0208F90301D2B5920EDE9";
    // url, user, password: The encrypted values of the database URL, username, and password
    private static final String url = "8azxLs5lQ0Dw+YuXNhgMfqQ2rHpe0FKiMRq+k8+owbSqadqbv1D6Mryr++/pmPPHbEYWObPA806rq7DFhcefU9JjuxL8ZBZ1LgVXpW38+l4=";
    private static final String user = "iiFeOXPG6v2GYCfRIXDy7g==";
    private static final String password = "JqJrqa8OrLr/M50rfqFwXA==";

	static Connection getDB() {
		
        // Verify the existence and validity of the key
        if (!verifyKey(KEY)) {
            System.out.println("Invalid or missing key.");
            return null;
        }
        
		// To decrypt the values
		String decryptedUrl = decrypt(url);
		String decryptedUser = decrypt(user);
		String decryptedPassword = decrypt(password);

		try (Connection connection = DriverManager.getConnection(decryptedUrl, decryptedUser, decryptedPassword)) {
			System.out.println("Connection successfully, because instantiate instance of Connection: " + connection);
		} catch (SQLException e) {
			System.out.println("No Connection");
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
    
	private static boolean verifyKey(String key) {
		// To decrypt the values
		String decryptedUrl = decrypt(url);
		String decryptedUser = decrypt(user);
		String decryptedPassword = decrypt(password);
		
		try (Connection connection = DriverManager.getConnection(decryptedUrl, decryptedUser, decryptedPassword)) {
			String query = "SELECT COUNT(*) FROM MasterKeyTable WHERE encryption_key = ?";
			try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
				preparedStatement.setString(1, key);
				try (ResultSet resultSet = preparedStatement.executeQuery()) {
					if (resultSet.next()) {
						int count = resultSet.getInt(1);
						return count > 0; // Return true if key exists in the table
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false; // Return false if any exception occurs or key does not exist in the table
	}
    
    public static void main(String[] args) {
        System.out.println("Start test");
        TestConnection4MySQLWithEncryption.getDB();
    }
}

/*
	Console:
			Start test
			Connection successfully, because instantiate instance of Connection: com.mysql.cj.jdbc.ConnectionImpl@169bb4dd

*/
