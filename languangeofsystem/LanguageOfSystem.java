package languangeofsystem;

import java.util.Locale;

public class LanguageOfSystem {
    
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        System.out.println("Language of this system is: " + locale.getDisplayLanguage());
    }
}
