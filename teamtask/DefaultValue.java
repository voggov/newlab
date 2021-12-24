package ru.coderiders.teamtask;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.LOCAL_VARIABLE})
public @interface DefaultValue {
    String value() default "https://ru.drivemusic.me/dl/Hu1UU3t9Qvh6EMAdLTCk8A/1639769791/download_music/2018/03/rick-astley-never-gonna-give-you-up.mp3";
   // String to() default "D:\\MyFolder\\cr_group2-develop\\src\\main\\java\\ru\\coderiders\\teamtask\\files\\";
}
