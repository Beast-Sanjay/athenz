//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.yahoo.rdl.*;

//
// GroupSystemMeta - Set of system metadata attributes that all groups may have
// and can be changed by system admins.
//
public class GroupSystemMeta {
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean auditEnabled;

    public GroupSystemMeta setAuditEnabled(Boolean auditEnabled) {
        this.auditEnabled = auditEnabled;
        return this;
    }
    public Boolean getAuditEnabled() {
        return auditEnabled;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != GroupSystemMeta.class) {
                return false;
            }
            GroupSystemMeta a = (GroupSystemMeta) another;
            if (auditEnabled == null ? a.auditEnabled != null : !auditEnabled.equals(a.auditEnabled)) {
                return false;
            }
        }
        return true;
    }
}
