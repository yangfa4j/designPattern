package visitor;

/**
 * @Date 2019/12/9
 * @Author yangfa
 * @Description
 */
public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getMan(this);
    }
}
