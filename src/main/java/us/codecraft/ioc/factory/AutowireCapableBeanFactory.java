package us.codecraft.ioc.factory;

import us.codecraft.ioc.BeanDefinition;

/**
 * @功能:
 * @项目名:0cmSpring
 * @作者:0cm
 * @日期:2020/12/142:02 下午
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) {
        try {
            Object bean = beanDefinition.getBeanClass().newInstance();
            return bean;
        }catch (InstantiationException e){
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
