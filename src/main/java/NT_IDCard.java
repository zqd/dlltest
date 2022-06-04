import com.sun.jna.ptr.IntByReference;
import com.sun.jna.win32.StdCallLibrary;

import java.nio.CharBuffer;

public interface NT_IDCard extends StdCallLibrary {
    int  IDInfoChar(byte[] IDInfoChar, IntByReference CharSize, CharBuffer  IDImageBMPSavePath);

    byte[] IDInfoBMP(byte[] IDImageBMPSaveDir);

    byte[]  IDInfoBMP2(byte[] IDImageBMPSaveDir, int iFlag);

    int IDInfoSAMStr(byte[] IDInfoSAMStr);

}
