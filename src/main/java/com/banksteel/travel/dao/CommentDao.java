package com.banksteel.travel.dao;

import com.banksteel.travel.entity.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository("commentDao")
public interface CommentDao extends BaseMapper<Comment> {

}