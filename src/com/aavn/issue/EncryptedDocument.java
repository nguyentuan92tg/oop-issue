package com.aavn.issue;

public class EncryptedDocument extends Document  {

    @Override
    public byte[] content() {
        //Loads the document, decrypts it on the fly, and returns the decrypted content.
        return new byte[200];
    }
}
