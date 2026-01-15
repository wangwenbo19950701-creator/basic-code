package practice4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test {
    /*
     * 1. テキストファイルから文字列を読み込み、数値に変換できる文字をすべて int 型に変換する
     * 2. 3つの数値を1組として、三角形が成立するかどうかを判定する
     *    （任意の2辺の和が残りの1辺より大きい場合）
     * 3. 三角形の種類を判定する
     *    （辺を a, b, c とし、c を最長辺と仮定する。
     *     a² + b² = c² の場合は直角三角形、
     *     a² + b² < c² の場合は鈍角三角形、
     *     a² + b² > c² の場合は鋭角三角形）
     */
    static int triangleCount = 0;// 三角形の総数
    static int rightTriangle = 0;// 直角三角形の総数
    static int acuteTriangle = 0;// 鋭角三角形の総数
    static int obtuseTriangle = 0;// 鈍角三角形の総数

    public static void main(String[] args) throws Exception {

        //------------------------ファイル内のすべての数値を取得し、ArrayList に格納-------------------------
        ArrayList<Integer> arrayList = getIntegers();
        //------------------------ファイル内のすべての数値を取得し、ArrayList に格納-------------------------


        ArrayList<Integer> temp = new ArrayList<>();

        //ArrayList からデータを取り出し、3つずつ判定して三角形かどうか，また三角形の種類を判定する

        for (Integer integer : arrayList) {
            // 要素を追加し、3つに満たない場合は次のループへ
            temp.add(integer);
            // 要素が3つそろったら判定を行う
            if (temp.size() == 3) {
                CheckTriangleUtil.checkTriangle(temp);
                // 判定後、集合をクリアする
                temp.clear();
            }

        }

        // 三角形の総数および各種類の三角形の数を出力する
        System.out.println("三角形の個数 " + Test.triangleCount);
        System.out.println("直角三角形の個数 " + Test.rightTriangle);
        System.out.println("锐角三角形の個数 " + Test.acuteTriangle);
        System.out.println("钝角三角形の個数 " + Test.obtuseTriangle);
    }

    private static ArrayList<Integer> getIntegers() throws IOException {
        // 相対パス
        File file = new File("my-practices\\src\\practice4\\sample.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        int i;
        ArrayList<Integer> arrayList = new ArrayList<>();
        // テキストファイル内の各文字を取得し、数値に変換できるかどうかを判定する
        try (br) {
            while ((i = br.read()) != -1) {
                String temp = String.valueOf((char) i);
                try {
                    // 数値に変換できた場合は ArrayList に追加する
                    arrayList.add(Integer.parseInt(temp));
                } catch (NumberFormatException e) {
                    // 数値に変換できない文字は無視する
                }

            }
        }
        return arrayList;
    }
}
