
public class Main {
    public static void main(String[] args) {
        WordMatch w = new WordMatch("mississippi");
        System.out.println(w.scoreGuess("i"));
        System.out.println(w.scoreGuess("iss"));
        System.out.println(w.scoreGuess("issipp"));
        System.out.println(w.scoreGuess("mississippi"));

        WordMatch w = new WordMatch("aaaabb");
        System.out.println(w.scoreGuess("a"));
        System.out.println(w.scoreGuess("aa"));
        System.out.println(w.scoreGuess("aaa"));
        System.out.println(w.scoreGuess("aabb"));
        System.out.println(w.scoreGuess("c"));;
        }
    }
