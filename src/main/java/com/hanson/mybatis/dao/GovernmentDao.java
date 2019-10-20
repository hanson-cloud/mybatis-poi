package com.hanson.mybatis.dao;

import com.hanson.mybatis.bean.Government;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 政企客户主表 Mapper 接口
 * </p>
 *
 * @author hanson
 * @since 2019-10-18
 */
@Repository
public interface GovernmentDao extends BaseMapper<Government> {

    List<Government> doSearch();

}
