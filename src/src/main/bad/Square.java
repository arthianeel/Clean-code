package src.main.bad;

public class Square extends Rectangle,DIP{
    public void setEdge(int h) {
        this.height = h;
        this.width= h;
    }
    public void setDiagnol()               //violates liskov substitution principle
    {
        diagnol=height*1.414;
    }
    DIP obj=new DIP();           //violates DIP since any change in dip will have to be changed in square1

}
