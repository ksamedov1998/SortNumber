public class Main {
    public static void main(String[] args) {
        int number=5172978;

        /*
        *   458978236 - > 987....2 sort
        * */
        SortAndOrganize sortAndOrganize= new SortAndOrganize(number);
        System.out.println("First number = " + number);
        System.out.println("New Number  = " + sortAndOrganize.makeNumber());
    }
}