// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JSR-172 Implementation wscompile 1.0, using: JAX-RPC Standard Implementation (1.1, build R59)

package mstag.services;


public class CreateCategory {
    protected mstag.services.UserCredential userCredential;
    protected mstag.services.Category category;
    
    public CreateCategory() {
    }
    
    public CreateCategory(mstag.services.UserCredential userCredential, mstag.services.Category category) {
        this.userCredential = userCredential;
        this.category = category;
    }
    
    public mstag.services.UserCredential getUserCredential() {
        return userCredential;
    }
    
    public void setUserCredential(mstag.services.UserCredential userCredential) {
        this.userCredential = userCredential;
    }
    
    public mstag.services.Category getCategory() {
        return category;
    }
    
    public void setCategory(mstag.services.Category category) {
        this.category = category;
    }
}
