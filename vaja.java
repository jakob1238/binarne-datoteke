import java.io.*;
public class vaja{
    public static void main(String[] args) throws IOException {
        // DataOutputStream dos= new DataOutputStream((new FileOutputStream("C\\bindat\\dos.bin")));
        // for(int i=0;i<5;i++){
        //     dos.writeUTF("ime"+i);
        //     dos.writeInt((int)(Math.random()*5+20));
        //     dos.writeDouble(5+Math.random()*10);

        // }
        // dos.close();
        // System.out.println("konec");
        DataInputStream dis=new DataInputStream(new FileInputStream("C:\\bindat"));
        try {
            String ime = dis.readUTF();
            System.out.println(ime);
            int x = dis.readInt();
            System.out.println(x);
            int y =dis.readInt();
            System.out.println(y);



        } catch (Exception e) {
            // TODO: handle exception
        }
        dis.close();
        
    }
}