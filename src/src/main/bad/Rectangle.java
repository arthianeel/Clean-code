package src.main.bad;

public class Rectangle {
    public int height;
    public int width;
    public double diagnol;

    public void setHeight(int h) {
        height = h;
    }
    public void setWidth(int w) {
        this.width = w;
    }
    public void setDiagnol()
    {
        diagnol=(height*height)+(width*width);
    }
    public void printFunc()              //violates single responsibility
    {
        System.out.print("height:"+height);
        System.out.println("width is :"+width);
    }
    public void printType()
    {                                             //violates open closed principle
        System.out.println("Rectangle");
    }
}
