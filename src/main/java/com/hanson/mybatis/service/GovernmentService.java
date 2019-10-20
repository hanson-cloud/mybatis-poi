package com.hanson.mybatis.service;

import com.hanson.mybatis.bean.Government;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 政企客户主表 服务类
 * </p>
 *
 * @author hanson
 * @since 2019-10-18
 */
public interface GovernmentService extends IService<Government> {

    List<Government> doSearch();

    Government getGovernment(long id);
}
