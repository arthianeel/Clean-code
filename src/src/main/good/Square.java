package src.main.good;

public class Square extends Shape implements Printype{
    public void setEdge(int h) {
        this.height = h;
        this.width= h;
    }
       public void setDiagnol()
       {
        diagnol=height*1.414;
       }
    public void setType(String s)
    {
        this.type=s;
    }

    public void printtype() {
        System.out.println("this is square");
    }

}
