package com.securenotes.notes.services;

import com.warrenstrange.googleauth.GoogleAuthenticatorKey;

public interface TotpService {

    GoogleAuthenticatorKey generateSecret();

    String getQrCode(GoogleAuthenticatorKey secret, String username);

    boolean verifyCode(String secret, int code);
}
