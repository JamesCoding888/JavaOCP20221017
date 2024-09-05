package com.ocp.day22.rsa_ecdsa;
import java.security.*;
import java.security.spec.ECGenParameterSpec;

public class SecurityLevelSimulation {

    public static void main(String[] args) {
        try {
            String message = "This is a test message for security verification.";

            // Test RSA Security Level
            System.out.println("Testing RSA security level...");

            for (int keySize : new int[]{2048, 3072, 4096}) {
                System.out.println("\nKey size: " + keySize + " bits");

                KeyPairGenerator rsaKeyPairGen = KeyPairGenerator.getInstance("RSA");
                rsaKeyPairGen.initialize(keySize);
                KeyPair rsaKeyPair = rsaKeyPairGen.generateKeyPair();

                Signature rsaSignature = Signature.getInstance("SHA256withRSA");

                // Timing RSA signing and verification
                simulateSignAndVerify(rsaSignature, rsaKeyPair, message);
            }

            // Test ECDSA Security Level
            System.out.println("\nTesting ECDSA security level...");

            for (String curve : new String[]{"secp256r1", "secp384r1", "secp521r1"}) {
                System.out.println("\nCurve: " + curve);

                KeyPairGenerator ecdsaKeyPairGen = KeyPairGenerator.getInstance("EC");
                ECGenParameterSpec ecSpec = new ECGenParameterSpec(curve);
                ecdsaKeyPairGen.initialize(ecSpec, new SecureRandom());
                KeyPair ecdsaKeyPair = ecdsaKeyPairGen.generateKeyPair();

                Signature ecdsaSignature = Signature.getInstance("SHA256withECDSA");

                // Timing ECDSA signing and verification
                simulateSignAndVerify(ecdsaSignature, ecdsaKeyPair, message);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void simulateSignAndVerify(Signature signature, KeyPair keyPair, String message) {
        try {
            // Signing
            long signStart = System.nanoTime();
            signature.initSign(keyPair.getPrivate());
            signature.update(message.getBytes());
            byte[] digitalSignature = signature.sign();
            long signEnd = System.nanoTime();

            System.out.println("Signing Time: " + (signEnd - signStart) / 1_000_000 + " ms");

            // Verification
            long verifyStart = System.nanoTime();
            signature.initVerify(keyPair.getPublic());
            signature.update(message.getBytes());
            boolean isVerified = signature.verify(digitalSignature);
            long verifyEnd = System.nanoTime();

            System.out.println("Verification Time: " + (verifyEnd - verifyStart) / 1_000_000 + " ms");
            System.out.println("Signature Verified: " + isVerified);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}