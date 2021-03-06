/**
 * DoGetSpecialItemsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SandboxWebApi;

public class DoGetSpecialItemsResponse  implements java.io.Serializable {
    private SandboxWebApi.SpecialAuctionStruct[] sSpecialList;

    public DoGetSpecialItemsResponse() {
    }

    public DoGetSpecialItemsResponse(
           SandboxWebApi.SpecialAuctionStruct[] sSpecialList) {
           this.sSpecialList = sSpecialList;
    }


    /**
     * Gets the sSpecialList value for this DoGetSpecialItemsResponse.
     * 
     * @return sSpecialList
     */
    public SandboxWebApi.SpecialAuctionStruct[] getSSpecialList() {
        return sSpecialList;
    }


    /**
     * Sets the sSpecialList value for this DoGetSpecialItemsResponse.
     * 
     * @param sSpecialList
     */
    public void setSSpecialList(SandboxWebApi.SpecialAuctionStruct[] sSpecialList) {
        this.sSpecialList = sSpecialList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetSpecialItemsResponse)) return false;
        DoGetSpecialItemsResponse other = (DoGetSpecialItemsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sSpecialList==null && other.getSSpecialList()==null) || 
             (this.sSpecialList!=null &&
              java.util.Arrays.equals(this.sSpecialList, other.getSSpecialList())));
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
        if (getSSpecialList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSSpecialList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSSpecialList(), i);
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
        new org.apache.axis.description.TypeDesc(DoGetSpecialItemsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetSpecialItemsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSpecialList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "sSpecialList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "SpecialAuctionStruct"));
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
