package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        if (symbol < 0x0020 || (symbol >= 0x007f && symbol != '§')) System.out.println("Non English");
        else System.out.println("English");
    }
}
