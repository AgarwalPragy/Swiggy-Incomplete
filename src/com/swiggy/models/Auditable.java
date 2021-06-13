package com.swiggy.models;

import java.util.Date;

public abstract class Auditable {
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private Date created;
    @Getter @Setter
    private Date modified;
}
