import com.sun.org.apache.xpath.internal.operations.String;

class ThreadEx5 extends Thread{
    @Override
    public void run() {
        for(int i=0; i<500; i++) {
            String tmp = new String();
        }

        System.out.println("두번째 소요시간 : " + (System.currentTimeMillis() - MultiThread.start));
    }
}