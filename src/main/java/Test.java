
import com.sun.jna.Native;

public class Test {

    public static void main(String[] args) {
        System.out.println("Program starting... Library loading... ");
        ICTest lib = Native.load("Ctest", ICTest.class);
        System.out.println("Presenting Message Box ...");
        System.out.println(lib.sum(1, 2));

    }
}
