package practice2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class RedPack implements Runnable {
    //红包里一共有多少钱
    double money;
    static int count;

    RedPack(double money) {
        this.money = money;
    }

    @Override
    public void run() {
        method();
    }

    private synchronized void method() {
            if (this.money <= 0) {
                return;
            }
            if (count<=1) {
                System.out.println(Thread.currentThread().getName() +
                        "抢到了" +
                        BigDecimal.valueOf(this.money).setScale(2,RoundingMode.HALF_UP).doubleValue());
                return;
            }
            double v = BigDecimal.valueOf(new Random().nextDouble(this.money)).setScale(2, RoundingMode.HALF_UP).doubleValue();
            this.money = this.money - v;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() +
                    "抢到了" +
                    v);
            count--;
    }
}
