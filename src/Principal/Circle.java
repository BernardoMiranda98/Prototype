
package Principal;


public class Circle extends Shape{
    
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Dentro do circulo:: Draw() method.");
    }
    
}
