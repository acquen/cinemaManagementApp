/**
 * DoGetShipmentDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SandboxWebApi;

public class DoGetShipmentDataResponse  implements java.io.Serializable {
    private SandboxWebApi.ShipmentDataStruct[] shipmentDataList;

    private long localVersion;

    public DoGetShipmentDataResponse() {
    }

    public DoGetShipmentDataResponse(
           SandboxWebApi.ShipmentDataStruct[] shipmentDataList,
           long localVersion) {
           this.shipmentDataList = shipmentDataList;
           this.localVersion = localVersion;
    }


    /**
     * Gets the shipmentDataList value for this DoGetShipmentDataResponse.
     * 
     * @return shipmentDataList
     */
    public SandboxWebApi.ShipmentDataStruct[] getShipmentDataList() {
        return shipmentDataList;
    }


    /**
     * Sets the shipmentDataList value for this DoGetShipmentDataResponse.
     * 
     * @param shipmentDataList
     */
    public void setShipmentDataList(SandboxWebApi.ShipmentDataStruct[] shipmentDataList) {
        this.shipmentDataList = shipmentDataList;
    }


    /**
     * Gets the localVersion value for this DoGetShipmentDataResponse.
     * 
     * @return localVersion
     */
    public long getLocalVersion() {
        return localVersion;
    }


    /**
     * Sets the localVersion value for this DoGetShipmentDataResponse.
     * 
     * @param localVersion
     */
    public void setLocalVersion(long localVersion) {
        this.localVersion = localVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetShipmentDataResponse)) return false;
        DoGetShipmentDataResponse other = (DoGetShipmentDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shipmentDataList==null && other.getShipmentDataList()==null) || 
             (this.shipmentDataList!=null &&
              java.util.Arrays.equals(this.shipmentDataList, other.getShipmentDataList()))) &&
            this.localVersion == other.getLocalVersion();
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
        if (getShipmentDataList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipmentDataList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipmentDataList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getLocalVersion()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetShipmentDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", ">doGetShipmentDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentDataList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "shipmentDataList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:SandboxWebApi", "ShipmentDataStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:SandboxWebApi", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:SandboxWebApi", "localVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
