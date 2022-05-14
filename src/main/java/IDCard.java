import com.sun.jna.Library;
import com.sun.jna.ptr.IntByReference;

public interface IDCard extends Library {
    int SDT_OpenPort(int iPort);

    int SDT_ClosePort(int iPort);

    int SDT_StartFindIDCard(int iPort, byte[] pucManaInfo, int iIfOpen);

    int SDT_SelectIDCard(int iPort, byte[] pucManaMsg, int iIfOpen);

    int SDT_ReadBaseMsg(int iPort, byte[] pucCHMsg, IntByReference puiCHMsgLen, byte[] pucPHMsg, IntByReference puiPHMsgLen, int iIfOpen);

}
