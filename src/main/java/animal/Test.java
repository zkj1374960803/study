package animal;

/**
 * @author zhangkangjian
 * @date 2018-10-17 10:58:18
 */
public class Test {

    public static void main(String[] args){
        Animal animal = new Dog();
        String shoutSound = animal.getShoutSound();
        System.out.print(shoutSound);
    }

}
