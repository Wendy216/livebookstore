/**
 * Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.amazon.ws;

public class Request  implements java.io.Serializable {
    private java.lang.String isValid;

    private com.amazon.ws.HelpRequest helpRequest;

    private com.amazon.ws.BrowseNodeLookupRequest browseNodeLookupRequest;

    private com.amazon.ws.ItemSearchRequest itemSearchRequest;

    private com.amazon.ws.ItemLookupRequest itemLookupRequest;

    private com.amazon.ws.ListSearchRequest listSearchRequest;

    private com.amazon.ws.ListLookupRequest listLookupRequest;

    private com.amazon.ws.CustomerContentSearchRequest customerContentSearchRequest;

    private com.amazon.ws.CustomerContentLookupRequest customerContentLookupRequest;

    private com.amazon.ws.SimilarityLookupRequest similarityLookupRequest;

    private com.amazon.ws.CartGetRequest cartGetRequest;

    private com.amazon.ws.CartAddRequest cartAddRequest;

    private com.amazon.ws.CartCreateRequest cartCreateRequest;

    private com.amazon.ws.CartModifyRequest cartModifyRequest;

    private com.amazon.ws.CartClearRequest cartClearRequest;

    private com.amazon.ws.TransactionLookupRequest transactionLookupRequest;

    private com.amazon.ws.SellerListingSearchRequest sellerListingSearchRequest;

    private com.amazon.ws.SellerListingLookupRequest sellerListingLookupRequest;

    private com.amazon.ws.SellerLookupRequest sellerLookupRequest;

    private com.amazon.ws.ErrorsError[] errors;

    public Request() {
    }

    public Request(
           java.lang.String isValid,
           com.amazon.ws.HelpRequest helpRequest,
           com.amazon.ws.BrowseNodeLookupRequest browseNodeLookupRequest,
           com.amazon.ws.ItemSearchRequest itemSearchRequest,
           com.amazon.ws.ItemLookupRequest itemLookupRequest,
           com.amazon.ws.ListSearchRequest listSearchRequest,
           com.amazon.ws.ListLookupRequest listLookupRequest,
           com.amazon.ws.CustomerContentSearchRequest customerContentSearchRequest,
           com.amazon.ws.CustomerContentLookupRequest customerContentLookupRequest,
           com.amazon.ws.SimilarityLookupRequest similarityLookupRequest,
           com.amazon.ws.CartGetRequest cartGetRequest,
           com.amazon.ws.CartAddRequest cartAddRequest,
           com.amazon.ws.CartCreateRequest cartCreateRequest,
           com.amazon.ws.CartModifyRequest cartModifyRequest,
           com.amazon.ws.CartClearRequest cartClearRequest,
           com.amazon.ws.TransactionLookupRequest transactionLookupRequest,
           com.amazon.ws.SellerListingSearchRequest sellerListingSearchRequest,
           com.amazon.ws.SellerListingLookupRequest sellerListingLookupRequest,
           com.amazon.ws.SellerLookupRequest sellerLookupRequest,
           com.amazon.ws.ErrorsError[] errors) {
           this.isValid = isValid;
           this.helpRequest = helpRequest;
           this.browseNodeLookupRequest = browseNodeLookupRequest;
           this.itemSearchRequest = itemSearchRequest;
           this.itemLookupRequest = itemLookupRequest;
           this.listSearchRequest = listSearchRequest;
           this.listLookupRequest = listLookupRequest;
           this.customerContentSearchRequest = customerContentSearchRequest;
           this.customerContentLookupRequest = customerContentLookupRequest;
           this.similarityLookupRequest = similarityLookupRequest;
           this.cartGetRequest = cartGetRequest;
           this.cartAddRequest = cartAddRequest;
           this.cartCreateRequest = cartCreateRequest;
           this.cartModifyRequest = cartModifyRequest;
           this.cartClearRequest = cartClearRequest;
           this.transactionLookupRequest = transactionLookupRequest;
           this.sellerListingSearchRequest = sellerListingSearchRequest;
           this.sellerListingLookupRequest = sellerListingLookupRequest;
           this.sellerLookupRequest = sellerLookupRequest;
           this.errors = errors;
    }


    /**
     * Gets the isValid value for this Request.
     * 
     * @return isValid
     */
    public java.lang.String getIsValid() {
        return isValid;
    }


    /**
     * Sets the isValid value for this Request.
     * 
     * @param isValid
     */
    public void setIsValid(java.lang.String isValid) {
        this.isValid = isValid;
    }


    /**
     * Gets the helpRequest value for this Request.
     * 
     * @return helpRequest
     */
    public com.amazon.ws.HelpRequest getHelpRequest() {
        return helpRequest;
    }


    /**
     * Sets the helpRequest value for this Request.
     * 
     * @param helpRequest
     */
    public void setHelpRequest(com.amazon.ws.HelpRequest helpRequest) {
        this.helpRequest = helpRequest;
    }


    /**
     * Gets the browseNodeLookupRequest value for this Request.
     * 
     * @return browseNodeLookupRequest
     */
    public com.amazon.ws.BrowseNodeLookupRequest getBrowseNodeLookupRequest() {
        return browseNodeLookupRequest;
    }


    /**
     * Sets the browseNodeLookupRequest value for this Request.
     * 
     * @param browseNodeLookupRequest
     */
    public void setBrowseNodeLookupRequest(com.amazon.ws.BrowseNodeLookupRequest browseNodeLookupRequest) {
        this.browseNodeLookupRequest = browseNodeLookupRequest;
    }


    /**
     * Gets the itemSearchRequest value for this Request.
     * 
     * @return itemSearchRequest
     */
    public com.amazon.ws.ItemSearchRequest getItemSearchRequest() {
        return itemSearchRequest;
    }


    /**
     * Sets the itemSearchRequest value for this Request.
     * 
     * @param itemSearchRequest
     */
    public void setItemSearchRequest(com.amazon.ws.ItemSearchRequest itemSearchRequest) {
        this.itemSearchRequest = itemSearchRequest;
    }


    /**
     * Gets the itemLookupRequest value for this Request.
     * 
     * @return itemLookupRequest
     */
    public com.amazon.ws.ItemLookupRequest getItemLookupRequest() {
        return itemLookupRequest;
    }


    /**
     * Sets the itemLookupRequest value for this Request.
     * 
     * @param itemLookupRequest
     */
    public void setItemLookupRequest(com.amazon.ws.ItemLookupRequest itemLookupRequest) {
        this.itemLookupRequest = itemLookupRequest;
    }


    /**
     * Gets the listSearchRequest value for this Request.
     * 
     * @return listSearchRequest
     */
    public com.amazon.ws.ListSearchRequest getListSearchRequest() {
        return listSearchRequest;
    }


    /**
     * Sets the listSearchRequest value for this Request.
     * 
     * @param listSearchRequest
     */
    public void setListSearchRequest(com.amazon.ws.ListSearchRequest listSearchRequest) {
        this.listSearchRequest = listSearchRequest;
    }


    /**
     * Gets the listLookupRequest value for this Request.
     * 
     * @return listLookupRequest
     */
    public com.amazon.ws.ListLookupRequest getListLookupRequest() {
        return listLookupRequest;
    }


    /**
     * Sets the listLookupRequest value for this Request.
     * 
     * @param listLookupRequest
     */
    public void setListLookupRequest(com.amazon.ws.ListLookupRequest listLookupRequest) {
        this.listLookupRequest = listLookupRequest;
    }


    /**
     * Gets the customerContentSearchRequest value for this Request.
     * 
     * @return customerContentSearchRequest
     */
    public com.amazon.ws.CustomerContentSearchRequest getCustomerContentSearchRequest() {
        return customerContentSearchRequest;
    }


    /**
     * Sets the customerContentSearchRequest value for this Request.
     * 
     * @param customerContentSearchRequest
     */
    public void setCustomerContentSearchRequest(com.amazon.ws.CustomerContentSearchRequest customerContentSearchRequest) {
        this.customerContentSearchRequest = customerContentSearchRequest;
    }


    /**
     * Gets the customerContentLookupRequest value for this Request.
     * 
     * @return customerContentLookupRequest
     */
    public com.amazon.ws.CustomerContentLookupRequest getCustomerContentLookupRequest() {
        return customerContentLookupRequest;
    }


    /**
     * Sets the customerContentLookupRequest value for this Request.
     * 
     * @param customerContentLookupRequest
     */
    public void setCustomerContentLookupRequest(com.amazon.ws.CustomerContentLookupRequest customerContentLookupRequest) {
        this.customerContentLookupRequest = customerContentLookupRequest;
    }


    /**
     * Gets the similarityLookupRequest value for this Request.
     * 
     * @return similarityLookupRequest
     */
    public com.amazon.ws.SimilarityLookupRequest getSimilarityLookupRequest() {
        return similarityLookupRequest;
    }


    /**
     * Sets the similarityLookupRequest value for this Request.
     * 
     * @param similarityLookupRequest
     */
    public void setSimilarityLookupRequest(com.amazon.ws.SimilarityLookupRequest similarityLookupRequest) {
        this.similarityLookupRequest = similarityLookupRequest;
    }


    /**
     * Gets the cartGetRequest value for this Request.
     * 
     * @return cartGetRequest
     */
    public com.amazon.ws.CartGetRequest getCartGetRequest() {
        return cartGetRequest;
    }


    /**
     * Sets the cartGetRequest value for this Request.
     * 
     * @param cartGetRequest
     */
    public void setCartGetRequest(com.amazon.ws.CartGetRequest cartGetRequest) {
        this.cartGetRequest = cartGetRequest;
    }


    /**
     * Gets the cartAddRequest value for this Request.
     * 
     * @return cartAddRequest
     */
    public com.amazon.ws.CartAddRequest getCartAddRequest() {
        return cartAddRequest;
    }


    /**
     * Sets the cartAddRequest value for this Request.
     * 
     * @param cartAddRequest
     */
    public void setCartAddRequest(com.amazon.ws.CartAddRequest cartAddRequest) {
        this.cartAddRequest = cartAddRequest;
    }


    /**
     * Gets the cartCreateRequest value for this Request.
     * 
     * @return cartCreateRequest
     */
    public com.amazon.ws.CartCreateRequest getCartCreateRequest() {
        return cartCreateRequest;
    }


    /**
     * Sets the cartCreateRequest value for this Request.
     * 
     * @param cartCreateRequest
     */
    public void setCartCreateRequest(com.amazon.ws.CartCreateRequest cartCreateRequest) {
        this.cartCreateRequest = cartCreateRequest;
    }


    /**
     * Gets the cartModifyRequest value for this Request.
     * 
     * @return cartModifyRequest
     */
    public com.amazon.ws.CartModifyRequest getCartModifyRequest() {
        return cartModifyRequest;
    }


    /**
     * Sets the cartModifyRequest value for this Request.
     * 
     * @param cartModifyRequest
     */
    public void setCartModifyRequest(com.amazon.ws.CartModifyRequest cartModifyRequest) {
        this.cartModifyRequest = cartModifyRequest;
    }


    /**
     * Gets the cartClearRequest value for this Request.
     * 
     * @return cartClearRequest
     */
    public com.amazon.ws.CartClearRequest getCartClearRequest() {
        return cartClearRequest;
    }


    /**
     * Sets the cartClearRequest value for this Request.
     * 
     * @param cartClearRequest
     */
    public void setCartClearRequest(com.amazon.ws.CartClearRequest cartClearRequest) {
        this.cartClearRequest = cartClearRequest;
    }


    /**
     * Gets the transactionLookupRequest value for this Request.
     * 
     * @return transactionLookupRequest
     */
    public com.amazon.ws.TransactionLookupRequest getTransactionLookupRequest() {
        return transactionLookupRequest;
    }


    /**
     * Sets the transactionLookupRequest value for this Request.
     * 
     * @param transactionLookupRequest
     */
    public void setTransactionLookupRequest(com.amazon.ws.TransactionLookupRequest transactionLookupRequest) {
        this.transactionLookupRequest = transactionLookupRequest;
    }


    /**
     * Gets the sellerListingSearchRequest value for this Request.
     * 
     * @return sellerListingSearchRequest
     */
    public com.amazon.ws.SellerListingSearchRequest getSellerListingSearchRequest() {
        return sellerListingSearchRequest;
    }


    /**
     * Sets the sellerListingSearchRequest value for this Request.
     * 
     * @param sellerListingSearchRequest
     */
    public void setSellerListingSearchRequest(com.amazon.ws.SellerListingSearchRequest sellerListingSearchRequest) {
        this.sellerListingSearchRequest = sellerListingSearchRequest;
    }


    /**
     * Gets the sellerListingLookupRequest value for this Request.
     * 
     * @return sellerListingLookupRequest
     */
    public com.amazon.ws.SellerListingLookupRequest getSellerListingLookupRequest() {
        return sellerListingLookupRequest;
    }


    /**
     * Sets the sellerListingLookupRequest value for this Request.
     * 
     * @param sellerListingLookupRequest
     */
    public void setSellerListingLookupRequest(com.amazon.ws.SellerListingLookupRequest sellerListingLookupRequest) {
        this.sellerListingLookupRequest = sellerListingLookupRequest;
    }


    /**
     * Gets the sellerLookupRequest value for this Request.
     * 
     * @return sellerLookupRequest
     */
    public com.amazon.ws.SellerLookupRequest getSellerLookupRequest() {
        return sellerLookupRequest;
    }


    /**
     * Sets the sellerLookupRequest value for this Request.
     * 
     * @param sellerLookupRequest
     */
    public void setSellerLookupRequest(com.amazon.ws.SellerLookupRequest sellerLookupRequest) {
        this.sellerLookupRequest = sellerLookupRequest;
    }


    /**
     * Gets the errors value for this Request.
     * 
     * @return errors
     */
    public com.amazon.ws.ErrorsError[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this Request.
     * 
     * @param errors
     */
    public void setErrors(com.amazon.ws.ErrorsError[] errors) {
        this.errors = errors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Request)) return false;
        Request other = (Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isValid==null && other.getIsValid()==null) || 
             (this.isValid!=null &&
              this.isValid.equals(other.getIsValid()))) &&
            ((this.helpRequest==null && other.getHelpRequest()==null) || 
             (this.helpRequest!=null &&
              this.helpRequest.equals(other.getHelpRequest()))) &&
            ((this.browseNodeLookupRequest==null && other.getBrowseNodeLookupRequest()==null) || 
             (this.browseNodeLookupRequest!=null &&
              this.browseNodeLookupRequest.equals(other.getBrowseNodeLookupRequest()))) &&
            ((this.itemSearchRequest==null && other.getItemSearchRequest()==null) || 
             (this.itemSearchRequest!=null &&
              this.itemSearchRequest.equals(other.getItemSearchRequest()))) &&
            ((this.itemLookupRequest==null && other.getItemLookupRequest()==null) || 
             (this.itemLookupRequest!=null &&
              this.itemLookupRequest.equals(other.getItemLookupRequest()))) &&
            ((this.listSearchRequest==null && other.getListSearchRequest()==null) || 
             (this.listSearchRequest!=null &&
              this.listSearchRequest.equals(other.getListSearchRequest()))) &&
            ((this.listLookupRequest==null && other.getListLookupRequest()==null) || 
             (this.listLookupRequest!=null &&
              this.listLookupRequest.equals(other.getListLookupRequest()))) &&
            ((this.customerContentSearchRequest==null && other.getCustomerContentSearchRequest()==null) || 
             (this.customerContentSearchRequest!=null &&
              this.customerContentSearchRequest.equals(other.getCustomerContentSearchRequest()))) &&
            ((this.customerContentLookupRequest==null && other.getCustomerContentLookupRequest()==null) || 
             (this.customerContentLookupRequest!=null &&
              this.customerContentLookupRequest.equals(other.getCustomerContentLookupRequest()))) &&
            ((this.similarityLookupRequest==null && other.getSimilarityLookupRequest()==null) || 
             (this.similarityLookupRequest!=null &&
              this.similarityLookupRequest.equals(other.getSimilarityLookupRequest()))) &&
            ((this.cartGetRequest==null && other.getCartGetRequest()==null) || 
             (this.cartGetRequest!=null &&
              this.cartGetRequest.equals(other.getCartGetRequest()))) &&
            ((this.cartAddRequest==null && other.getCartAddRequest()==null) || 
             (this.cartAddRequest!=null &&
              this.cartAddRequest.equals(other.getCartAddRequest()))) &&
            ((this.cartCreateRequest==null && other.getCartCreateRequest()==null) || 
             (this.cartCreateRequest!=null &&
              this.cartCreateRequest.equals(other.getCartCreateRequest()))) &&
            ((this.cartModifyRequest==null && other.getCartModifyRequest()==null) || 
             (this.cartModifyRequest!=null &&
              this.cartModifyRequest.equals(other.getCartModifyRequest()))) &&
            ((this.cartClearRequest==null && other.getCartClearRequest()==null) || 
             (this.cartClearRequest!=null &&
              this.cartClearRequest.equals(other.getCartClearRequest()))) &&
            ((this.transactionLookupRequest==null && other.getTransactionLookupRequest()==null) || 
             (this.transactionLookupRequest!=null &&
              this.transactionLookupRequest.equals(other.getTransactionLookupRequest()))) &&
            ((this.sellerListingSearchRequest==null && other.getSellerListingSearchRequest()==null) || 
             (this.sellerListingSearchRequest!=null &&
              this.sellerListingSearchRequest.equals(other.getSellerListingSearchRequest()))) &&
            ((this.sellerListingLookupRequest==null && other.getSellerListingLookupRequest()==null) || 
             (this.sellerListingLookupRequest!=null &&
              this.sellerListingLookupRequest.equals(other.getSellerListingLookupRequest()))) &&
            ((this.sellerLookupRequest==null && other.getSellerLookupRequest()==null) || 
             (this.sellerLookupRequest!=null &&
              this.sellerLookupRequest.equals(other.getSellerLookupRequest()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors())));
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
        if (getIsValid() != null) {
            _hashCode += getIsValid().hashCode();
        }
        if (getHelpRequest() != null) {
            _hashCode += getHelpRequest().hashCode();
        }
        if (getBrowseNodeLookupRequest() != null) {
            _hashCode += getBrowseNodeLookupRequest().hashCode();
        }
        if (getItemSearchRequest() != null) {
            _hashCode += getItemSearchRequest().hashCode();
        }
        if (getItemLookupRequest() != null) {
            _hashCode += getItemLookupRequest().hashCode();
        }
        if (getListSearchRequest() != null) {
            _hashCode += getListSearchRequest().hashCode();
        }
        if (getListLookupRequest() != null) {
            _hashCode += getListLookupRequest().hashCode();
        }
        if (getCustomerContentSearchRequest() != null) {
            _hashCode += getCustomerContentSearchRequest().hashCode();
        }
        if (getCustomerContentLookupRequest() != null) {
            _hashCode += getCustomerContentLookupRequest().hashCode();
        }
        if (getSimilarityLookupRequest() != null) {
            _hashCode += getSimilarityLookupRequest().hashCode();
        }
        if (getCartGetRequest() != null) {
            _hashCode += getCartGetRequest().hashCode();
        }
        if (getCartAddRequest() != null) {
            _hashCode += getCartAddRequest().hashCode();
        }
        if (getCartCreateRequest() != null) {
            _hashCode += getCartCreateRequest().hashCode();
        }
        if (getCartModifyRequest() != null) {
            _hashCode += getCartModifyRequest().hashCode();
        }
        if (getCartClearRequest() != null) {
            _hashCode += getCartClearRequest().hashCode();
        }
        if (getTransactionLookupRequest() != null) {
            _hashCode += getTransactionLookupRequest().hashCode();
        }
        if (getSellerListingSearchRequest() != null) {
            _hashCode += getSellerListingSearchRequest().hashCode();
        }
        if (getSellerListingLookupRequest() != null) {
            _hashCode += getSellerListingLookupRequest().hashCode();
        }
        if (getSellerLookupRequest() != null) {
            _hashCode += getSellerLookupRequest().hashCode();
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
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
        new org.apache.axis.description.TypeDesc(Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">Request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isValid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "IsValid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helpRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "HelpRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "HelpRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browseNodeLookupRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "BrowseNodeLookupRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "BrowseNodeLookupRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSearchRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "ItemSearchRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "ItemSearchRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemLookupRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "ItemLookupRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "ItemLookupRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listSearchRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "ListSearchRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "ListSearchRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listLookupRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "ListLookupRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "ListLookupRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerContentSearchRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CustomerContentSearchRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CustomerContentSearchRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerContentLookupRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CustomerContentLookupRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CustomerContentLookupRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("similarityLookupRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "SimilarityLookupRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "SimilarityLookupRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartGetRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CartGetRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CartGetRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartAddRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CartAddRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CartAddRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartCreateRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CartCreateRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CartCreateRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartModifyRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CartModifyRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CartModifyRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartClearRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CartClearRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CartClearRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionLookupRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "TransactionLookupRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "TransactionLookupRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerListingSearchRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "SellerListingSearchRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "SellerListingSearchRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerListingLookupRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "SellerListingLookupRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "SellerListingLookupRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerLookupRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "SellerLookupRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "SellerLookupRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">Errors"));
        elemField.setMinOccurs(0);
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
