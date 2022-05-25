import com.sun.jna.Native;
import com.sun.jna.Structure;

public class ScanTest {
    public static void main(String[] args) {
        Scan lib = Native.load("Ctest", Scan.class);
    }
}
