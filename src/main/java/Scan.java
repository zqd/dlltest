import com.sun.jna.Library;
import com.sun.jna.Structure;

public interface Scan  extends Library {
    int nl_GetDevice(DevInfo.ByValue[] devInfo,int count);
}
