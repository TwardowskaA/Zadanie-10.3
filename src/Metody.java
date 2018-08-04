public class Metody {

    public static double sum(Product[] pro) {
        return pro[0].getPrice() + pro[1].getPrice() + pro[2].getPrice();

    }

    public static Product mostExpensive(Product[] pro) {
        if (pro[0].getPrice() > pro[1].getPrice() && pro[0].getPrice() > pro[2].getPrice())
            return pro[0];
        else if (pro[1].getPrice() > pro[0].getPrice() && pro[1].getPrice() > pro[2].getPrice())
            return pro[1];
        else if (pro[2].getPrice() > pro[1].getPrice() && pro[2].getPrice() > pro[0].getPrice())
            return pro[2];

        return null;
    }
}
