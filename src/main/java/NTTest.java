
import com.sun.jna.Native;
import com.sun.jna.ptr.IntByReference;

import java.io.UnsupportedEncodingException;
import java.nio.CharBuffer;

public class NTTest {

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("Program starting... Library loading... ");
        NT_IDCard lib = Native.load("NT_IDCard", NT_IDCard.class);
        System.out.println("Presenting Message Box ...");
        byte[] idcad =   new byte[512];
        byte[] filePat = new byte[1024];
        IntByReference len = new IntByReference(0);

        Integer i = lib.IDInfoChar( idcad, len,null);
        System.out.println(new String(idcad,"gbk"));
//        BP8903M bp8903M=new BP8903M();
//        int i = bp8903M.IDInfoChar(idcad, len, CharBuffer.wrap("D:\\test.bmp".toCharArray()));
//        System.out.println(idcad);
    }
}
