package org.pccw.model;

import lombok.Data;

import java.util.UUID;

@Data
public class BaseModel {

    private UUID id;

    private String schemeCode;

    private String archiveFlag;

}
