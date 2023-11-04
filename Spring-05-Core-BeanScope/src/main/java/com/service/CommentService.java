package com.service;

import com.model.Comment;
import com.proxy.CommentNotificationProxy;
import com.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Lazy
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

//    @Autowired
    public CommentService(CommentRepository commentRepository, @Qualifier("emailNotification") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
        System.out.println("Test @Lazy");
    }

//    @Autowired
    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
