package us.codecraft.ioc;

/**
 * @功能:
 * @项目名:0cmSpring
 * @作者:0cm
 * @日期:2020/12/1410:25 上午
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition (Object bean){
        this.bean = bean;
    }

    public Object getBean(){
        return bean;
    }
}
