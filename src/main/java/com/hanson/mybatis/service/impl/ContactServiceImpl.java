package com.hanson.mybatis.service.impl;

import com.hanson.mybatis.bean.Contact;
import com.hanson.mybatis.dao.ContactDao;
import com.hanson.mybatis.service.ContactService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hanson
 * @since 2019-10-18
 */
@Service
public class ContactServiceImpl extends ServiceImpl<ContactDao, Contact> implements ContactService {

}
