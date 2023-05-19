package com.ocp.day19.jdbc.connection;

import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class GeneratedSecretKey {

	public static void main(String[] args) throws Exception {
    	getSecureKey();
	}

	public static String getSecureKey() throws Exception {
		// Create a secure random object
		SecureRandom secureRandom = new SecureRandom();

		// Generate a 256-bit AES secret key
		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		keyGenerator.init(256, secureRandom);
		SecretKey secretKey = keyGenerator.generateKey();

		// Get the encoded form of the secret key
		byte[] encodedKey = secretKey.getEncoded();

		// Convert the encoded key to a string representation
		String key = bytesToHex(encodedKey);

		System.out.println("Generated Secret Key: " + key);

		return key;
	}

	// Helper method to convert bytes to a hexadecimal string representation
	private static String bytesToHex(byte[] bytes) {
		StringBuilder hexStringBuilder = new StringBuilder();
		for (byte b : bytes) {
			hexStringBuilder.append(String.format("%02X", b));
		}
		return hexStringBuilder.toString();
	}
}

/*
  	Console:
			Generated Secret Key: 4A23027820742BC80B0A9E3B54DEC34729CE74CD76C0208F90301D2B5920EDE9

 
*/
