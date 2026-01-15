package practice4;

import java.util.Collections;
import java.util.List;

public class CheckTriangleUtil {
    private CheckTriangleUtil() {
    }

    public static void checkTriangle(List<Integer> list) {
        int a = list.get(0);
        int b = list.get(1);
        int c = list.get(2);
        // 三角形が成立するかどうかを判定する
        //（任意の2辺の和が残りの1辺より大きい場合）
        if (a + b > c
                && a + c > b
                && b + c > a) {
            // 三角形の場合、総数を加算し、種類の判定を行う
            Test.triangleCount++;
            checkTriangleType(list);
        }
    }


    // 三角形の種類を判定する
    public static void checkTriangleType(List<Integer> list) {
        Collections.sort(list);// 昇順にソートする
        int a = list.get(0);
        int b = list.get(1);
        int c = list.get(2);// 最長辺
        Triangle triangle;

        // ピタゴラスの定理を用いて三角形の種類を判定する
        if (a * a + b * b == c * c) {
            triangle = Triangle.rightTriangle;
        } else if (a * a + b * b > c * c) {
            triangle = Triangle.acuteTriangle;
        } else {
            triangle = Triangle.obtuseTriangle;
        }

        // 判定結果に応じて、それぞれの三角形の数を加算する
        switch (triangle) {
            case rightTriangle -> Test.rightTriangle++;
            case acuteTriangle -> Test.acuteTriangle++;
            case obtuseTriangle -> Test.obtuseTriangle++;
        }
    }
}
