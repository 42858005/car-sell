package com.swj.carsell.aspect;

import com.swj.carsell.utils.BeanUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
@Aspect
public class SetFeildValueAspect {

    @Autowired
    private BeanUtil beanUtil;

    @Around("@annotation(com.swj.carsell.annotation.NeedSetFeildValue)")
    public Object doSetFeildValue(ProceedingJoinPoint pjp) throws  Throwable{
        Object ret = pjp.proceed();
        if(ret instanceof Collection){
            this.beanUtil.setFieldValueForCollection((Collection) ret);
        }else{
            //不是集合，也需要設置屬性值，，beanUtil还提供一个设置单个对象的属性值方法
            this.beanUtil.setFieldValueForOneObj(ret);
        }
        return ret;

    }


}
