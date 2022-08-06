package proxy.staticProxy;

import java.util.Date;

/**
 * @author chennanjiang
 * @title helloService
 * @date 2022/8/5 12:33
 * @description TODO
 */
public interface HelloService {
    public String echo(String mes);
    public Date getTime();
}
