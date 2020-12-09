package tests.HW14_annotations_generics.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.LOCAL_VARIABLE}) //on variable level
public @interface ClientDetails {
enum ClientType{
    RETAIL, PROFESSIONAL, AGRICULTURE
}
    ClientType type() default ClientType.RETAIL;
    String position() default "";
    String[] region() default "New York";
}
