/*
 * HYALO MARVIN RICHARD     2022/DCS/DAY/0933
 */

// Suppose we house a parent class family 
/*
 * and we want to create child classes "father"
 * and 'son' will inherit properties and methods from the parent class
 */

//  Parent class (base class)
class family {
    String tall;
    int children;
    String fat;

    public family(String tall, int children, String fat) {
        this.tall = tall;
        this.children = children;
        this.fat = fat;
    }

    public void displayInfor() {
        System.out.println("Tall: " + tall);
        System.out.println("Children: " + children);
        System.out.println("Fat: " + fat);
    }
}

// child class 1
class Father extends family {
    String handsome;

    public Father(String tall, int children, String fat, String handsome) {
        super(tall, children, fat); // call the constructor of the parent
        this.handsome = handsome;
    }

    public void looks() {
        System.out.println("Like father like son.");
    }
}

public class Exfamily {
    public static void main(String[] args) {
        Father son = new Father("Extra tall", 2, "medium size", "dark brown");
        son.displayInfor();
        son.looks();
    }
}
