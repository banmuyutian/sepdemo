package org.pccw.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
public class ConSubmitRecord extends BaseModel {

    private UUID rsUuid;

    private String workflowId;

    private String contentType;

    private String submitChannel;

    private String data;

}
