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
        if (a + b > c
                && a + c > b
                && b + c > a) {
            //是三角形，接着判断是什么三角形
            Test.triangleCount++;
            checkTriangleType(list);
        }
    }


    //判断是什么三角形
    public static void checkTriangleType(List<Integer> list) {
        Collections.sort(list);//升序排序
        int a = list.get(0);
        int b = list.get(1);
        int c = list.get(2);//最长的边
        Triangle triangle;
        if (a * a + b * b == c * c) {
            triangle = Triangle.rightTriangle;
        } else if (a * a + b * b > c * c) {
            triangle = Triangle.acuteTriangle;
        } else {
            triangle = Triangle.obtuseTriangle;
        }

        switch (triangle) {
            case rightTriangle -> Test.rightTriangle++;
            case acuteTriangle -> Test.acuteTriangle++;
            case obtuseTriangle -> Test.obtuseTriangle++;
        }
    }
}
