public class Metody {

    public static double sum(Product[] pro) {
        double sum = 0;
        for (int i = 0; i < pro.length; i++) {
            sum = sum + pro[i].getPrice();
        }
        return sum;
    }

    public static Product mostExpensive(Product[] pro) {
        Product product = pro[0];
        double result = pro[0].getPrice();
        for (int i = 0; i < pro.length; i++) {
            if (result < pro[i].getPrice()) {
                product = pro[i];
                result = pro[i].getPrice();
            }

        } return product;

    }

}
