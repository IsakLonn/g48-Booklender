package se.lexicon;

public class StringHelper {

    public static boolean isNullOrEmpty(String string){
        return string == null || string.trim().isEmpty();
    }
}
