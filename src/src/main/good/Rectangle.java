package src.main.good;

public class Rectangle extends Shape implements Area,Perimeter{   //follows single responsibility principle
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
    public void setType(String s)                          //open closed principle where rectangle and square extend shape class instead of modifying existing class
    {
        this.type=s;
    }
    public void printarea(){
        System.out.println(height*width);
    }

    public void printperimeter() {
        System.out.println(2*(height+width));
    }
}
