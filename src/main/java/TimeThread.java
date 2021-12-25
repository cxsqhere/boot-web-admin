import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeThread extends Thread{

    public static void main(String[] args) {
        //一进来就开始计时
        new TimeThread().start();
    }

    @Override
    public void run() {
        super.run();
        //让线程一直在跑
        while (true) {
            SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
            System.out.println("当前的时间是：" + s.format(new Date()));
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

