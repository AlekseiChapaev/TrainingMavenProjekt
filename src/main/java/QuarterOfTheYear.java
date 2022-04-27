public class QuarterOfTheYear {

    public static String quarterOf(int month) {
        if(month > 0 && month < 4){
            return "first quarter";
        } else if(month > 3 && month < 7){
            return "second quarter";
        } else if(month > 6 && month < 10) {
            return "third quarter";
        } else if(month > 8 && month < 13) {
            return "four quarter";
        } else {
            return "Incorrect input data";
        }
    }
}
