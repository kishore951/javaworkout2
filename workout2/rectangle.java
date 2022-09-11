 class Rectangle {
    double length,breadth;
    Rectangle(double x)
    {
        length=x;
        breadth=x;
    }
    void getArea()
    {
        double area =length*breadth;
        System.out.println("Area of rectangle="+area);
    }
    void getParameter()
    {
        double perimeter =2*(length+breadth);
        System.out.println("perimeter of Rectangle="+perimeter);
    }
    public static void main(String[] args)
     {
         Rectangle r1=new Rectangle(10);
         Rectangle r2=new Rectangle(12.0);
         r1.getArea();
         r1.getParameter();
         r2.getArea();
         r2.getParameter();
     }

}
