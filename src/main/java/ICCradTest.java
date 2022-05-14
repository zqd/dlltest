import com.sun.jna.Native;
import com.sun.jna.ptr.IntByReference;

public class ICCradTest {

    public static void main(String[] args) {
        IDCard card = Native.load("sdtapi", IDCard.class);
        //com口是0001-0016，usb是1001-1016。1001就是usb1
        int iPort = 1001;
        card.SDT_OpenPort(iPort);

        //是否需要手动开启/管理串口。0手动。1自动
        int iIfOpen = 0;

        //接收"证/卡芯片管理号"的数组，根据文档长度4位。PS:不知道这个数据干啥用的。
        byte[] pucManaInfo = new byte[4];
        Integer findRs = card.SDT_StartFindIDCard(iPort,pucManaInfo,iIfOpen);
        System.out.println(Integer.toHexString(findRs));

        //接收"证/卡芯片序列号"用的数组，根据文档长度4位。PS:不知道这个数据干啥用的。
        byte[] pucManaMsg = new byte[8];
        Integer selectRs = card.SDT_SelectIDCard(iPort,pucManaMsg,iIfOpen);
        System.out.println(Integer.toHexString(selectRs));

        //接收"文字信息"用的数组，根据文档的例子长度512位。PS:应该包含了姓名、身份证号等消息。
        //TODO 需确认。
        byte[] pucCHMsg = new byte[512];
        //接收"照片信息"用的数组，根据文档的例子长度1024位。PS:不知道是不是身份证照片？
        byte[] pucPHMsg = new byte[1024];
        //读取上述俩个信息的长度。根据提供的C#例子，这里填0。猜测填0是有多少读多少。
        IntByReference len = new IntByReference(0);
        Integer readRs = card.SDT_ReadBaseMsg(iPort,pucCHMsg,len,pucPHMsg,len,iIfOpen);
        System.out.println(Integer.toHexString(readRs));

        card.SDT_ClosePort(iPort);

    }
}
