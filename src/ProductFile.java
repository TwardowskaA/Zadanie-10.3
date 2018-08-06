import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ProductFile {


    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("produkty.csv");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Product[] pro = new Product[3];

        try (Scanner scan = new Scanner(file)) {

            for (int i = 0; i < pro.length ; i++) {
                String[] product = scan.nextLine().split(";");
                pro[i] = new Product(product[0], product[1],Double.valueOf(product[2]));
            }

        }
        System.out.println(Arrays.toString(pro));

        System.out.println(Metody.sum(pro));
        System.out.println(Metody.mostExpensive(pro));
    }

}






