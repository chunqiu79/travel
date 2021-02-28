package com.banksteel.travel.controller;

import com.banksteel.travel.entity.Comment;
import com.banksteel.travel.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class CommentController {

    @Autowired
    CommentService commentService;

    @RequestMapping(value = "/comment/{id}", method = RequestMethod.GET)
    public ModelAndView comment(@PathVariable("id") Integer id, Map<String, Object> result) {
        List<Comment> comments = commentService.selectCommentsBySightId(id);
        result.put("comments", comments);
        return new ModelAndView("comment", "result", result);
    }

}
