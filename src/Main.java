// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Сын Макс
        int[] max_marks = {2,4,5,4,4} ;
        School max_school = new School("СШ №2","Ломоносова 12",max_marks );
        Child max = new Child("Max", Hobby.PLAY_FOOTBALL, 15, max_school,"Male" );

        //Перегрузка методов
        max.aboutMe();
        max.aboutMe(max.getName());

        //Информация о члене семьи
        System.out.println(max.selfInfo());

        //Дочь София
        int[] sofia_marks = {5,5,4,5,5};
        School sofia_school = new School("СШ №2","Ломоносова 12",sofia_marks );
        Child sofia = new Child("Sofia", Hobby.PLAY_FOOTBALL, 12, max_school,"Female" );
        System.out.println("========================================");
        sofia.aboutMe();
        sofia.aboutMe(sofia.getAge());
        System.out.println(sofia.selfInfo());

        //Отец Алег
        Job job = new Job("Programmer", "Geeks", "Shopokova 101/1", 250000);
        Father father = new Father("Алег", Hobby.PHOTOGRAPH,34, job);
        System.out.println("========================================");
        father.aboutMe();
        father.aboutMe(father.getName());
        System.out.println(father.selfInfo());

        //Дед Инакендий
        Grandpa grandpa = new Grandpa("Инакендий", Hobby.READING_BOOKS, 60, 18000);
        System.out.println("========================================");
        grandpa.aboutMe();
        grandpa.aboutMe(max.getName());
        System.out.println(grandpa.selfInfo());
    }
}