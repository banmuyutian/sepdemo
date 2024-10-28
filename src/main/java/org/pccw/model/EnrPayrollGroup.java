package org.pccw.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class EnrPayrollGroup extends BaseModel {

    private String payrollGroupShortName;

}
