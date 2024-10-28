package org.pccw.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
public class ConSepSubmitRecord extends BaseModel {

    private UUID memberAcctUuid;

    private BigDecimal declaredRi;

    private String frequency;

    private String riOption;

    private LocalDateTime finPeriodFrom;

    private LocalDateTime finPeriodTo;

}
