package tests.HW14_annotations_generics.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) //on method level
public @interface CheckLocalization {
    enum Localization {
        NEW_YORK, LA, LONDON, UKRAINE, MALTA
    }

    Localization local() default Localization.LONDON;
    String currentTime() default "00:00:00";
    String description() default "";
    String[] region() default "";
}
