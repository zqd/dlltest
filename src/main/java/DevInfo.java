import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class DevInfo extends Structure {
    public byte[] name = new byte[32];
    public byte[] sn = new byte[32];
    public byte[] ver = new byte[32];
    public byte[] cpuID = new byte[256];
    public byte[] info = new byte[560];
    public int reserved;

    public static class ByReference extends DevInfo implements Structure.ByReference {}
    public static class ByValue extends DevInfo implements Structure. ByValue {}
    public static DevInfo.ByValue[] devInfos = new DevInfo.ByValue[10];

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("name","sn","ver","cpuID","info","reserved");
    }
}
