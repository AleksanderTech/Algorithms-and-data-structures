package com.alek.designpattern.decorator.javaio;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

    protected LowerCaseInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public int read() throws IOException {
        int c = in.read();
        return c == -1 ? c : Character.toLowerCase((char) c);
    }

    @Override
    public int read(byte[] bytes, int off, int len) throws IOException {

        int result = in.read(bytes, off, len);
        for (int i = off; i < len; i++) {
            bytes[i] = (byte) Character.toLowerCase(bytes[i]);

        }
        return result;
    }
}
