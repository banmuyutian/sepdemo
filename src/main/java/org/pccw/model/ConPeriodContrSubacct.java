package org.pccw.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
public class ConPeriodContrSubacct extends BaseModel {

    private UUID memberAcctUuid;

    private BigDecimal reportContrAmt;

    private BigDecimal calculatedContrAmt;

    private BigDecimal paidAmt;

    private UUID rsUuid;

    private UUID subacctTypeUuid;

    private UUID billUuid;

    private String eligibleToPayFlag;

}
