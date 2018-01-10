package ${packageName};

import lombok.Builder;
import lombok.Data;

/**
* @author fujianjian
* @project ${projectName}
* @date 2018/1/2 18:50
*/
@Data
@Builder
public class ${className} {

    <#list fieldList as fieldItem>

    /**
    * ${fieldItem.fieldComment}
    * ${fieldItem.need}
    */
    private ${fieldItem.fieldType} ${fieldItem.fieldName};
    </#list>
}