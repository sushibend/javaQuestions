public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Worldddd!");

    }

    public static boolean oneAway(String one, String two) {
        if (one.length() == two.length()) {
            // check for one different letter
            return replace(one ,two);
        } else if (Math.abs(one.length() - two.length()))
        return  false;
    }

    public static boolean replace(String one, String two) {
        for (int i = 0; i < one.length(); i++) {
            boolean stop = false;
            if (one.charAt(i) != two.charAt(i)) {
                if (stop) {
                    return false;
                }
                stop = true;
            }
        }
        return  true;
    }

    public static boolean insertOne(){

    }

}
