package us.codecraft.ioc;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @功能:
 * @项目名:0cmSpring
 * @作者:0cm
 * @日期:2020/12/1410:28 上午
 */
public class BeanFactory {
    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name,BeanDefinition beanDefinition){
        beanDefinitionMap.put(name,beanDefinition);
    }
}
