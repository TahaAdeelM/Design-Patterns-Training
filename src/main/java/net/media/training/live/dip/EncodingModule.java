package net.media.training.live.dip;


import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:05:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModule {
    public static void encode(Reader reader, Writer writer) {
        String plaintext = reader.read();
        String encodedText = Base64.getEncoder().encodeToString(plaintext.getBytes());
        writer.write(encodedText);        
    }
}

