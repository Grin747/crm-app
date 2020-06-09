package add;

public class Tools {
    public static Integer parse(String s){
        int result;
        try {
            result = Integer.decode(s);
        } catch (Exception ex) {
            return null;
        }
        return result;
    }
}
