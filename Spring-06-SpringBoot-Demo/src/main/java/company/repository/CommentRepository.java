package company.repository;

import company.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
