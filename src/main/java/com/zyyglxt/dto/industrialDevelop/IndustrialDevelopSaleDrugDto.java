package com.zyyglxt.dto.industrialDevelop;

import com.zyyglxt.dataobject.IndustrialDevelopSaleDrug;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
   *@Author lrt
   *@Date 2020/11/6 20:00
   *@Version 1.0
**/
@ApiModel(value="com-zyyglxt-dataobject-IndustrialDevelopSaleDrug")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndustrialDevelopSaleDrugDto extends IndustrialDevelopSaleDrug {
    private String filePath;
}