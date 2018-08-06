public class Metody {

    public static double sum(Product[] pro) {
        double sum = 0;
        for (int i = 0; i < pro.length; i++) {
            sum = sum + pro[i].getPrice();
        }
        return sum;
    }

    public static double mostExpensive(Product[] pro) {
        
        double result = pro[0].getPrice();
        for (int i = 0; i < pro.length; i++) {
            if (result < pro[i].getPrice())
                result = pro[i].getPrice();

        } return result;

    }

}
