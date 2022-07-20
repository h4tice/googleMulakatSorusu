import java.util.HashMap;

public class Main {

    public static String tekrarEdenDeger(String a){

        HashMap<String,Integer> hashMap=new HashMap<>();

        for(int i=0;i<a.length();i++){
            String karakter=a.substring(i,i+1);
            if (!hashMap.containsKey(karakter)){
                hashMap.put(karakter,1);
            }
            else {
                return karakter;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        String s="ABCCADE";
        System.out.println(tekrarEdenDeger(s));
    }
}