package com.boot.dao;

import com.boot.model.UserMange;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by ZHAO130 on 2016/11/10.
 */
@Transactional
public interface  UserManageDao extends Repository<UserMange,Long> {
    public List<UserMange> findAll();
    public UserMange save(UserMange userMange);
    @Query("select bean from UserMange bean where bean.name=?1 ")
    public List<UserMange> findByName(String name);
}
