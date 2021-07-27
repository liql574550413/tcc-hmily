package com.li.bank1.service;




import com.li.bank1.dao.ZhangSanDao;
import org.dromara.hmily.annotation.HmilyTCC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liql
 * @date 2021/7/24
 */
@Service
public class ZhangSanServiceImpl implements ZhangSanService {
    @Autowired
    private FeignService feignService;
    @Autowired
    private ZhangSanDao zhangSanDao;

    @Override
    @Transactional//开启本地事务
    @HmilyTCC
    public void updateAccount(double account) {
        //因为张三的编号 accountNo 为 1
        zhangSanDao.updateAccount("1", account *-1);
        feignService.updateAccount(account);
    }
}
