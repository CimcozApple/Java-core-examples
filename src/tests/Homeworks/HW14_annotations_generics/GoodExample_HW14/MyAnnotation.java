package HomeWork.HW14;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    enum Status {
        NEW, IN_PROGRESS, PENDING, DONE, INVALID
    }

    int priority() default 3;

    Status status() default Status.NEW;

    String tag();

    boolean showInHelp() default true;

    String lastModified();
}