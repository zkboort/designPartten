package proxy.staticProxy;

import java.util.Date;

/**
 * @author chennanjiang
 * @title HelloServiceimp
 * @date 2022/8/5 12:35
 * @description TODO
 */
public class HelloServiceimp implements HelloService {
    @Override
    public String echo(String mes) {
        return "echo:"+mes;
    }

    @Override
    public Date getTime() {
        return new Date();
    }
}
