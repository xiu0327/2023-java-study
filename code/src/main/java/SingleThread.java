public class SingleThread {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for(int i=0; i<500; i++) System.out.println(Integer.toString(i+1) + "번째 Thread running ... :");

        System.out.println("첫번째 소요시간 : " + (System.currentTimeMillis() - start));

        for(int i=0; i<500; i++) System.out.println(Integer.toString(i+1) + "번째 Thread running ... :");

        System.out.println("두번째 소요시간 : " + (System.currentTimeMillis() - start));
    }
}
