// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JSR-172 Implementation wscompile 1.0, using: JAX-RPC Standard Implementation (1.1, build R59)

package mstag.services;


public class ReceiverFault_Type {
    protected java.lang.String errorMessage;
    protected mstag.services.ReceiverFaultReason reason;
    
    public ReceiverFault_Type() {
    }
    
    public ReceiverFault_Type(java.lang.String errorMessage, mstag.services.ReceiverFaultReason reason) {
        this.errorMessage = errorMessage;
        this.reason = reason;
    }
    
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }
    
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
    public mstag.services.ReceiverFaultReason getReason() {
        return reason;
    }
    
    public void setReason(mstag.services.ReceiverFaultReason reason) {
        this.reason = reason;
    }
}
