class wait_notify{
    public static void main(String[] args) {
        market m=new market();
        producer p=new producer(m,"one");
        consumer c=new consumer(m,"two");
        try {
            p.join();
            c.join();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
class consumer extends Thread{
    market m;
    String str;
    consumer(market m,String str){
        //Thread(str);
        super(str);
        this.m=m;
        this.str=str;
        start();
    }
    public void run(){
        m.consume();
    }
}
class producer extends Thread{
    market m;
    String str;
    producer(market m,String str){
       // Thread(str);
       super(str);
        this.m=m;
        this.str=str;
        start();
    }
    public void run(){
        m.produce();
    }
}
class market{
    synchronized void produce(){
        int i=0;
        while(i!=5){
        System.out.println("produced good");
        notify();
        try{
            wait();
            i++;
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        
        }
    }
    synchronized void consume(){
        int i=0;
        while(i!=5){
        System.out.println("consumed good");
        notify();
        try{
            wait();i++;
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        }
    }
}
class dbm_c{
    private static dbm_c dbm;
    dbm_c static acc(){
        if(dbm_c==null){
            dbm=new dbm_c();

        }
        else return dbm;
    }
    private dbm_c(){

    }
}