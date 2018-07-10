import java.util.HashSet;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

      //2.1
        LinkedList<Integer> tempList = new LinkedList<Integer>();
        tempList.add(1);
        tempList.add(2);
        tempList.add(3);
        tempList.add(2);
        tempList.add(4);

        removeDuplicates(tempList);
    }

    public static void removeDuplicates(LinkedList<Integer> tempList){
        for (int bob : tempList) {
            System.out.println(bob);
        }
}
    }
