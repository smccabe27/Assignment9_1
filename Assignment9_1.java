class Rectangle {

    double width;
    double height;
    
    public Rectangle() {
            width = 1;
            height = 1;
    }
    public Rectangle(double w, double h) {
            width = w;
            height = h;
    }
    
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return (2*width) + (2*height);
    }
}

public class Assignment9_1{
    public static void main(String[]args){
        Rectangle rect1 = new Rectangle(4,40);
        Rectangle rect2 = new Rectangle(3.5,35.9);
        
        Rectangle[] rectangles = {rect1,rect2};
        
        for(int i = 0;i<2;i++){
            System.out.println("Rectangle " + (i+1) 
                               + "\nWidth: " + rectangles[i].width
                               + "\nHeight: " + rectangles[i].height 
                               + "\nArea: " + rectangles[i].getArea() 
                               + "\nPerimeter: " + rectangles[i].getPerimeter()
                               + "\n"); 
        }
    }
}