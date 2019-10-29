class myth implements Runnable{
    Thread t;
    String str;
    cm_class cm;
    myth(cm_class cm,String str){
        this.cm=cm;
        this.str=str;
        t= new Thread(this,str);
        t.start();
    }
   
    
    public void run(){
        //synchronized(cm){cm.call(str);}
        cm.call(str);
    }
}
class cm_class{
        void call(String str){
            for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                //TODO: handle exception
            }
            }
        System.out.println("child exited"+str);
    }
}
class thread{
    public static void main(String[] args) {
        cm_class c=new cm_class();
        myth t1=new myth(c,"one");
        myth t2=new myth(c,"two");
        // try{
        //     t1.t.join();
        //     t2.t.join();
        // }catch(Exception e){

        // }
        try{
            for(int i=0;i<10;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch(Exception e){

        }
    }
}