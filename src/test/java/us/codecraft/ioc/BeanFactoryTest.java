package us.codecraft.ioc;

import org.junit.Test;
import us.codecraft.ioc.factory.AutowireCapableBeanFactory;
import us.codecraft.ioc.factory.BeanFactory;

/**
 * @功能:
 * @项目名:0cmSpring
 * @作者:0cm
 * @日期:2020/12/1410:34 上午
 */
public class BeanFactoryTest {
    @Test
    public void test() throws Exception {
        //1、初始化beanfactory
        BeanFactory beanFactory  = new AutowireCapableBeanFactory();

        //2、注入bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("us.codecraft.ioc.HelloWorldService");

        //3、设置属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("text","Hello world!"));
        beanDefinition.setPropertyValues(propertyValues);

        //4、生成bean
        beanFactory.registerBeanDefinition("helloWorldService",beanDefinition);

        //3、获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }
}
