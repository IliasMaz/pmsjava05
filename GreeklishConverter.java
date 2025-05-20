/*
 * Μην αλλάξετε τον κορμό της δομής (main και convertChar).
 * Συμπληρώστε το switch με τις αντιστοιχίες.
 * Εναλλακτικά, μπορείτε να χρησιμοποιήσετε if-else αντί για switch.
 */

public class GreeklishConverter {

    public static void main(String[] args) {
        // TODO: Ορίστε μια μεταβλητή τύπου String που περιέχει ελληνικό κείμενο
        String greekText = "Ο Πρωθυπουργός, ξεκινώντας την ομιλία του, τόνισε ότι οι απειλές για τη θαλάσσια ασφάλεια είναι παγκόσμιες και επηρεάζουν όλες τις χώρες ανεξαρτήτως αν έχουν ακτές ή όχι.";// π.χ. "Καλημέρα σας! Πώς είστε σήμερα;"

        // TODO: Δημιουργήστε ένα StringBuilder για τη μετατροπή σε greeklish
        StringBuilder greeklish = new StringBuilder();

        // TODO: Επαναλάβετε για κάθε χαρακτήρα του ελληνικού κειμένου
        for (int i = 0; i < greekText.length(); i++) {
            // TODO: Πάρτε τον χαρακτήρα στη θέση i
            char ch = greekText.charAt(i);

            // TODO: Καλέστε τη μέθοδο convertChar και προσθέστε το αποτέλεσμα στο greeklish
            greeklish.append(convertChar(ch));
        }

        // TODO: Εκτυπώστε το αρχικό και το μεταφρασμένο κείμενο
        System.out.println("Αρχικό: " + greekText);
        System.out.println("Greeklish: " + greeklish.toString());

        // TODO: Εκτυπώστε το μήκος του κάθε string
        System.out.println("Μήκος αρχικού: " + greekText.length());
        System.out.println("Μήκος Greeklish: " + greeklish.length());
    }

    /**
     * Η μέθοδος αυτή δέχεται έναν ελληνικό χαρακτήρα και επιστρέφει το αντίστοιχο greeklish.
     * Αν δεν είναι ελληνικός, επιστρέφεται όπως είναι.
     */
    public static String convertChar(char ch) {
        // Using a switch expression (Java 14+) for conciseness
        return switch (Character.toLowerCase(ch)) {
            // Alpha
            case 'α', 'ά' -> "a";
            // Beta
            case 'β' -> "v";
            // Gamma
            case 'γ' -> "g";
            // Delta
            case 'δ' -> "d";
            // Epsilon
            case 'ε', 'έ' -> "e";
            // Zeta
            case 'ζ' -> "z";
            // Eta
            case 'η', 'ή' -> "i";
            // Theta
            case 'θ' -> "th";
            // Iota
            case 'ι', 'ί', 'ϊ', 'ΐ' -> "i";
            // Kappa
            case 'κ' -> "k";
            // Lambda
            case 'λ' -> "l";
            // Mu
            case 'μ' -> "m";
            // Nu
            case 'ν' -> "n";
            // Xi
            case 'ξ' -> "x";
            // Omicron
            case 'ο', 'ό' -> "o";
            // Pi
            case 'π' -> "p";
            // Rho
            case 'ρ' -> "r";
            // Sigma (includes final sigma)
            case 'σ', 'ς' -> "s";
            // Tau
            case 'τ' -> "t";
            // Upsilon
            case 'υ', 'ύ', 'ϋ', 'ΰ' -> "y";
            // Phi
            case 'φ' -> "f";
            // Chi
            case 'χ' -> "ch";
            // Psi
            case 'ψ' -> "ps";
            // Omega
            case 'ω', 'ώ' -> "o";
            // Default case: if not a Greek character, return the character as a String
            default -> String.valueOf(ch);
        };
    }
}