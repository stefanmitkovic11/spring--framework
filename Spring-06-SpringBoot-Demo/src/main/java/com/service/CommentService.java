package com.service;

import com.model.Comment;
import com.proxy.CommentNotificationProxy;
import com.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
//@Lazy
public class CommentService {

    @Value("${name}")
    private String name;
    @Value("${server.port}")
    private Integer port;

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    //    @Autowired
    public CommentService(CommentRepository commentRepository, @Qualifier("emailNotification") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
        System.out.println("Test @Lazy");
        System.out.println("Name: " + name);
        System.out.println("Port: "+port);
    }

    //    @Autowired
    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
