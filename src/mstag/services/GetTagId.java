// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JSR-172 Implementation wscompile 1.0, using: JAX-RPC Standard Implementation (1.1, build R59)

package mstag.services;


public class GetTagId {
    protected mstag.services.UserCredential userCredential;
    protected java.lang.String categoryName;
    protected java.lang.String tagName;
    
    public GetTagId() {
    }
    
    public GetTagId(mstag.services.UserCredential userCredential, java.lang.String categoryName, java.lang.String tagName) {
        this.userCredential = userCredential;
        this.categoryName = categoryName;
        this.tagName = tagName;
    }
    
    public mstag.services.UserCredential getUserCredential() {
        return userCredential;
    }
    
    public void setUserCredential(mstag.services.UserCredential userCredential) {
        this.userCredential = userCredential;
    }
    
    public java.lang.String getCategoryName() {
        return categoryName;
    }
    
    public void setCategoryName(java.lang.String categoryName) {
        this.categoryName = categoryName;
    }
    
    public java.lang.String getTagName() {
        return tagName;
    }
    
    public void setTagName(java.lang.String tagName) {
        this.tagName = tagName;
    }
}
