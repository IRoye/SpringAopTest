package aop;

/**
 * Created by ParanoidRoye on 2015/12/17.
 * WaAspect 类为切面类
 */
public class WaAspect {

    //前置通知要调用的方法；
    public void before()
    {
        System.out.println("WaPage Before");
    }

}
