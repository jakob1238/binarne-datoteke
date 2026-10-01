import java.io.*;

public class Dijak {
    String ime;
    int starost;
    double povprecje;
    public Dijak(){

    }
    public Dijak(String i, int s, double p){
        ime=i;
        starost=s;
        povprecje=p;
    }
    public void piseNaDat(FileOutputStream fos) throws IOException{
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this);
        oos.flush();

    }
    public void bereIzDat(FileInputStream fis) throws IOException, ClassNotFoundException
    {
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dijak d =(Dijak)ois.readObject();
        this.ime=d.ime;
        this.starost=d.starost;
        this.povprecje=d.povprecje;
    }
}