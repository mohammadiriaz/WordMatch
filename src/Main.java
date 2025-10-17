
public class Main {
    public static void main(String[] args) {

        WordMatch w = new WordMatch("mississippi");
        System.out.println(w.scoreGuess("i"));
        System.out.println(w.scoreGuess("iss"));
        System.out.println(w.scoreGuess("issipp"));
        System.out.println(w.scoreGuess("mississippi"));

        WordMatch Test1 = new WordMatch("aaaabb");
        System.out.println(Test1.scoreGuess("a"));
        System.out.println(Test1.scoreGuess("aa"));
        System.out.println(Test1.scoreGuess("aaa"));
        System.out.println(Test1.scoreGuess("aabb"));
        System.out.println(Test1.scoreGuess("c"));

        WordMatch Test2 = new WordMatch("concatenation");
        System.out.println(Test2.scoreGuess("ten"));
        System.out.println(Test2.scoreGuess("nation"));
        System.out.println(Test2.findBetterGuess("ten", "nation"));
        System.out.println(Test2.scoreGuess("con"));
        System.out.println(Test2.scoreGuess("cat"));
        System.out.println(Test2.findBetterGuess("con", "cat"));
    }
}
