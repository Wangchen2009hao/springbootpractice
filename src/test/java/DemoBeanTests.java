import com.zhuanzhuan.test.TestBean;
import com.zhuanzhuan.test.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangchen11
 * @date 2018年01月26日 23:08
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("dev")
public class DemoBeanTests {

    @Autowired
    private TestBean testBean;

    @Test
    public void prodBeansShouldInject(){
//        String expected = "from product profile";
//        String actual = testBean.getContent();
//        Assert.assertEquals(expected,actual);
//        System.out.println(actual);

        Map<String,String> map = new HashMap<String, String>();
        map.put("AAA","BBB");

    }
}
