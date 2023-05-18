
package Principal;

public class Square extends Shape{
    
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Dentro do quadrado:: Draw() method.");
    }
    
}
