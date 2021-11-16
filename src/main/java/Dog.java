public class Dog extends Animal{

    public Dog(String name){
        //ссылка на род.
        super(name);
    }

    public void animalInfo(){
        System.out.println(" Собака "  + name);
    }

    @Override
    public void run(int l){
        if (l > 1000)
        {System.out.println( (name) + " больше 1000 метров, не может бежать");}
        else
        {System.out.println((name) +  " может бежать " + l +" метров"); }}


    @Override
    public void sail(int l) {if (l > 100)
    {System.out.printf((name) + "  больше " + l + " метров не может плыть");}
    else
    {System.out.printf((name) + "  может плыть " + l + "  метров"); }
    } {
        System.out.println("  ");
    }

}
