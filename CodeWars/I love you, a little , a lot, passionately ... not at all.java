public class Kata{
    public static String howMuchILoveYou(int nb_petals) {
        String[] letters = {"I love you", "a little", "a lot", "passionately", "madly","not at all"};
        
        return letters[(nb_petals - 1) % letters.length];
    }
}
