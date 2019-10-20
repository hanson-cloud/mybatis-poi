package com.hanson.mybatis.service.impl;

import com.hanson.mybatis.bean.Government;
import com.hanson.mybatis.dao.GovernmentDao;
import com.hanson.mybatis.service.GovernmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 政企客户主表 服务实现类
 * </p>
 *
 * @author hanson
 * @since 2019-10-18
 */
@Service
public class GovernmentServiceImpl extends ServiceImpl<GovernmentDao, Government> implements GovernmentService {

    @Autowired
    private GovernmentDao governmentDao;

    @Override
    public List<Government> doSearch() {
        return governmentDao.doSearch();
    }

    @Override
    public Government getGovernment(long id) {
        governmentDao.selectById(id);
        return null;
    }
}
