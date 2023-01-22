public class ThreadEx {
    public static void main(String[] args) {
        ThreadEx2 thread = new ThreadEx2();
        thread.run();
    }
}

class ThreadEx2 extends Thread{
    @Override
    public void run() {
        throwException();
    }

    private void throwException() {
        try{
            throw new Exception();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
