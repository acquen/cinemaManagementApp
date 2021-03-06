/**
 * DoGetSiteJournalInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SandboxWebApi;

public class DoGetSiteJournalInfoResponse  implements java.io.Serializable {
    private SandboxWebApi.SiteJournalInfo siteJournalInfo;

    public DoGetSiteJournalInfoResponse() {
    }

    public DoGetSiteJournalInfoResponse(
           SandboxWebApi.SiteJournalInfo siteJournalInfo) {
           this.siteJournalInfo = siteJournalInfo;
    }


    /**
     * Gets the siteJournalInfo value for this DoGetSiteJournalInfoResponse.
     * 
     * @return siteJournalInfo
     */
    public SandboxWebApi.SiteJournalInfo getSiteJournalInfo() {
        return siteJournalInfo;
    }


    /**
     * Sets the siteJournalInfo value for this DoGetSiteJournalInfoResponse.
     * 
     * @param siteJournalInfo
     */
    public void setSiteJournalInfo(SandboxWebApi.SiteJournalInfo siteJournalInfo) {
        this.siteJournalInfo = siteJournalInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetSiteJournalInfoResponse)) return false;
        DoGetSiteJournalInfoResponse other = (DoGetSiteJournalInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.siteJournalInfo==null && other.getSiteJournalInfo()==null) || 
             (this.siteJournalInfo!=null &&
              this.siteJournalInfo.equals(other.getSiteJournalInfo())));
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
        if (getSiteJournalInfo() != null) {
            _hashCode += getSiteJournalInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetSiteJournalInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSiteJournalInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteJournalInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "siteJournalInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "SiteJournalInfo"));
        elemField.setNillable(false);
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
