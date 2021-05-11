
import java.util.TreeSet;

public class Program {

    public static final class House implements Comparable<House>{
        final int area;
        final int price;
        final String city;
        final boolean hasFurniture;

        public House(int area, int price, String city, boolean hasFurniture)
        {
            this.area = area;
            this.price = price;
            this.city = city;
            this.hasFurniture = hasFurniture;
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("House{");
            sb.append("area=").append(area);
            sb.append(", price=").append(price);
            sb.append(", city='").append(city).append('\'');
            sb.append(", hasFurniture=").append(hasFurniture);
            sb.append('}');
            return sb.toString();
        }

        public int compareTo(House anotherHouse)
        {
            if (this.area == anotherHouse.area) {
                return 0;
            } else if (this.area < anotherHouse.area) {
                return -1;
            } else {
                return 1;
            }
        }
    }
    public static void main(String[] args) {

        TreeSet<House> myHouseArrayList = new TreeSet<House>();

        House firstHouse = new House(100, 120000, "Tokyo", true);
        House secondHouse = new House(40, 70000, "Oxford", true);
        House thirdHouse = new House(70, 180000, "Paris", false);

        myHouseArrayList.add(firstHouse);
        myHouseArrayList.add(secondHouse);
        myHouseArrayList.add(thirdHouse);

        for (House h : myHouseArrayList) {
            System.out.println(h);
        }
        System.out.println("Hash код першого дому:"+firstHouse.hashCode());
        System.out.println("Hash код другого дому:"+firstHouse.hashCode());
        System.out.println(firstHouse.compareTo(secondHouse));
        System.out.println(firstHouse.equals(secondHouse));

    }
}