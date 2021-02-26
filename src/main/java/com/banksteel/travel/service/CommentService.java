package com.banksteel.travel.service;

import com.banksteel.travel.entity.City;
import com.banksteel.travel.entity.Comment;

import java.util.List;

public interface CommentService {

    int insertComment(Comment comment);

    int deleteCommentById(Integer id);

    int updateCommentById(Comment comment);

    Comment selectCommentById(Integer id);

    List<City> selectCommentsByCondition(String condition);

}
