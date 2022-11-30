public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog= 8;
        dog = dog+4;
        System.out.println(dog);
        var cat =3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper +4;
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        double dog= 8;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat =3.6;
        cat = cat -1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper -7639;
        System.out.println(paper);
    }
    public static void task4(){
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend= friend*2;
        System.out.println(friend);
        friend= friend/7;
        System.out.println(friend);
    }
    public static void task5(){
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog= frog*10;
        System.out.println(frog);
        frog= frog/3.5;
        System.out.println(frog);
        frog= frog+4;
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var weight = boxer1 + boxer2;
        System.out.println(weight);

        System.out.println(boxer2-boxer1);
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var weight = boxer2 - boxer1;
        System.out.println(weight);

        System.out.println(boxer2%boxer1);
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var hour=640;
        var smena=8;
        var rabotnik=hour/ smena;

        System.out.println("Всего в компании-"+ rabotnik + " человек");
        rabotnik=rabotnik+94;
        hour=hour+ 94* smena;
        System.out.println("Если в компании работает "+rabotnik+" человека,то всего "+ hour+ " часа работы может быть поделено между сотрудниками");
    }
}