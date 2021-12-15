/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class GetPartitionRequest implements org.apache.thrift.TBase<GetPartitionRequest, GetPartitionRequest._Fields>, java.io.Serializable, Cloneable, Comparable<GetPartitionRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetPartitionRequest");

  private static final org.apache.thrift.protocol.TField CAT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("catName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TBL_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tblName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PART_VALS_FIELD_DESC = new org.apache.thrift.protocol.TField("partVals", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField VALID_WRITE_ID_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("validWriteIdList", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetPartitionRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetPartitionRequestTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String catName; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String dbName; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String tblName; // required
  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> partVals; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String validWriteIdList; // optional
  private long id; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CAT_NAME((short)1, "catName"),
    DB_NAME((short)2, "dbName"),
    TBL_NAME((short)3, "tblName"),
    PART_VALS((short)4, "partVals"),
    VALID_WRITE_ID_LIST((short)5, "validWriteIdList"),
    ID((short)6, "id");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CAT_NAME
          return CAT_NAME;
        case 2: // DB_NAME
          return DB_NAME;
        case 3: // TBL_NAME
          return TBL_NAME;
        case 4: // PART_VALS
          return PART_VALS;
        case 5: // VALID_WRITE_ID_LIST
          return VALID_WRITE_ID_LIST;
        case 6: // ID
          return ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CAT_NAME,_Fields.VALID_WRITE_ID_LIST,_Fields.ID};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CAT_NAME, new org.apache.thrift.meta_data.FieldMetaData("catName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DB_NAME, new org.apache.thrift.meta_data.FieldMetaData("dbName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TBL_NAME, new org.apache.thrift.meta_data.FieldMetaData("tblName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PART_VALS, new org.apache.thrift.meta_data.FieldMetaData("partVals", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.VALID_WRITE_ID_LIST, new org.apache.thrift.meta_data.FieldMetaData("validWriteIdList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetPartitionRequest.class, metaDataMap);
  }

  public GetPartitionRequest() {
    this.id = -1L;

  }

  public GetPartitionRequest(
    java.lang.String dbName,
    java.lang.String tblName,
    java.util.List<java.lang.String> partVals)
  {
    this();
    this.dbName = dbName;
    this.tblName = tblName;
    this.partVals = partVals;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetPartitionRequest(GetPartitionRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetCatName()) {
      this.catName = other.catName;
    }
    if (other.isSetDbName()) {
      this.dbName = other.dbName;
    }
    if (other.isSetTblName()) {
      this.tblName = other.tblName;
    }
    if (other.isSetPartVals()) {
      java.util.List<java.lang.String> __this__partVals = new java.util.ArrayList<java.lang.String>(other.partVals);
      this.partVals = __this__partVals;
    }
    if (other.isSetValidWriteIdList()) {
      this.validWriteIdList = other.validWriteIdList;
    }
    this.id = other.id;
  }

  public GetPartitionRequest deepCopy() {
    return new GetPartitionRequest(this);
  }

  @Override
  public void clear() {
    this.catName = null;
    this.dbName = null;
    this.tblName = null;
    this.partVals = null;
    this.validWriteIdList = null;
    this.id = -1L;

  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCatName() {
    return this.catName;
  }

  public void setCatName(@org.apache.thrift.annotation.Nullable java.lang.String catName) {
    this.catName = catName;
  }

  public void unsetCatName() {
    this.catName = null;
  }

  /** Returns true if field catName is set (has been assigned a value) and false otherwise */
  public boolean isSetCatName() {
    return this.catName != null;
  }

  public void setCatNameIsSet(boolean value) {
    if (!value) {
      this.catName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDbName() {
    return this.dbName;
  }

  public void setDbName(@org.apache.thrift.annotation.Nullable java.lang.String dbName) {
    this.dbName = dbName;
  }

  public void unsetDbName() {
    this.dbName = null;
  }

  /** Returns true if field dbName is set (has been assigned a value) and false otherwise */
  public boolean isSetDbName() {
    return this.dbName != null;
  }

  public void setDbNameIsSet(boolean value) {
    if (!value) {
      this.dbName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTblName() {
    return this.tblName;
  }

  public void setTblName(@org.apache.thrift.annotation.Nullable java.lang.String tblName) {
    this.tblName = tblName;
  }

  public void unsetTblName() {
    this.tblName = null;
  }

  /** Returns true if field tblName is set (has been assigned a value) and false otherwise */
  public boolean isSetTblName() {
    return this.tblName != null;
  }

  public void setTblNameIsSet(boolean value) {
    if (!value) {
      this.tblName = null;
    }
  }

  public int getPartValsSize() {
    return (this.partVals == null) ? 0 : this.partVals.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getPartValsIterator() {
    return (this.partVals == null) ? null : this.partVals.iterator();
  }

  public void addToPartVals(java.lang.String elem) {
    if (this.partVals == null) {
      this.partVals = new java.util.ArrayList<java.lang.String>();
    }
    this.partVals.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getPartVals() {
    return this.partVals;
  }

  public void setPartVals(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> partVals) {
    this.partVals = partVals;
  }

  public void unsetPartVals() {
    this.partVals = null;
  }

  /** Returns true if field partVals is set (has been assigned a value) and false otherwise */
  public boolean isSetPartVals() {
    return this.partVals != null;
  }

  public void setPartValsIsSet(boolean value) {
    if (!value) {
      this.partVals = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getValidWriteIdList() {
    return this.validWriteIdList;
  }

  public void setValidWriteIdList(@org.apache.thrift.annotation.Nullable java.lang.String validWriteIdList) {
    this.validWriteIdList = validWriteIdList;
  }

  public void unsetValidWriteIdList() {
    this.validWriteIdList = null;
  }

  /** Returns true if field validWriteIdList is set (has been assigned a value) and false otherwise */
  public boolean isSetValidWriteIdList() {
    return this.validWriteIdList != null;
  }

  public void setValidWriteIdListIsSet(boolean value) {
    if (!value) {
      this.validWriteIdList = null;
    }
  }

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
    setIdIsSet(true);
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CAT_NAME:
      if (value == null) {
        unsetCatName();
      } else {
        setCatName((java.lang.String)value);
      }
      break;

    case DB_NAME:
      if (value == null) {
        unsetDbName();
      } else {
        setDbName((java.lang.String)value);
      }
      break;

    case TBL_NAME:
      if (value == null) {
        unsetTblName();
      } else {
        setTblName((java.lang.String)value);
      }
      break;

    case PART_VALS:
      if (value == null) {
        unsetPartVals();
      } else {
        setPartVals((java.util.List<java.lang.String>)value);
      }
      break;

    case VALID_WRITE_ID_LIST:
      if (value == null) {
        unsetValidWriteIdList();
      } else {
        setValidWriteIdList((java.lang.String)value);
      }
      break;

    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CAT_NAME:
      return getCatName();

    case DB_NAME:
      return getDbName();

    case TBL_NAME:
      return getTblName();

    case PART_VALS:
      return getPartVals();

    case VALID_WRITE_ID_LIST:
      return getValidWriteIdList();

    case ID:
      return getId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CAT_NAME:
      return isSetCatName();
    case DB_NAME:
      return isSetDbName();
    case TBL_NAME:
      return isSetTblName();
    case PART_VALS:
      return isSetPartVals();
    case VALID_WRITE_ID_LIST:
      return isSetValidWriteIdList();
    case ID:
      return isSetId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof GetPartitionRequest)
      return this.equals((GetPartitionRequest)that);
    return false;
  }

  public boolean equals(GetPartitionRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_catName = true && this.isSetCatName();
    boolean that_present_catName = true && that.isSetCatName();
    if (this_present_catName || that_present_catName) {
      if (!(this_present_catName && that_present_catName))
        return false;
      if (!this.catName.equals(that.catName))
        return false;
    }

    boolean this_present_dbName = true && this.isSetDbName();
    boolean that_present_dbName = true && that.isSetDbName();
    if (this_present_dbName || that_present_dbName) {
      if (!(this_present_dbName && that_present_dbName))
        return false;
      if (!this.dbName.equals(that.dbName))
        return false;
    }

    boolean this_present_tblName = true && this.isSetTblName();
    boolean that_present_tblName = true && that.isSetTblName();
    if (this_present_tblName || that_present_tblName) {
      if (!(this_present_tblName && that_present_tblName))
        return false;
      if (!this.tblName.equals(that.tblName))
        return false;
    }

    boolean this_present_partVals = true && this.isSetPartVals();
    boolean that_present_partVals = true && that.isSetPartVals();
    if (this_present_partVals || that_present_partVals) {
      if (!(this_present_partVals && that_present_partVals))
        return false;
      if (!this.partVals.equals(that.partVals))
        return false;
    }

    boolean this_present_validWriteIdList = true && this.isSetValidWriteIdList();
    boolean that_present_validWriteIdList = true && that.isSetValidWriteIdList();
    if (this_present_validWriteIdList || that_present_validWriteIdList) {
      if (!(this_present_validWriteIdList && that_present_validWriteIdList))
        return false;
      if (!this.validWriteIdList.equals(that.validWriteIdList))
        return false;
    }

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCatName()) ? 131071 : 524287);
    if (isSetCatName())
      hashCode = hashCode * 8191 + catName.hashCode();

    hashCode = hashCode * 8191 + ((isSetDbName()) ? 131071 : 524287);
    if (isSetDbName())
      hashCode = hashCode * 8191 + dbName.hashCode();

    hashCode = hashCode * 8191 + ((isSetTblName()) ? 131071 : 524287);
    if (isSetTblName())
      hashCode = hashCode * 8191 + tblName.hashCode();

    hashCode = hashCode * 8191 + ((isSetPartVals()) ? 131071 : 524287);
    if (isSetPartVals())
      hashCode = hashCode * 8191 + partVals.hashCode();

    hashCode = hashCode * 8191 + ((isSetValidWriteIdList()) ? 131071 : 524287);
    if (isSetValidWriteIdList())
      hashCode = hashCode * 8191 + validWriteIdList.hashCode();

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(id);

    return hashCode;
  }

  @Override
  public int compareTo(GetPartitionRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetCatName(), other.isSetCatName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCatName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.catName, other.catName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDbName(), other.isSetDbName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbName, other.dbName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTblName(), other.isSetTblName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTblName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tblName, other.tblName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPartVals(), other.isSetPartVals());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartVals()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partVals, other.partVals);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetValidWriteIdList(), other.isSetValidWriteIdList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValidWriteIdList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.validWriteIdList, other.validWriteIdList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetId(), other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetPartitionRequest(");
    boolean first = true;

    if (isSetCatName()) {
      sb.append("catName:");
      if (this.catName == null) {
        sb.append("null");
      } else {
        sb.append(this.catName);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("dbName:");
    if (this.dbName == null) {
      sb.append("null");
    } else {
      sb.append(this.dbName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tblName:");
    if (this.tblName == null) {
      sb.append("null");
    } else {
      sb.append(this.tblName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("partVals:");
    if (this.partVals == null) {
      sb.append("null");
    } else {
      sb.append(this.partVals);
    }
    first = false;
    if (isSetValidWriteIdList()) {
      if (!first) sb.append(", ");
      sb.append("validWriteIdList:");
      if (this.validWriteIdList == null) {
        sb.append("null");
      } else {
        sb.append(this.validWriteIdList);
      }
      first = false;
    }
    if (isSetId()) {
      if (!first) sb.append(", ");
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetDbName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dbName' is unset! Struct:" + toString());
    }

    if (!isSetTblName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tblName' is unset! Struct:" + toString());
    }

    if (!isSetPartVals()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'partVals' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetPartitionRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetPartitionRequestStandardScheme getScheme() {
      return new GetPartitionRequestStandardScheme();
    }
  }

  private static class GetPartitionRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetPartitionRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetPartitionRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CAT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.catName = iprot.readString();
              struct.setCatNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DB_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbName = iprot.readString();
              struct.setDbNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TBL_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tblName = iprot.readString();
              struct.setTblNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PART_VALS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list1350 = iprot.readListBegin();
                struct.partVals = new java.util.ArrayList<java.lang.String>(_list1350.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem1351;
                for (int _i1352 = 0; _i1352 < _list1350.size; ++_i1352)
                {
                  _elem1351 = iprot.readString();
                  struct.partVals.add(_elem1351);
                }
                iprot.readListEnd();
              }
              struct.setPartValsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // VALID_WRITE_ID_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.validWriteIdList = iprot.readString();
              struct.setValidWriteIdListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.id = iprot.readI64();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetPartitionRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.catName != null) {
        if (struct.isSetCatName()) {
          oprot.writeFieldBegin(CAT_NAME_FIELD_DESC);
          oprot.writeString(struct.catName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.dbName != null) {
        oprot.writeFieldBegin(DB_NAME_FIELD_DESC);
        oprot.writeString(struct.dbName);
        oprot.writeFieldEnd();
      }
      if (struct.tblName != null) {
        oprot.writeFieldBegin(TBL_NAME_FIELD_DESC);
        oprot.writeString(struct.tblName);
        oprot.writeFieldEnd();
      }
      if (struct.partVals != null) {
        oprot.writeFieldBegin(PART_VALS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.partVals.size()));
          for (java.lang.String _iter1353 : struct.partVals)
          {
            oprot.writeString(_iter1353);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.validWriteIdList != null) {
        if (struct.isSetValidWriteIdList()) {
          oprot.writeFieldBegin(VALID_WRITE_ID_LIST_FIELD_DESC);
          oprot.writeString(struct.validWriteIdList);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI64(struct.id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetPartitionRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetPartitionRequestTupleScheme getScheme() {
      return new GetPartitionRequestTupleScheme();
    }
  }

  private static class GetPartitionRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetPartitionRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetPartitionRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.dbName);
      oprot.writeString(struct.tblName);
      {
        oprot.writeI32(struct.partVals.size());
        for (java.lang.String _iter1354 : struct.partVals)
        {
          oprot.writeString(_iter1354);
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCatName()) {
        optionals.set(0);
      }
      if (struct.isSetValidWriteIdList()) {
        optionals.set(1);
      }
      if (struct.isSetId()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetCatName()) {
        oprot.writeString(struct.catName);
      }
      if (struct.isSetValidWriteIdList()) {
        oprot.writeString(struct.validWriteIdList);
      }
      if (struct.isSetId()) {
        oprot.writeI64(struct.id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetPartitionRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.dbName = iprot.readString();
      struct.setDbNameIsSet(true);
      struct.tblName = iprot.readString();
      struct.setTblNameIsSet(true);
      {
        org.apache.thrift.protocol.TList _list1355 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
        struct.partVals = new java.util.ArrayList<java.lang.String>(_list1355.size);
        @org.apache.thrift.annotation.Nullable java.lang.String _elem1356;
        for (int _i1357 = 0; _i1357 < _list1355.size; ++_i1357)
        {
          _elem1356 = iprot.readString();
          struct.partVals.add(_elem1356);
        }
      }
      struct.setPartValsIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.catName = iprot.readString();
        struct.setCatNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.validWriteIdList = iprot.readString();
        struct.setValidWriteIdListIsSet(true);
      }
      if (incoming.get(2)) {
        struct.id = iprot.readI64();
        struct.setIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

