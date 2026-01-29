package practice5;


import java.util.ArrayList;


//カスタム暗号化ツールクラス
public class PwdUtil {
    //暗号化用リスト
    static ArrayList<Integer> arrayListEncode = new ArrayList<>();
    //復号化用リスト
    static ArrayList<Integer> arrayListDecode = new ArrayList<>();


    private PwdUtil() {
    }

    //A == 65  Z == 90
    //----------------------暗号化-------------------------------
    //デフォルトで3文字後ろにシフトして暗号化
    public static void encode(String encodeStr) {
        encode(encodeStr, 3);
    }

    //指定した桁数だけ後ろにシフトして暗号化
    public static void encode(String encodeStr, int shift) {
        for (int i = 0; i < encodeStr.length(); i++) {
            int temp = encodeStr.charAt(i);//文字を1つ取り出し、整数型に変換
            shift = shift % 26;//シフト量を計算

            if (shift <= 0) {
                //シフト量が0の場合
                System.out.println("シフト量が0のため、暗号化できません");
                return;
            }

            if (temp + shift > 90) {
                arrayListEncode.add(64 + (temp + shift) - 90);//
            } else {
                arrayListEncode.add(temp + shift);
            }
        }

        for (Integer integer : arrayListEncode) {
            System.out.print(Character.toChars(integer));
        }

        arrayListEncode.clear();//リストをクリア
        System.out.println();//改行
    }
    //----------------------暗号化--------------------------------

    //----------------------復号化--------------------------------
    public static void decode(String decodeStr) {
        decode(decodeStr, 3);
    }


    public static void decode(String decodeStr, int shift) {
        for (int i = 0; i < decodeStr.length(); i++) {
            int temp = decodeStr.charAt(i);//文字を1つ取り出し、整数型に変換
            shift = shift % 26;//シフト量を計算

            if (shift <= 0) {
                //シフト量が0の場合、引数の文字列をそのまま出力
                System.out.println(decodeStr);
                return;
            }

            if (temp - shift < 65) {
                arrayListDecode.add(90 - (64 - (temp - shift)));//
            } else {
                arrayListDecode.add(temp - shift);
            }
        }

        for (Integer integer : arrayListDecode) {
            System.out.print(Character.toChars(integer));
        }

        arrayListDecode.clear();//リストをクリア
        System.out.println();//改行
    }

    //----------------------復号化-------------------------------
}
