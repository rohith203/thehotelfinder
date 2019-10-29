import java.io.*;
import java.util.*;
class String_demo{
    public static void main(String args[]){
        String s1="he";
        String s2="HE";
        char c[]=new char[3];
        c[0]='h';
        c[1]='e';
        c[2]='\n';
        String s4=new String("he");
        String s3=new String(c);
        if(s1==s3){
           // System.out.print("hello");
        }
        else if(s1.equalsIgnoreCase(s2)){
            //System.out.print("hello 2\n\n");
        }
        //System.out.print((int)s3.charAt(2));
        //System.out.print(c);
        //System.out.print((int)s3.charAt(2));
        StringBuffer sb=new StringBuffer("he;lloghfjh");
        sb.ensureCapacity(3);
        ///System.out.print("\n"+sb.length()+" "+sb.capacity());
       
    File f1=new File("C:\\Users\\divakar\\Desktop\\File_Handling");
        //File f1=new File("C:\\Users\\divakar\\Desktop\\File_Handling","\\1.txt");
       //File f1=new File("");
        if(f1.exists()){
            System.out.println("hello twar");
        }
        System.out.println(f1.getName());
        System.out.println(f1.getPath());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getParent());
        System.out.println(new Date(f1.lastModified()));
        System.out.println(f1.length()/8);
       // System.out.println(f1.available());
       System.out.println(f1.isFile());
       System.out.println(f1.isDirectory());
       System.out.println(f1.canWrite());
       System.out.println(f1.canRead());
       //System.out.println(f1.renameTo(f2));
       System.out.println(f1.getName());
       String s[]=f1.list();
       int i=0;
       for(i=0;i<s.length;i++){
           File f2=new File("C:\\Users\\divakar\\Desktop\\File_Handling"+"\\s[i]");
           if(f2.isDirectory()) System.out.println(s[i]+ "is directory");
           else {
            System.out.println(s[i]+ "is file");
           }
       }
       String str;
       BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));//any reader object has to  be passsed
      // BufferedWriter buf2=new BufferedWriter(new OutputStreamWriter(System.out));
      try{while(!(str=buf.readLine()).equals("stop")){
        //try{while((str=buf.readLine())!=null){
            System.out.println(str);
           // buf2.write(str);
       }}
       catch(Exception e){

       }

    //char str;
    //while((str=(char)buf.read())!='h'){
      //          System.out.println(str);
    //}
    //       catch(Exception e){
    
      //     }
      try(DataOutputStream dout=new DataOutputStream(new FileOutputStream("1.txt",true))){
          dout.writeInt(2);
          dout.writeDouble(3.0);
          dout.skip((long)12);
      }
      catch(Exception e){

      }
      try(DataInputStream din=new DataInputStream(new FileInputStream("1.txt"))){
          int a=din.readInt();
          double d=din.readDouble();
          System.out.println(a+" "+d);
      }
      catch(Exception e){

      }
    
    }
}