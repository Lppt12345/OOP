package T14.DesignPattern.Ex1;
import java.util.ArrayList;
import java.util.List;

public class CompositePattern {
    
    public static void main(String[] args) {
        Person James = new Person("James", "05/04/1966", "Male", "Hana"); // james lay hana

        Person Ryan = new Person("Ryan", "01/01/1990", "Male", null);
        Person Kai = new Person("Kai", "02/03/1996", "Male", "Jennifer"); // Kai lay Jennifer
        // 2 nguoi con cua James
        James.addChild(Ryan);
        James.addChild(Kai);
        // 4 nguoi con cua Kai
        Person a1 = new Person("a1", "02/02/2016", "Male", "b1"); // a1 lay b1
        Person a2 = new Person("a2", "09/09/2017", "Male", null); // a2 ko lay vo
        Person a3 = new Person("a3", "09/09/2018", "Female", null);
        Person a4 = new Person("a4", "10/11/2019", "Female", null);
        Kai.addChild(a1);
        Kai.addChild(a2);
        Kai.addChild(a3);
        Kai.addChild(a4);
        // 1 nguoi con cua a1 va b1
        Person c1 = new Person("c1", "09/11/2040", "Female", null);
        a1.addChild(c1);

        List<Person> personNotMarried = new ArrayList<>();
        List<String> familyHasTwoChildren = new ArrayList<>();
        List<Person> personLastGeneration = new ArrayList<>();
        List<Person> listPerson = new ArrayList<>();

        listPerson.add(James);
        while (!listPerson.isEmpty()) {
            boolean check = true;
            for (int i = 0; i < listPerson.size(); i++){
                if (listPerson.get(i).getMarried() == null) {
                    personNotMarried.add(listPerson.get(i));
                }
                if (listPerson.get(i).getChildren().size() == 2){
                    familyHasTwoChildren.add(listPerson.get(i).getName() + " - " + listPerson.get(i).getMarried());
                }
                if (listPerson.get(i).getChildren().size() > 0){
                    check = false;
                }
            }
            if (check) {
                personLastGeneration.addAll(listPerson);
                listPerson.clear();
            } else {
                List<Person> nextList = new ArrayList<>();
                for (int i = 0; i < listPerson.size(); i++){
                    if (listPerson.get(i).getChildren().size() > 0) {
                        nextList.addAll(listPerson.get(i).getChildren());
                    }
                }
                listPerson.clear();
                listPerson.addAll(nextList);
            }
        }
        System.out.println("Các cá nhân không kết hôn trong danh sách phả hệ: ");
        for (Person person : personNotMarried) {
            System.out.println(" " + person);
        }

        System.out.println("Các cặp vợ chồng có hai con trong danh sách phả hệ:");
        for (String family : familyHasTwoChildren) {
            System.out.println(" " + family);
        }

        System.out.println("Thế hệ mới nhất trong danh sách phả hệ:");
        for (Person person : personLastGeneration) {
            System.out.println(" " + person);
        }
        // Phần này tính thêm ko có trong yêu cầu
        System.out.println("Tất cả mọi người trong 2 đời đầu của phả hệ: ");
        System.out.println("Đời 0: " + James + " - " + James.getMarried());
        for (Person person : James.getChildren()){
            System.out.println("Đời 1: " + person + " - " + person.getMarried());
            for (Person a : James.getChildren()){
                System.out.println("Đời 2: " +  a+ " - " + a.getMarried());
            }
        }
    }
}
