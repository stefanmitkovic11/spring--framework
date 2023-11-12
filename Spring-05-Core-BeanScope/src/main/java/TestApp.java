import company.model.Comment;

public class TestApp {
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Stefan");
        comment.setText("Hello Spring");


        Comment comment2 = new Comment();
        comment2.setAuthor("Johnson");
        comment2.setText("Hello");



//        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//
//        CommentService cs1 = context.getBean(CommentService.class);
//        CommentService cs2 = context.getBean(CommentService.class);
//
//
//        System.out.println(cs1);
//        System.out.println(cs2);



//      Adding a @Scope("prototype") or @Scope(BeanDefinition.SCOPE_PROTOTYPE) in service class spring will create different objects and will show as false
//        System.out.println(cs1 == cs2);



    }
}
