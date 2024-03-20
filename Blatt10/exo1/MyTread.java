public class MyTread extends Thread{
        String greeting;
        public MyTread(String greeting){
                this.greeting = greeting;
        }

        public void run(){
                for (int i=0 ; i<=10;i++){
                        System.out.println(greeting);
                        try {
                                Thread.sleep(1000);
                        } catch (InterruptedException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                        }
                }
        }

        public static void main(String[] args) throws InterruptedException {
                var m1 = new MyTread("hi");
                var m2 = new MyTread("Hallo");

                // m1.run();
                // m2.run();
                // System.out.println(m1.currentThread());
                // System.out.println(m2.currentThread());
                m1.start();
                m2.start();
        }
}
