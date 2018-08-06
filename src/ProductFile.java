import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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

            String[] product = scan.nextLine().split(";");
            pro[0] = new Product(product[0], product[1], Double.valueOf(product[2]));

            String[] product1 = scan.nextLine().split(";");
            pro[1] = new Product(product1[0], product1[1], Double.valueOf(product1[2]));
            String[] product2 = scan.nextLine().split(";");
            pro[2] = new Product(product2[0], product2[1], Double.valueOf(product2[2]));

        }

        System.out.println(Metody.sum(pro));
        System.out.println(Metody.mostExpensive(pro));
    }

}






