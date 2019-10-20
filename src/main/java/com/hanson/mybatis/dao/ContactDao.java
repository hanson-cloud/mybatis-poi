package com.hanson.mybatis.dao;

import com.hanson.mybatis.bean.Contact;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hanson
 * @since 2019-10-18
 */
@Repository
public interface ContactDao extends BaseMapper<Contact> {

    List<Contact> getContactsByMasterId(Long masterId);

}
