package company.proxy;

import company.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
