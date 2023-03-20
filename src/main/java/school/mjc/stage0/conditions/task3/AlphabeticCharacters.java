package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character < 0x0020 || (character >= 0x007f && character != '§'))
            System.out.println("wrong alphabet!");
        else {
            String VOWELS = "aeiouAEIOU";
            if (VOWELS.indexOf(character) == -1) System.out.println("Consonant");
            else System.out.println("Vowel");
        }

    }
}
