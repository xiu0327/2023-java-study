import com.sun.org.apache.xpath.internal.operations.String;

public class MultiThread {

    static long start = 0;

    public static void main(String[] args) {
        ThreadEx5 threadEx5 = new ThreadEx5();
        threadEx5.start();

        start = System.currentTimeMillis();

        System.out.println("두번째 소요시간 : " + (System.currentTimeMillis() - MultiThread.start));
    }
}
