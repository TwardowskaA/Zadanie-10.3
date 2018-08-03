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
                while (scan.hasNextLine()) {

                    String[] product = scan.nextLine().split(";");
                    for (int i = 0; i < product.length; i++) {
                        pro[1] = new Product(product[1]);
                    }

                }
            }
        System.out.println(Arrays.toString(pro));
        }
    }



