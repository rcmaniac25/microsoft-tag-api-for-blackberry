// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JSR-172 Implementation wscompile 1.0, using: JAX-RPC Standard Implementation (1.1, build R59)

package mstag.services;



public class TagStatus {
    private java.lang.String value;
    public static final String _ActiveString = "Active";
    public static final String _PausedString = "Paused";
    public static final String _DeleteString = "Delete";
    
    public static final java.lang.String _Active = new java.lang.String(_ActiveString);
    public static final java.lang.String _Paused = new java.lang.String(_PausedString);
    public static final java.lang.String _Delete = new java.lang.String(_DeleteString);
    
    public static final TagStatus Active = new TagStatus(_Active);
    public static final TagStatus Paused = new TagStatus(_Paused);
    public static final TagStatus Delete = new TagStatus(_Delete);
    
    protected TagStatus(java.lang.String value) {
        this.value = value;
    }
    
    public java.lang.String getValue() {
        return value;
    }
    
    public static TagStatus fromValue(java.lang.String value)
        throws java.lang.IllegalStateException {
        if (Active.value.equals(value)) {
            return Active;
        } else if (Paused.value.equals(value)) {
            return Paused;
        } else if (Delete.value.equals(value)) {
            return Delete;
        }
        throw new IllegalArgumentException();
    }
    
    public static TagStatus fromString(String value)
        throws java.lang.IllegalStateException {
        if (value.equals(_ActiveString)) {
            return Active;
        } else if (value.equals(_PausedString)) {
            return Paused;
        } else if (value.equals(_DeleteString)) {
            return Delete;
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
        if (!(obj instanceof TagStatus)) {
            return false;
        }
        return ((TagStatus)obj).value.equals(value);
    }
    
    public int hashCode() {
        return value.hashCode();
    }
}
