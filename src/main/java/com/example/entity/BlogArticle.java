package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2022-09-14
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    @TableName("blog_article")
@ApiModel(value="BlogArticle对象", description="")
public class BlogArticle implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty(value = "标题")
      private String title;

      @ApiModelProperty(value = "内容")
      private String content;

      @ApiModelProperty(value = "发布时间")
      private String pushTime;

      @ApiModelProperty(value = "方向")
      private String direction;


}
