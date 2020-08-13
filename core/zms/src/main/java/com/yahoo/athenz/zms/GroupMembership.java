//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.yahoo.rdl.*;

//
// GroupMembership - The representation for a group membership.
//
public class GroupMembership {
    public String memberName;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean isMember;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String groupName;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Timestamp expiration;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean active;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean approved;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String auditRef;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String requestPrincipal;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer systemDisabled;

    public GroupMembership setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return memberName;
    }
    public GroupMembership setIsMember(Boolean isMember) {
        this.isMember = isMember;
        return this;
    }
    public Boolean getIsMember() {
        return isMember;
    }
    public GroupMembership setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return groupName;
    }
    public GroupMembership setExpiration(Timestamp expiration) {
        this.expiration = expiration;
        return this;
    }
    public Timestamp getExpiration() {
        return expiration;
    }
    public GroupMembership setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return active;
    }
    public GroupMembership setApproved(Boolean approved) {
        this.approved = approved;
        return this;
    }
    public Boolean getApproved() {
        return approved;
    }
    public GroupMembership setAuditRef(String auditRef) {
        this.auditRef = auditRef;
        return this;
    }
    public String getAuditRef() {
        return auditRef;
    }
    public GroupMembership setRequestPrincipal(String requestPrincipal) {
        this.requestPrincipal = requestPrincipal;
        return this;
    }
    public String getRequestPrincipal() {
        return requestPrincipal;
    }
    public GroupMembership setSystemDisabled(Integer systemDisabled) {
        this.systemDisabled = systemDisabled;
        return this;
    }
    public Integer getSystemDisabled() {
        return systemDisabled;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != GroupMembership.class) {
                return false;
            }
            GroupMembership a = (GroupMembership) another;
            if (memberName == null ? a.memberName != null : !memberName.equals(a.memberName)) {
                return false;
            }
            if (isMember == null ? a.isMember != null : !isMember.equals(a.isMember)) {
                return false;
            }
            if (groupName == null ? a.groupName != null : !groupName.equals(a.groupName)) {
                return false;
            }
            if (expiration == null ? a.expiration != null : !expiration.equals(a.expiration)) {
                return false;
            }
            if (active == null ? a.active != null : !active.equals(a.active)) {
                return false;
            }
            if (approved == null ? a.approved != null : !approved.equals(a.approved)) {
                return false;
            }
            if (auditRef == null ? a.auditRef != null : !auditRef.equals(a.auditRef)) {
                return false;
            }
            if (requestPrincipal == null ? a.requestPrincipal != null : !requestPrincipal.equals(a.requestPrincipal)) {
                return false;
            }
            if (systemDisabled == null ? a.systemDisabled != null : !systemDisabled.equals(a.systemDisabled)) {
                return false;
            }
        }
        return true;
    }

    //
    // sets up the instance according to its default field values, if any
    //
    public GroupMembership init() {
        if (isMember == null) {
            isMember = true;
        }
        if (active == null) {
            active = true;
        }
        if (approved == null) {
            approved = true;
        }
        return this;
    }
}
