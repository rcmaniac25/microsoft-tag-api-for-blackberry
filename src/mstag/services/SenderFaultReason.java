// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JSR-172 Implementation wscompile 1.0, using: JAX-RPC Standard Implementation (1.1, build R59)

package mstag.services;



public class SenderFaultReason {
    private java.lang.String value;
    public static final String _UnspecifiedString = "Unspecified";
    public static final String _InvalidArgumentString = "InvalidArgument";
    public static final String _NullOrEmptyArgumentString = "NullOrEmptyArgument";
    public static final String _InvalidFormatString = "InvalidFormat";
    public static final String _ValueOutOfRangeString = "ValueOutOfRange";
    public static final String _OverflowString = "Overflow";
    
    public static final java.lang.String _Unspecified = new java.lang.String(_UnspecifiedString);
    public static final java.lang.String _InvalidArgument = new java.lang.String(_InvalidArgumentString);
    public static final java.lang.String _NullOrEmptyArgument = new java.lang.String(_NullOrEmptyArgumentString);
    public static final java.lang.String _InvalidFormat = new java.lang.String(_InvalidFormatString);
    public static final java.lang.String _ValueOutOfRange = new java.lang.String(_ValueOutOfRangeString);
    public static final java.lang.String _Overflow = new java.lang.String(_OverflowString);
    
    public static final SenderFaultReason Unspecified = new SenderFaultReason(_Unspecified);
    public static final SenderFaultReason InvalidArgument = new SenderFaultReason(_InvalidArgument);
    public static final SenderFaultReason NullOrEmptyArgument = new SenderFaultReason(_NullOrEmptyArgument);
    public static final SenderFaultReason InvalidFormat = new SenderFaultReason(_InvalidFormat);
    public static final SenderFaultReason ValueOutOfRange = new SenderFaultReason(_ValueOutOfRange);
    public static final SenderFaultReason Overflow = new SenderFaultReason(_Overflow);
    
    protected SenderFaultReason(java.lang.String value) {
        this.value = value;
    }
    
    public java.lang.String getValue() {
        return value;
    }
    
    public static SenderFaultReason fromValue(java.lang.String value)
        throws java.lang.IllegalStateException {
        if (Unspecified.value.equals(value)) {
            return Unspecified;
        } else if (InvalidArgument.value.equals(value)) {
            return InvalidArgument;
        } else if (NullOrEmptyArgument.value.equals(value)) {
            return NullOrEmptyArgument;
        } else if (InvalidFormat.value.equals(value)) {
            return InvalidFormat;
        } else if (ValueOutOfRange.value.equals(value)) {
            return ValueOutOfRange;
        } else if (Overflow.value.equals(value)) {
            return Overflow;
        }
        throw new IllegalArgumentException();
    }
    
    public static SenderFaultReason fromString(String value)
        throws java.lang.IllegalStateException {
        if (value.equals(_UnspecifiedString)) {
            return Unspecified;
        } else if (value.equals(_InvalidArgumentString)) {
            return InvalidArgument;
        } else if (value.equals(_NullOrEmptyArgumentString)) {
            return NullOrEmptyArgument;
        } else if (value.equals(_InvalidFormatString)) {
            return InvalidFormat;
        } else if (value.equals(_ValueOutOfRangeString)) {
            return ValueOutOfRange;
        } else if (value.equals(_OverflowString)) {
            return Overflow;
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
        if (!(obj instanceof SenderFaultReason)) {
            return false;
        }
        return ((SenderFaultReason)obj).value.equals(value);
    }
    
    public int hashCode() {
        return value.hashCode();
    }
}
