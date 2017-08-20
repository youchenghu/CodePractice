package learn.demo.mkw;

public class SynchronizedDemo {
    private boolean ready = false;
    private int result = 0;
    private int number = 1;

    public void write(){
        ready = true;
        number = 2;
    }

    public void read(){
        if(ready){
            result = number * 3;
        }
        System.out.println("result的值为：" + result);
    }

    private class ReadWriteThread extends Thread{
        private boolean flag;
        public ReadWriteThread(boolean flag){
            this.flag = flag;
        }

        @Override
        public void run(){
            if(flag)
                write();
            else
                read();
        }
    }

    public static void main(String[] args) {
        SynchronizedDemo demo = new SynchronizedDemo();
        demo.new ReadWriteThread(true).start();
        demo.new ReadWriteThread(false).start();
    }
}
