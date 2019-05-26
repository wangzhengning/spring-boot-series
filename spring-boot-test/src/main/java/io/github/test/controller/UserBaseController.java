package io.github.test.controller;


import io.github.test.domain.entity.UserBase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author
 * @since 2019-05-07
 */
@RestController
@RequestMapping("/userBase")
public class UserBaseController {
    @PostMapping("/")
    public Object add(@RequestBody UserBase userBase) {
        return userBase;
    }
}
