import java.util.HashMap;

/**
 * @author tomsyoung
 * @date 2019-06-23 11:03
 */
public class debugTest {

    public static void main(String[] args) {
        HashMap<String,String> map= new HashMap<String,String>();
        map.put("name","tom");
        map.put("age","12");
        map.put("school","Tsinghua");
        map.put("major","computer");
        String age=map.get("age");


        System.out.println(age);


    }


}
