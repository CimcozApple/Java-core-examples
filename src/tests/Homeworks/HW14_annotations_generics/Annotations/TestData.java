package tests.HW14_annotations_generics.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.LOCAL_VARIABLE}) //on class, method, variable level
public @interface TestData {
   enum TesterPosition {
       JUNIOR, MIDDLE, SENIOR, LEAD
   }

    TesterPosition whoPassTest() default TesterPosition.MIDDLE;
    String priority() default "High";
    String timeToPass() default "";
    String environment() default "Chrome";
    String[] sections() default "";
}

