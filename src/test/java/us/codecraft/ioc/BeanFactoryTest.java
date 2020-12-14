package us.codecraft.ioc;

import org.junit.Test;

/**
 * @功能:
 * @项目名:0cmSpring
 * @作者:0cm
 * @日期:2020/12/1410:34 上午
 */
public class BeanFactoryTest {
    @Test
    public void test(){
        //1、初始化beanfactory
        BeanFactory beanFactory  = new BeanFactory();

        //2、注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new HelloWorldService());
        beanFactory.registerBeanDefinition("helloWorldService",beanDefinition);

        //3、获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }
}