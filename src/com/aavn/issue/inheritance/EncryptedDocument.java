package com.aavn.issue.inheritance;

public class EncryptedDocument extends Document  {

    @Override
    public byte[] content() {
        //Loads the document, decrypts it on the fly, and returns the decrypted content.
        return new byte[200];
    }
}
