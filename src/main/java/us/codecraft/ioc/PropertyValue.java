package us.codecraft.ioc;

/**
 * @功能:用于bean的属性注入
 * @项目名:0cmSpring
 * @作者:0cm
 * @日期:2020/12/142:30 下午
 */
public class PropertyValue {
    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
