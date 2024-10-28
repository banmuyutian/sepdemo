package org.pccw.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
public class ConBillDtlAllocPay extends BaseModel {

    private UUID periodContrSubacctUuid;

    private BigDecimal assignAmt;

    private BigDecimal paidAmt;

    private String submitPaySeqNo;

    private UUID payMethodUuid;

    private UUID payTagDtlUuid;

    private LocalDateTime effDate;

    private LocalDateTime cycleChangeDate;

}
