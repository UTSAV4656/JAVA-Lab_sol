interface Transport{
    void deliver();
}
abstract class Animal{
    abstract void disp();
}
class Tiger extends Animal{   
    void disp(){
    System.out.println("Animal --> Tiger\n");
    }
}
class Camel extends Animal implements Transport{   
    void disp(){
    System.out.println("Animal --> Camel\n");
    }  
    Camel(){   
        disp();
        deliver();
    } 
    public void deliver(){
        System.out.println("Camel is Delivered...\n");
    }
}

class Deer extends Animal{
    void disp(){
    System.out.println("Animal --> Deer\n");
    }  
}

class Donkey extends Animal implements Transport{   
    void disp(){
    System.out.println("Animal --> Donkey \n");
    }
    Donkey(){   
        disp();
        deliver();
    }
    public void deliver(){
    System.out.println("Donkey is on the way...\n");
    }
}

public class Lab7_3{
    public static void main(String [] args){   
        Tiger tig = new Tiger();
        Camel cam = new Camel();
        Deer dee = new Deer();
        Donkey don = new Donkey();
        tig.disp();
        dee.disp();
        
    }
}