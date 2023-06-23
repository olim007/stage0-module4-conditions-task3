package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (!((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'))) {
            System.out.println("wrong alphabet!");
        } else if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'
                || character == 'y' || character == 'A' || character == 'E' || character == 'I' || character == 'O'
                || character == 'U' || character == 'Y') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }

    public static void main(String[] args) {
        System.out.println((int)'a');
        System.out.println((int)'A');
        System.out.println((int)'e');
        System.out.println((int)'E');
        System.out.println((int)'y');
        System.out.println((int)'Y');
        System.out.println((int)'u');
        System.out.println((int)'U');
        System.out.println((int)'i');
        System.out.println((int)'I');
        System.out.println((int)'o');
        System.out.println((int)'O');

    }
}
