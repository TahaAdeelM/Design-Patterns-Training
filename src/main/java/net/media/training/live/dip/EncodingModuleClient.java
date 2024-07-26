package net.media.training.live.dip;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:20:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        // encodingModule.encodeWithFiles();
        MyFile myFileInput = new MyFile();
        MyFile myFileOutput = new MyFile();
        EncodingModule.encode(myFileInput, myFileOutput);

        // encodingModule.encodeBasedOnNetworkAndDatabase();
        MyDatabase myDatabase = new MyDatabase();
        // MyNetwork myNetwork = new MyNetwork(); // Can be implemented to implement the read and write interfaces
        // EncodingModule.encode(myDatabase, myNetwork);
    }
}
