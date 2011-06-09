// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JSR-172 Implementation wscompile 1.0, using: JAX-RPC Standard Implementation (1.1, build R59)

package mstag.services;



public class UserAuthFaultReason {
    private java.lang.String value;
    public static final String _UnspecifiedString = "Unspecified";
    public static final String _AuthenticationFailedString = "AuthenticationFailed";
    public static final String _InactiveUserString = "InactiveUser";
    public static final String _PremiumTagCreationDeniedString = "PremiumTagCreationDenied";
    public static final String _InsufficientFeaturePermissionString = "InsufficientFeaturePermission";
    public static final String _InvalidFeaturePermissionString = "InvalidFeaturePermission";
    
    public static final java.lang.String _Unspecified = new java.lang.String(_UnspecifiedString);
    public static final java.lang.String _AuthenticationFailed = new java.lang.String(_AuthenticationFailedString);
    public static final java.lang.String _InactiveUser = new java.lang.String(_InactiveUserString);
    public static final java.lang.String _PremiumTagCreationDenied = new java.lang.String(_PremiumTagCreationDeniedString);
    public static final java.lang.String _InsufficientFeaturePermission = new java.lang.String(_InsufficientFeaturePermissionString);
    public static final java.lang.String _InvalidFeaturePermission = new java.lang.String(_InvalidFeaturePermissionString);
    
    public static final UserAuthFaultReason Unspecified = new UserAuthFaultReason(_Unspecified);
    public static final UserAuthFaultReason AuthenticationFailed = new UserAuthFaultReason(_AuthenticationFailed);
    public static final UserAuthFaultReason InactiveUser = new UserAuthFaultReason(_InactiveUser);
    public static final UserAuthFaultReason PremiumTagCreationDenied = new UserAuthFaultReason(_PremiumTagCreationDenied);
    public static final UserAuthFaultReason InsufficientFeaturePermission = new UserAuthFaultReason(_InsufficientFeaturePermission);
    public static final UserAuthFaultReason InvalidFeaturePermission = new UserAuthFaultReason(_InvalidFeaturePermission);
    
    protected UserAuthFaultReason(java.lang.String value) {
        this.value = value;
    }
    
    public java.lang.String getValue() {
        return value;
    }
    
    public static UserAuthFaultReason fromValue(java.lang.String value)
        throws java.lang.IllegalStateException {
        if (Unspecified.value.equals(value)) {
            return Unspecified;
        } else if (AuthenticationFailed.value.equals(value)) {
            return AuthenticationFailed;
        } else if (InactiveUser.value.equals(value)) {
            return InactiveUser;
        } else if (PremiumTagCreationDenied.value.equals(value)) {
            return PremiumTagCreationDenied;
        } else if (InsufficientFeaturePermission.value.equals(value)) {
            return InsufficientFeaturePermission;
        } else if (InvalidFeaturePermission.value.equals(value)) {
            return InvalidFeaturePermission;
        }
        throw new IllegalArgumentException();
    }
    
    public static UserAuthFaultReason fromString(String value)
        throws java.lang.IllegalStateException {
        if (value.equals(_UnspecifiedString)) {
            return Unspecified;
        } else if (value.equals(_AuthenticationFailedString)) {
            return AuthenticationFailed;
        } else if (value.equals(_InactiveUserString)) {
            return InactiveUser;
        } else if (value.equals(_PremiumTagCreationDeniedString)) {
            return PremiumTagCreationDenied;
        } else if (value.equals(_InsufficientFeaturePermissionString)) {
            return InsufficientFeaturePermission;
        } else if (value.equals(_InvalidFeaturePermissionString)) {
            return InvalidFeaturePermission;
        }
        throw new IllegalArgumentException();
    }
    
    public String toString() {
        return value.toString();
    }
    
    private Object readResolve() {
        return fromValue(getValue());
    }
    
    public boolean equals(Object obj) {
        if (!(obj instanceof UserAuthFaultReason)) {
            return false;
        }
        return ((UserAuthFaultReason)obj).value.equals(value);
    }
    
    public int hashCode() {
        return value.hashCode();
    }
}