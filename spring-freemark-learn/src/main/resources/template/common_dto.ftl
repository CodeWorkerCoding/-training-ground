package ${packageName};

import lombok.Builder;
import lombok.Data;

/**
* ${classDesc}
* @author fujianjian
* @date 2018/1/2 18:50
*/
@Data
@Builder
public class ${className} {

    <#list fieldList as fieldItem>

    /**
    * ${fieldItem.fieldDesc}
    * ${fieldItem.necessary.desc}
    */
    private ${fieldItem.fieldType.appearType} ${fieldItem.fieldName};
    </#list>
}