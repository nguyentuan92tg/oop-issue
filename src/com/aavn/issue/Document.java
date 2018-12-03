package com.aavn.issue;

public class Document {

    public int length(){
        return this.content().length;
    }

    public byte[] content() {
        // Loads the raw content of the document as an array of bytes
        return new byte[100];
    }
}
