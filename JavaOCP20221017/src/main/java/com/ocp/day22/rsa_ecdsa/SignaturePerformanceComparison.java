package com.ocp.day22.rsa_ecdsa;
import java.security.*;
import java.security.spec.ECGenParameterSpec;

public class SignaturePerformanceComparison {

    public static void main(String[] args) {
        try {
            String message = "This is a test message";

            // RSA Key Pair Generation and Signing
            KeyPairGenerator rsaKeyPairGen = KeyPairGenerator.getInstance("RSA");
            rsaKeyPairGen.initialize(2048);  // 2048-bit RSA key size
            long rsaKeyGenStart = System.nanoTime();
            KeyPair rsaKeyPair = rsaKeyPairGen.generateKeyPair();
            long rsaKeyGenEnd = System.nanoTime();
            System.out.println("RSA Key Generation Time: " + (rsaKeyGenEnd - rsaKeyGenStart) / 1_000_000 + " ms");

            Signature rsaSignature = Signature.getInstance("SHA256withRSA");

            long rsaSignStart = System.nanoTime();
            rsaSignature.initSign(rsaKeyPair.getPrivate());
            rsaSignature.update(message.getBytes());
            byte[] rsaDigitalSignature = rsaSignature.sign();
            long rsaSignEnd = System.nanoTime();
            System.out.println("RSA Signing Time: " + (rsaSignEnd - rsaSignStart) / 1_000_000 + " ms");

            long rsaVerifyStart = System.nanoTime();
            rsaSignature.initVerify(rsaKeyPair.getPublic());
            rsaSignature.update(message.getBytes());
            boolean rsaVerified = rsaSignature.verify(rsaDigitalSignature);
            long rsaVerifyEnd = System.nanoTime();
            System.out.println("RSA Verification Time: " + (rsaVerifyEnd - rsaVerifyStart) / 1_000_000 + " ms");
            System.out.println("RSA Signature Verified: " + rsaVerified);

            // ECDSA Key Pair Generation and Signing
            KeyPairGenerator ecdsaKeyPairGen = KeyPairGenerator.getInstance("EC");
            ECGenParameterSpec ecSpec = new ECGenParameterSpec("secp256r1");  // P-256 curve
            ecdsaKeyPairGen.initialize(ecSpec, new SecureRandom());

            long ecdsaKeyGenStart = System.nanoTime();
            KeyPair ecdsaKeyPair = ecdsaKeyPairGen.generateKeyPair();
            long ecdsaKeyGenEnd = System.nanoTime();
            System.out.println("ECDSA Key Generation Time: " + (ecdsaKeyGenEnd - ecdsaKeyGenStart) / 1_000_000 + " ms");

            Signature ecdsaSignature = Signature.getInstance("SHA256withECDSA");

            long ecdsaSignStart = System.nanoTime();
            ecdsaSignature.initSign(ecdsaKeyPair.getPrivate());
            ecdsaSignature.update(message.getBytes());
            byte[] ecdsaDigitalSignature = ecdsaSignature.sign();
            long ecdsaSignEnd = System.nanoTime();
            System.out.println("ECDSA Signing Time: " + (ecdsaSignEnd - ecdsaSignStart) / 1_000_000 + " ms");

            long ecdsaVerifyStart = System.nanoTime();
            ecdsaSignature.initVerify(ecdsaKeyPair.getPublic());
            ecdsaSignature.update(message.getBytes());
            boolean ecdsaVerified = ecdsaSignature.verify(ecdsaDigitalSignature);
            long ecdsaVerifyEnd = System.nanoTime();
            System.out.println("ECDSA Verification Time: " + (ecdsaVerifyEnd - ecdsaVerifyStart) / 1_000_000 + " ms");
            System.out.println("ECDSA Signature Verified: " + ecdsaVerified);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
