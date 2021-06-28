package com.ymt.swb.api.dto;

import lombok.Builder;
import lombok.Getter;

/**
 * Description
 *
 * @author yumingtao
 * @date 5/27/21 5:26 PM
 */
@Builder
public class HelloWordDTO {
    @Getter
    private String content;
}
