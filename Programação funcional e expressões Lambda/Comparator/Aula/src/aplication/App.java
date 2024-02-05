package aplication;

import java.util.ArrayList;
import java.util.List;

import entities.product;

public class App {
    public static void main(String[] args) throws Exception {

        List<product> list = new ArrayList<>();

        list.add(new product("TV", 900.0));
        list.add(new product("notebook", 1200.0));
        list.add(new product("Tablet", 450.00));

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (product p : list) {
            System.out.println(p);
        }

    }
}
