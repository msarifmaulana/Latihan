import Model.Food;

public class MyFoodMenu {
    public static void main(String[] args) {
        Food[] mymenu = new Food[5];

        mymenu[0] = new Food("001","Nasi Putih", "Makanan", 5000);
        mymenu[1] = new Food("002", "Chiken Smash", "Makanan", 12000);
        mymenu[2] = new Food("003", "Tempe underpressure", "Makanan", 4000);
        mymenu[3] = new Food("004", "Cute es teh", "Minuman",3000 );
        mymenu[4] = new Food("005", "Lalapan", "Makanan", 2000);

        for (int indexArraayMenu=0;indexArraayMenu<mymenu.length;indexArraayMenu++){
            mymenu[indexArraayMenu].PrintfoodMenu();

        }
    }
}
