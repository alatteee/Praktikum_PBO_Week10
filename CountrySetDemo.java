import java.util.HashSet;

public class CountrySetDemo {
    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<>();

        countries.add("Indonesia");
        countries.add("Japan");
        countries.add("Canada");
        countries.add("Brazil");
        countries.add("Indonesia"); // duplikat
        countries.add("Germany");

        System.out.println("Daftar negara dalam HashSet:");
        for (String c : countries) {
            System.out.println(c);
        }
    }
}
