import com.sun.jna.Native;


public class ScanTest {
    public static void main(String[] args) {

        Scan lib = Native.load("Ctest", Scan.class);
        lib.nl_GetDevice(DevInfo.devInfos,10);
    }
}
