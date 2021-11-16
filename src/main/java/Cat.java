public class  Cat extends Animal {

    public Cat(String name){
        //ссылка на род.
        super(name);
    }

    public void animalInfo(){
        System.out.println(" Кошка "  + name);
    }

    @Override
    public void run(int l){
        if (l > 200)
        {System.out.println((name )+ " больше 200 метров не может бежать");}
        else
        {System.out.printf((name ) + "  может бежать " + l + "   метров"); }

    }

    @Override
    public void sail(int l) {

        if (l > 100)
        {System.out.printf(name + "   не может проплыть " + l + "   метров");}
        else
        {System.out.printf(name + "  может проплыть " + l + "   метров"); }
        {
            System.out.println("  ");
        }
    }


}