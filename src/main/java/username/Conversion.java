package username;

/**
 * @author zhangkangjian
 * @date 2018-10-19 18:22:12
 */
public class Conversion {

    public static void main(String[] args) {
        String str = "user_name_abc";
        String str1 = "";
        String[] split = str.split("_");
        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            String str2 = s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase());
            str1 = str1 + str2;
        }
        System.out.println(str1);

        char[] chars = str.toCharArray();
        int i = (int) chars[0] - 32;
        byte[] bytes = str.getBytes();
        bytes[0] = (byte)i;

        System.out.println((char)bytes[0]);

    }
    public void convers(String temp){
        String str = "user_name_abc";
        byte[] bytes = str.getBytes();
        System.out.println(bytes[0]);
    }
}
