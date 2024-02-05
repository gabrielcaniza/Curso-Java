package aplication;

import java.util.Comparator;
import entities.product;

public class Mycomparator implements Comparator<product> {

    @Override
    public int compare(product p1, product p2) {
      return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }

}
