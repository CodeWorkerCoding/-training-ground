package com.nchu.learn.freemark.config;

import com.nchu.learn.freemark.model.DemoDo;
import com.nchu.learn.freemark.model.FieldDo;
import freemarker.template.Configuration;
import freemarker.template.Template;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/2 18:31
 */
@Slf4j
@Component
public class TemplateManager implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        //DTOClassTemp();
    }

    private void DemoTemp() throws Exception {
        DemoDo demo = DemoDo.builder().name("kevin").age(10).build();
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_26);
        cfg.setClassForTemplateLoading(TemplateManager.class, "/template");
        Template template = cfg.getTemplate("demo.ftl");
        String demoTemp = FreeMarkerTemplateUtils.processTemplateIntoString(template, demo);
        log.info("temp: {}", demoTemp);
    }

    private void DTOClassTemp() throws Exception {
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_26);
        cfg.setClassForTemplateLoading(TemplateManager.class, "/template");
        Template template = cfg.getTemplate("common_dto.ftl");
        Map<String, Object> object = new HashMap<>();
        object.put("packageName", "com.shenma.samp.push.model.dto");
        object.put("projectName", "samp");
        object.put("className", "LoanApplyDo");
        //Boolean
        List<FieldDo> list = new ArrayList<FieldDo>(){{
            add(FieldDo.builder().fieldName("agentBrand").fieldType("String").fieldComment("代理品牌 (0,32]").need("可选").build());
            add(FieldDo.builder().fieldName("agentLevel").fieldType("String").fieldComment("代理级别 (0,16]").need("可选").build());
            add(FieldDo.builder().fieldName("assetsName").fieldType("String").fieldComment("资产方名称 (0,32]").need("必填").build());
            add(FieldDo.builder().fieldName("assetsNumber").fieldType("String").fieldComment("资产项目编号 (0,32]").need("必填").build());
            add(FieldDo.builder().fieldName("auditFaceResult").fieldType("String").fieldComment("面审结果 (0,512]").need("可选").build());
            add(FieldDo.builder().fieldName("auditPhoneResult").fieldType("String").fieldComment("电核结果 (0,512]").need("可选").build());
            add(FieldDo.builder().fieldName("auditResult").fieldType("String").fieldComment("审批结果 (0,8]").need("必填").build());
            add(FieldDo.builder().fieldName("borrowerBankAccount").fieldType("String").fieldComment("借款人银行卡卡号 (0,32]").need("必填").build());
            add(FieldDo.builder().fieldName("borrowerBankCode").fieldType("String").fieldComment("借款人银行卡所属银行编码 (4)").need("必填").build());
            add(FieldDo.builder().fieldName("borrowerBlackInfo").fieldType("String").fieldComment("借款人黑名单信息 (0,512]").need("可选").build());
            add(FieldDo.builder().fieldName("borrowerContactsName").fieldType("String").fieldComment("借款人紧急联系人姓名 (0,16]").need("必填").build());
            add(FieldDo.builder().fieldName("borrowerContactsRelation").fieldType("String").fieldComment("借款人紧急联系人关系 (0,32]").need("必填").build());
            add(FieldDo.builder().fieldName("borrowerContactsTelPhone").fieldType("String").fieldComment("借款人紧急联系人手机号 (0,32]").need("必填").build());
            add(FieldDo.builder().fieldName("borrowerIdCard").fieldType("String").fieldComment("借款人身份证号码 (18) （仅仅支持二代身份证）").need("必填").build());
            add(FieldDo.builder().fieldName("borrowerIncome").fieldType("String").fieldComment("借款人收入 [0,32]").need("可选").build());
            add(FieldDo.builder().fieldName("borrowerLocation").fieldType("String").fieldComment("借款人银行卡开户所在地 (6) （国家行政区域划分代码，请使用国标。参考国家统计局发布的最新区域代码：http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/201703/t20170310_1471429.html）").need("必填").build());
            add(FieldDo.builder().fieldName("borrowerName").fieldType("String").fieldComment("借款人姓名 (0,16]").need("必填").build());
            add(FieldDo.builder().fieldName("borrowerPost").fieldType("String").fieldComment("借款人职业 [0,32]").need("可选").build());
            add(FieldDo.builder().fieldName("borrowerTelPhone").fieldType("String").fieldComment("借款人手机号 (11)").need("必填").build());
            add(FieldDo.builder().fieldName("courtInfo").fieldType("String").fieldComment("法院信息 (0,512]").need("可选").build());
            add(FieldDo.builder().fieldName("dataFiles").fieldType("List<LoanFileDataDo>").fieldComment("相关附件").need("可选").build());
            add(FieldDo.builder().fieldName("distributionAmount").fieldType("Double").fieldComment("资产方清分金额 (10,2)").need("必填").build());
            add(FieldDo.builder().fieldName("entrustmentWithdraw").fieldType("Boolean").fieldComment("是否委托提现").need("必填").build());
            add(FieldDo.builder().fieldName("historyIssueLoan").fieldType("Double").fieldComment("历史借款金额 (10,2)").need("可选").build());
            add(FieldDo.builder().fieldName("historyLoanCount").fieldType("Integer").fieldComment("历史借款次数 (4)").need("可选").build());
            add(FieldDo.builder().fieldName("historyOverdueAmount").fieldType("Double").fieldComment("代历史逾期金额 (10,2)").need("可选").build());
            add(FieldDo.builder().fieldName("historyOverdueCount").fieldType("Integer").fieldComment("历史逾期次数 (4)").need("可选").build());
            add(FieldDo.builder().fieldName("historyOverdueMaxAmount").fieldType("Double").fieldComment("历史最大逾期金额 (10,2)").need("可选").build());
            add(FieldDo.builder().fieldName("historyOverdueMaxDay").fieldType("Integer").fieldComment("历史最长逾期天数 (4)").need("可选").build());
            add(FieldDo.builder().fieldName("issueLoan").fieldType("Double").fieldComment("借款金额 (10,2)").need("必填").build());
            add(FieldDo.builder().fieldName("payeeBankAccount").fieldType("String").fieldComment("收款人银行卡卡号 (0,32]").need("必填").build());
            add(FieldDo.builder().fieldName("payeeBankCode").fieldType("String").fieldComment("收款人银行卡所属银行编码 (4)").need("必填").build());
            add(FieldDo.builder().fieldName("payeeIdCard").fieldType("String").fieldComment("收款人身份证号码 (18)").need("必填").build());
            add(FieldDo.builder().fieldName("payeeLocation").fieldType("String").fieldComment("收款人银行卡开户所在地 (6) （国家行政区域划分代码，请使用国标。参考国家统计局发布的最新区域代码：http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/201703/t20170310_1471429.html）").need("必填").build());
            add(FieldDo.builder().fieldName("payeeName").fieldType("String").fieldComment("收款人姓名 (0,16]").need("必填").build());
            add(FieldDo.builder().fieldName("payeeTelPhone").fieldType("String").fieldComment("收款人手机号 (11)").need("必填").build());
            add(FieldDo.builder().fieldName("product").fieldType("String").fieldComment("产品类型 (0,16]").need("必填").build());
            add(FieldDo.builder().fieldName("refundWay").fieldType("String").fieldComment("还款方式").need("必填").build());
            add(FieldDo.builder().fieldName("stockSeason").fieldType("String").fieldComment("厂家季度进货 (0,16]").need("可选").build());
            add(FieldDo.builder().fieldName("stockYear").fieldType("String").fieldComment("厂家年度进货 (0,16]").need("可选").build());
            add(FieldDo.builder().fieldName("systemGrade").fieldType("String").fieldComment("系统评级 (0,8]").need("可选").build());
            add(FieldDo.builder().fieldName("timeLimit").fieldType("Integer").fieldComment("借款期限 (4)").need("必填").build());
            add(FieldDo.builder().fieldName("timeLimitUnit").fieldType("String").fieldComment("借款期限单位").need("必填").build());
        }};
        object.put("fieldList", list);

        String demoTemp = FreeMarkerTemplateUtils.processTemplateIntoString(template, object);
        log.info("temp: {}", demoTemp);
    }
}
