/**
 * CartClearResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.amazon.ws;

public class CartClearResponse  implements java.io.Serializable {
    private com.amazon.ws.OperationRequest operationRequest;

    private com.amazon.ws.Cart[] cart;

    public CartClearResponse() {
    }

    public CartClearResponse(
           com.amazon.ws.OperationRequest operationRequest,
           com.amazon.ws.Cart[] cart) {
           this.operationRequest = operationRequest;
           this.cart = cart;
    }


    /**
     * Gets the operationRequest value for this CartClearResponse.
     * 
     * @return operationRequest
     */
    public com.amazon.ws.OperationRequest getOperationRequest() {
        return operationRequest;
    }


    /**
     * Sets the operationRequest value for this CartClearResponse.
     * 
     * @param operationRequest
     */
    public void setOperationRequest(com.amazon.ws.OperationRequest operationRequest) {
        this.operationRequest = operationRequest;
    }


    /**
     * Gets the cart value for this CartClearResponse.
     * 
     * @return cart
     */
    public com.amazon.ws.Cart[] getCart() {
        return cart;
    }


    /**
     * Sets the cart value for this CartClearResponse.
     * 
     * @param cart
     */
    public void setCart(com.amazon.ws.Cart[] cart) {
        this.cart = cart;
    }

    public com.amazon.ws.Cart getCart(int i) {
        return this.cart[i];
    }

    public void setCart(int i, com.amazon.ws.Cart _value) {
        this.cart[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CartClearResponse)) return false;
        CartClearResponse other = (CartClearResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operationRequest==null && other.getOperationRequest()==null) || 
             (this.operationRequest!=null &&
              this.operationRequest.equals(other.getOperationRequest()))) &&
            ((this.cart==null && other.getCart()==null) || 
             (this.cart!=null &&
              java.util.Arrays.equals(this.cart, other.getCart())));
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
        if (getOperationRequest() != null) {
            _hashCode += getOperationRequest().hashCode();
        }
        if (getCart() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCart());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCart(), i);
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
        new org.apache.axis.description.TypeDesc(CartClearResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">CartClearResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "OperationRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">OperationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Cart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Cart"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
