package com.yelanyanyu;

import com.yelanyanyu.io.PropertyResolver;
import com.yelanyanyu.webmvc.util.WebUtils;
import com.yelanyanyu.webmvc.view.InternalResourceViewResolver;
import com.yelanyanyu.webmvc.view.ViewResolver;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
@Slf4j
public class WebUtilsTest {
    @Test
    public void t1() {
        PropertyResolver propertyResolver = WebUtils.createPropertyResolver();
    }

    @Test
    public void t2() {
        log.info("is: {}", ViewResolver.class.isAssignableFrom(InternalResourceViewResolver.class));
    }
}
