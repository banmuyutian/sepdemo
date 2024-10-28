package org.pccw.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
public class ConRsRecord extends BaseModel {

    private BigDecimal bs;

    private LocalDateTime dueDate;

    private UUID memberAcctUuid;

    private UUID payrollGroupUuid;

    private LocalDateTime periodStartDate;

    private LocalDateTime periodEndDate;

    private BigDecimal ri;

    private String status;

    private String workDayCounts;

    private String submitRefNo;

}
