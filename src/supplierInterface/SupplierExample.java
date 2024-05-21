package supplierInterface;

import java.util.List;
import java.util.stream.Stream;

public class SupplierExample {
  public static void main(String[] args) {
    List<String> saudacoesList = Stream.generate(() -> "olá, mundo")
      .limit(3)
      .toList();

    saudacoesList.forEach(System.out::println);
  }
}
