package builder;

public class Test {
    public static void main(String[] args) {

        //套餐A
        A a = new A();
        //准备套餐A的服务员
        KFCWaiter waiter = new KFCWaiter(a);
        //获得套餐
        KFC mealA = waiter.construct();
        System.out.print("套餐A的组成部分:");
        System.out.println("食物：" + mealA.getFood() + "；   " + "饮品：" + mealA.getDrink());
    }
}