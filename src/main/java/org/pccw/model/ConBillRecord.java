package org.pccw.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
public class ConBillRecord extends BaseModel {

    private LocalDateTime billPeriodStartDate;

    private LocalDateTime billPeriodEndDate;

    private String billRefNo;

    private UUID rsUuid;

}
