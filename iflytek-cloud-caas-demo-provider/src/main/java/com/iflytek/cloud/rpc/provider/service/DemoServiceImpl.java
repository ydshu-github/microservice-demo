package com.iflytek.cloud.rpc.provider.service;


import com.iflytek.cloud.rpc.api.DemoService;
import com.iflytek.cloud.rpc.provider.dao.DemoDao;
import com.iflytek.cloud.rpc.provider.model.Demo;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author ychuang13
 */
@DubboService(version = "${service.demo.version}")
public class DemoServiceImpl implements DemoService {

    @Autowired
    DemoDao demoDao;
    @Override
    public String saveKeyword(String keyword) {
        Demo demo = new Demo();
        demo.setDemoString(keyword);
        demoDao.save(demo);
        return keyword;
    }
}
