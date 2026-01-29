package practice5;

public class CaesarCrypt {
    public static void main(String[] args) {
        //-------------------------1---------------------------------
        System.out.println("-------------------------1---------------------------------");
        String src = "ABC";
        PwdUtil.encode(src);

        String src1 = "BEAUTIFUL";
        String src2 = "WINDOW";
        String src3 = "ZUCKERBERG";

        String[] arr = {src1, src2, src3};
        for (String string : arr) {
            PwdUtil.encode(string);
        }
        //-------------------------2---------------------------------
        System.out.println("-------------------------2---------------------------------");
        String src4 = "PDALFR";
        String src5 = "DULCRQD";
        String src6 = "FLQGHUHOOD";
        String[] arr1 = {src4, src5, src6};

        for (String string : arr1) {
            PwdUtil.decode(string);
        }

        //-------------------------3---------------------------------
        System.out.println("-------------------------3---------------------------------");
        for (String string : arr) {
            PwdUtil.encode(string,1000);
        }
        String[] arr2 = {"NQMGFURGX","IUZPAI","LGOWQDNQDS"};
        for (String string : arr2) {
            PwdUtil.decode(string,1000);
        }
        //-------------------------4---------------------------------
        System.out.println("-------------------------4---------------------------------");
        //名前と誕生日の変数を生成
        String name = "WANGWENBO";//WANGWENBO
        int birth = 71;

        //名前の真ん中の文字を取り出し、整数型に変換
        int cut = name.charAt(name.length() / 2);

        //誕生日+名前の真ん中の文字の整数型=シフト量
        int shift = birth + cut;

        //元の文字列と暗号化された文字列を出力
        System.out.println(name);
        PwdUtil.encode(name, shift);

        PwdUtil.decode("YCPIYGPDQ", shift);
    }
}
