public class HomeWorkLesson6 {

    public static void main(String[] args) {


        //использование всех живонтных в одном массиве
        Animal[] animals = {
                new Cat("Barsik"),
                new Cat("Masha"),
                new Dog("Bim")};
        for (int i = 0; i < animals.length; i++) {

            animals[i].animalInfo();
            animals[i].run(500);
            animals[i].sail(500);
        }

        {System.out.println("\nВсего в массиве животных : " + animals.length );} }
    }

