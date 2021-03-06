/**
 * DoFeedbackRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SandboxWebApi;

public class DoFeedbackRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private long feItemId;

    private java.lang.Integer feUseCommentTemplate;

    private int feToUserId;

    private java.lang.String feComment;

    private java.lang.String feCommentType;

    private int feOp;

    private SandboxWebApi.SellRatingEstimationStruct[] feRating;

    public DoFeedbackRequest() {
    }

    public DoFeedbackRequest(
           java.lang.String sessionHandle,
           long feItemId,
           java.lang.Integer feUseCommentTemplate,
           int feToUserId,
           java.lang.String feComment,
           java.lang.String feCommentType,
           int feOp,
           SandboxWebApi.SellRatingEstimationStruct[] feRating) {
           this.sessionHandle = sessionHandle;
           this.feItemId = feItemId;
           this.feUseCommentTemplate = feUseCommentTemplate;
           this.feToUserId = feToUserId;
           this.feComment = feComment;
           this.feCommentType = feCommentType;
           this.feOp = feOp;
           this.feRating = feRating;
    }


    /**
     * Gets the sessionHandle value for this DoFeedbackRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoFeedbackRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the feItemId value for this DoFeedbackRequest.
     * 
     * @return feItemId
     */
    public long getFeItemId() {
        return feItemId;
    }


    /**
     * Sets the feItemId value for this DoFeedbackRequest.
     * 
     * @param feItemId
     */
    public void setFeItemId(long feItemId) {
        this.feItemId = feItemId;
    }


    /**
     * Gets the feUseCommentTemplate value for this DoFeedbackRequest.
     * 
     * @return feUseCommentTemplate
     */
    public java.lang.Integer getFeUseCommentTemplate() {
        return feUseCommentTemplate;
    }


    /**
     * Sets the feUseCommentTemplate value for this DoFeedbackRequest.
     * 
     * @param feUseCommentTemplate
     */
    public void setFeUseCommentTemplate(java.lang.Integer feUseCommentTemplate) {
        this.feUseCommentTemplate = feUseCommentTemplate;
    }


    /**
     * Gets the feToUserId value for this DoFeedbackRequest.
     * 
     * @return feToUserId
     */
    public int getFeToUserId() {
        return feToUserId;
    }


    /**
     * Sets the feToUserId value for this DoFeedbackRequest.
     * 
     * @param feToUserId
     */
    public void setFeToUserId(int feToUserId) {
        this.feToUserId = feToUserId;
    }


    /**
     * Gets the feComment value for this DoFeedbackRequest.
     * 
     * @return feComment
     */
    public java.lang.String getFeComment() {
        return feComment;
    }


    /**
     * Sets the feComment value for this DoFeedbackRequest.
     * 
     * @param feComment
     */
    public void setFeComment(java.lang.String feComment) {
        this.feComment = feComment;
    }


    /**
     * Gets the feCommentType value for this DoFeedbackRequest.
     * 
     * @return feCommentType
     */
    public java.lang.String getFeCommentType() {
        return feCommentType;
    }


    /**
     * Sets the feCommentType value for this DoFeedbackRequest.
     * 
     * @param feCommentType
     */
    public void setFeCommentType(java.lang.String feCommentType) {
        this.feCommentType = feCommentType;
    }


    /**
     * Gets the feOp value for this DoFeedbackRequest.
     * 
     * @return feOp
     */
    public int getFeOp() {
        return feOp;
    }


    /**
     * Sets the feOp value for this DoFeedbackRequest.
     * 
     * @param feOp
     */
    public void setFeOp(int feOp) {
        this.feOp = feOp;
    }


    /**
     * Gets the feRating value for this DoFeedbackRequest.
     * 
     * @return feRating
     */
    public SandboxWebApi.SellRatingEstimationStruct[] getFeRating() {
        return feRating;
    }


    /**
     * Sets the feRating value for this DoFeedbackRequest.
     * 
     * @param feRating
     */
    public void setFeRating(SandboxWebApi.SellRatingEstimationStruct[] feRating) {
        this.feRating = feRating;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoFeedbackRequest)) return false;
        DoFeedbackRequest other = (DoFeedbackRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionHandle==null && other.getSessionHandle()==null) || 
             (this.sessionHandle!=null &&
              this.sessionHandle.equals(other.getSessionHandle()))) &&
            this.feItemId == other.getFeItemId() &&
            ((this.feUseCommentTemplate==null && other.getFeUseCommentTemplate()==null) || 
             (this.feUseCommentTemplate!=null &&
              this.feUseCommentTemplate.equals(other.getFeUseCommentTemplate()))) &&
            this.feToUserId == other.getFeToUserId() &&
            ((this.feComment==null && other.getFeComment()==null) || 
             (this.feComment!=null &&
              this.feComment.equals(other.getFeComment()))) &&
            ((this.feCommentType==null && other.getFeCommentType()==null) || 
             (this.feCommentType!=null &&
              this.feCommentType.equals(other.getFeCommentType()))) &&
            this.feOp == other.getFeOp() &&
            ((this.feRating==null && other.getFeRating()==null) || 
             (this.feRating!=null &&
              java.util.Arrays.equals(this.feRating, other.getFeRating())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSessionHandle() != null) {
            _hashCode += getSessionHandle().hashCode();
        }
        _hashCode += new Long(getFeItemId()).hashCode();
        if (getFeUseCommentTemplate() != null) {
            _hashCode += getFeUseCommentTemplate().hashCode();
        }
        _hashCode += getFeToUserId();
        if (getFeComment() != null) {
            _hashCode += getFeComment().hashCode();
        }
        if (getFeCommentType() != null) {
            _hashCode += getFeCommentType().hashCode();
        }
        _hashCode += getFeOp();
        if (getFeRating() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeRating());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeRating(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoFeedbackRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">DoFeedbackRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "feItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feUseCommentTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "feUseCommentTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feToUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "feToUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feComment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "feComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feCommentType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "feCommentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feOp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "feOp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feRating");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "feRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "SellRatingEstimationStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "item"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
