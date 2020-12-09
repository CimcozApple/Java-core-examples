package tests.Lessons.lesson15_stream_lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streams {

    public static void main(String[] args) {
        List<tests.Lessons.lesson15_stream_lamda.Product> productsList = new ArrayList<tests.Lessons.lesson15_stream_lamda.Product>();
        productsList.add(new tests.Lessons.lesson15_stream_lamda.Product(1,"HP Laptop",25000f));
        productsList.add(new tests.Lessons.lesson15_stream_lamda.Product(2,"Dell Laptop",30000f));
        productsList.add(new tests.Lessons.lesson15_stream_lamda.Product(3,"Lenevo Laptop",28000f));
        productsList.add(new tests.Lessons.lesson15_stream_lamda.Product(4,"Sony Laptop",28000f));
        productsList.add(new tests.Lessons.lesson15_stream_lamda.Product(5,"Apple Laptop",90000f));

        List<Float> productPriceList2 =productsList.stream()
                .filter(p -> p.price > 30000)
                .map(p->p.price)
                .collect(Collectors.toList());
        System.out.println("productPriceList2 = " + productPriceList2);

        Stream.iterate(1, element->element+1)
                .filter(element->element%5==0)
                .limit(5)
                .forEach(System.out::println);

        productsList.stream()
                .filter(product -> product.price == 30000)
                .forEach(product -> System.out.println(product.name));

        Float totalPrice = productsList.stream()
                .map(product->product.price)
                .reduce(0.0f,(sum, price)->sum+price);
        System.out.println(totalPrice);

        float totalPrice2 = productsList.stream()
                .map(product->product.price)
                .reduce(0.0f,Float::sum);
        System.out.println(totalPrice2);

        double totalPrice3 = productsList.stream()
                .collect(Collectors.summingDouble(product->product.price));
        System.out.println(totalPrice3);

        tests.Lessons.lesson15_stream_lamda.Product productA = productsList.stream()
                .max((product1, product2)->
                        product1.price > product2.price ? 1: -1).get();

        System.out.println(productA.price);
        tests.Lessons.lesson15_stream_lamda.Product productB = productsList.stream()
                .max((product1, product2)->
                        product1.price < product2.price ? 1: -1).get();
        System.out.println(productB.price);

        long count = productsList.stream()
                .filter(product->product.price<30000)
                .count();
        System.out.println(count);

        Set<Float> productPriceList =
                productsList.stream()
                        .filter(product->product.price < 30000)
                        .map(product->product.price)
                        .collect(Collectors.toSet());
        System.out.println(productPriceList);

        Map<Integer,String> productPriceMap =
                productsList.stream()
                        .collect(Collectors.toMap(p->p.id, p->p.name));
        System.out.println(productPriceMap);
    }
}