package src.main.good;

public class Square extends Shape implements Printype,DI{
    public void setHeight(int h) {
        this.height = h;
        this.width= h;
    }

    public void setWidth(int w ){
        this.width = w;
        this.height = w;
    }
    public void setType(String s)
    {
        this.type=s;
    }

    public void printtype() {
        System.out.println("this is square");
    }

    public void dip() {
        System.out.println("Dependency inversion");
    }
}
