
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("Avioes");
		palavras.add("Airbus");
		palavras.add("Boeing");

		palavras.sort(((s1, s2) -> Integer.compare(s1.length(), s2.length())));

		System.out.println(palavras);

		// for (String p : palavras) {
		// System.out.println(p);
		// }

		//palavras.forEach(s -> System.out.println(s));
		palavras.forEach(System.out::println);
	}
}