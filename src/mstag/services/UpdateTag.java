// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JSR-172 Implementation wscompile 1.0, using: JAX-RPC Standard Implementation (1.1, build R59)

package mstag.services;


public class UpdateTag {
    protected mstag.services.UserCredential userCredential;
    protected java.lang.String categoryName;
    protected java.lang.String existingTagName;
    protected mstag.services.Tag tag;
    
    public UpdateTag() {
    }
    
    public UpdateTag(mstag.services.UserCredential userCredential, java.lang.String categoryName, java.lang.String existingTagName, mstag.services.Tag tag) {
        this.userCredential = userCredential;
        this.categoryName = categoryName;
        this.existingTagName = existingTagName;
        this.tag = tag;
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
    
    public java.lang.String getExistingTagName() {
        return existingTagName;
    }
    
    public void setExistingTagName(java.lang.String existingTagName) {
        this.existingTagName = existingTagName;
    }
    
    public mstag.services.Tag getTag() {
        return tag;
    }
    
    public void setTag(mstag.services.Tag tag) {
        this.tag = tag;
    }
}
