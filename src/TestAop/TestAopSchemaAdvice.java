package TestAop;

import aop.AspectBiz;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by ParanoidRoye on 2015/12/17.
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAopSchemaAdvice  extends UnitTestBase{


    public TestAopSchemaAdvice(){

        super("classpath:spring-aop-schema-advice.xml");
    }

    @Test
  public  void testBiz(){
        AspectBiz biz = super.getBean("aspectBiz");
        biz.biz();

    }


}
