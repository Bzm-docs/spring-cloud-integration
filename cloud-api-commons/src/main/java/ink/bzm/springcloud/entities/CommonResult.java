package ink.bzm.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Json封装体CommentResult,传给前端，判断编码是否成功，成功才显示
 *
 * @author: buzhengmiao    www.bzm.ink
 * @time: 2020/5/5 20:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }
}
