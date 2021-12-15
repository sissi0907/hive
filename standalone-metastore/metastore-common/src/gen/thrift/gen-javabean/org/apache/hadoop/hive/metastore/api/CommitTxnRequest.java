/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class CommitTxnRequest implements org.apache.thrift.TBase<CommitTxnRequest, CommitTxnRequest._Fields>, java.io.Serializable, Cloneable, Comparable<CommitTxnRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CommitTxnRequest");

  private static final org.apache.thrift.protocol.TField TXNID_FIELD_DESC = new org.apache.thrift.protocol.TField("txnid", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField REPL_POLICY_FIELD_DESC = new org.apache.thrift.protocol.TField("replPolicy", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField WRITE_EVENT_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("writeEventInfos", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField REPL_LAST_ID_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("replLastIdInfo", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField KEY_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("keyValue", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField EXCL_WRITE_ENABLED_FIELD_DESC = new org.apache.thrift.protocol.TField("exclWriteEnabled", org.apache.thrift.protocol.TType.BOOL, (short)6);
  private static final org.apache.thrift.protocol.TField TXN_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("txn_type", org.apache.thrift.protocol.TType.I32, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CommitTxnRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CommitTxnRequestTupleSchemeFactory();

  private long txnid; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String replPolicy; // optional
  private @org.apache.thrift.annotation.Nullable java.util.List<WriteEventInfo> writeEventInfos; // optional
  private @org.apache.thrift.annotation.Nullable ReplLastIdInfo replLastIdInfo; // optional
  private @org.apache.thrift.annotation.Nullable CommitTxnKeyValue keyValue; // optional
  private boolean exclWriteEnabled; // optional
  private @org.apache.thrift.annotation.Nullable TxnType txn_type; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TXNID((short)1, "txnid"),
    REPL_POLICY((short)2, "replPolicy"),
    WRITE_EVENT_INFOS((short)3, "writeEventInfos"),
    REPL_LAST_ID_INFO((short)4, "replLastIdInfo"),
    KEY_VALUE((short)5, "keyValue"),
    EXCL_WRITE_ENABLED((short)6, "exclWriteEnabled"),
    /**
     * 
     * @see TxnType
     */
    TXN_TYPE((short)7, "txn_type");

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
        case 1: // TXNID
          return TXNID;
        case 2: // REPL_POLICY
          return REPL_POLICY;
        case 3: // WRITE_EVENT_INFOS
          return WRITE_EVENT_INFOS;
        case 4: // REPL_LAST_ID_INFO
          return REPL_LAST_ID_INFO;
        case 5: // KEY_VALUE
          return KEY_VALUE;
        case 6: // EXCL_WRITE_ENABLED
          return EXCL_WRITE_ENABLED;
        case 7: // TXN_TYPE
          return TXN_TYPE;
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
  private static final int __TXNID_ISSET_ID = 0;
  private static final int __EXCLWRITEENABLED_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.REPL_POLICY,_Fields.WRITE_EVENT_INFOS,_Fields.REPL_LAST_ID_INFO,_Fields.KEY_VALUE,_Fields.EXCL_WRITE_ENABLED,_Fields.TXN_TYPE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TXNID, new org.apache.thrift.meta_data.FieldMetaData("txnid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.REPL_POLICY, new org.apache.thrift.meta_data.FieldMetaData("replPolicy", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WRITE_EVENT_INFOS, new org.apache.thrift.meta_data.FieldMetaData("writeEventInfos", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, WriteEventInfo.class))));
    tmpMap.put(_Fields.REPL_LAST_ID_INFO, new org.apache.thrift.meta_data.FieldMetaData("replLastIdInfo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ReplLastIdInfo.class)));
    tmpMap.put(_Fields.KEY_VALUE, new org.apache.thrift.meta_data.FieldMetaData("keyValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, CommitTxnKeyValue.class)));
    tmpMap.put(_Fields.EXCL_WRITE_ENABLED, new org.apache.thrift.meta_data.FieldMetaData("exclWriteEnabled", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.TXN_TYPE, new org.apache.thrift.meta_data.FieldMetaData("txn_type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TxnType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CommitTxnRequest.class, metaDataMap);
  }

  public CommitTxnRequest() {
    this.exclWriteEnabled = true;

  }

  public CommitTxnRequest(
    long txnid)
  {
    this();
    this.txnid = txnid;
    setTxnidIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CommitTxnRequest(CommitTxnRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.txnid = other.txnid;
    if (other.isSetReplPolicy()) {
      this.replPolicy = other.replPolicy;
    }
    if (other.isSetWriteEventInfos()) {
      java.util.List<WriteEventInfo> __this__writeEventInfos = new java.util.ArrayList<WriteEventInfo>(other.writeEventInfos.size());
      for (WriteEventInfo other_element : other.writeEventInfos) {
        __this__writeEventInfos.add(new WriteEventInfo(other_element));
      }
      this.writeEventInfos = __this__writeEventInfos;
    }
    if (other.isSetReplLastIdInfo()) {
      this.replLastIdInfo = new ReplLastIdInfo(other.replLastIdInfo);
    }
    if (other.isSetKeyValue()) {
      this.keyValue = new CommitTxnKeyValue(other.keyValue);
    }
    this.exclWriteEnabled = other.exclWriteEnabled;
    if (other.isSetTxn_type()) {
      this.txn_type = other.txn_type;
    }
  }

  public CommitTxnRequest deepCopy() {
    return new CommitTxnRequest(this);
  }

  @Override
  public void clear() {
    setTxnidIsSet(false);
    this.txnid = 0;
    this.replPolicy = null;
    this.writeEventInfos = null;
    this.replLastIdInfo = null;
    this.keyValue = null;
    this.exclWriteEnabled = true;

    this.txn_type = null;
  }

  public long getTxnid() {
    return this.txnid;
  }

  public void setTxnid(long txnid) {
    this.txnid = txnid;
    setTxnidIsSet(true);
  }

  public void unsetTxnid() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TXNID_ISSET_ID);
  }

  /** Returns true if field txnid is set (has been assigned a value) and false otherwise */
  public boolean isSetTxnid() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TXNID_ISSET_ID);
  }

  public void setTxnidIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TXNID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getReplPolicy() {
    return this.replPolicy;
  }

  public void setReplPolicy(@org.apache.thrift.annotation.Nullable java.lang.String replPolicy) {
    this.replPolicy = replPolicy;
  }

  public void unsetReplPolicy() {
    this.replPolicy = null;
  }

  /** Returns true if field replPolicy is set (has been assigned a value) and false otherwise */
  public boolean isSetReplPolicy() {
    return this.replPolicy != null;
  }

  public void setReplPolicyIsSet(boolean value) {
    if (!value) {
      this.replPolicy = null;
    }
  }

  public int getWriteEventInfosSize() {
    return (this.writeEventInfos == null) ? 0 : this.writeEventInfos.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<WriteEventInfo> getWriteEventInfosIterator() {
    return (this.writeEventInfos == null) ? null : this.writeEventInfos.iterator();
  }

  public void addToWriteEventInfos(WriteEventInfo elem) {
    if (this.writeEventInfos == null) {
      this.writeEventInfos = new java.util.ArrayList<WriteEventInfo>();
    }
    this.writeEventInfos.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<WriteEventInfo> getWriteEventInfos() {
    return this.writeEventInfos;
  }

  public void setWriteEventInfos(@org.apache.thrift.annotation.Nullable java.util.List<WriteEventInfo> writeEventInfos) {
    this.writeEventInfos = writeEventInfos;
  }

  public void unsetWriteEventInfos() {
    this.writeEventInfos = null;
  }

  /** Returns true if field writeEventInfos is set (has been assigned a value) and false otherwise */
  public boolean isSetWriteEventInfos() {
    return this.writeEventInfos != null;
  }

  public void setWriteEventInfosIsSet(boolean value) {
    if (!value) {
      this.writeEventInfos = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public ReplLastIdInfo getReplLastIdInfo() {
    return this.replLastIdInfo;
  }

  public void setReplLastIdInfo(@org.apache.thrift.annotation.Nullable ReplLastIdInfo replLastIdInfo) {
    this.replLastIdInfo = replLastIdInfo;
  }

  public void unsetReplLastIdInfo() {
    this.replLastIdInfo = null;
  }

  /** Returns true if field replLastIdInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetReplLastIdInfo() {
    return this.replLastIdInfo != null;
  }

  public void setReplLastIdInfoIsSet(boolean value) {
    if (!value) {
      this.replLastIdInfo = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public CommitTxnKeyValue getKeyValue() {
    return this.keyValue;
  }

  public void setKeyValue(@org.apache.thrift.annotation.Nullable CommitTxnKeyValue keyValue) {
    this.keyValue = keyValue;
  }

  public void unsetKeyValue() {
    this.keyValue = null;
  }

  /** Returns true if field keyValue is set (has been assigned a value) and false otherwise */
  public boolean isSetKeyValue() {
    return this.keyValue != null;
  }

  public void setKeyValueIsSet(boolean value) {
    if (!value) {
      this.keyValue = null;
    }
  }

  public boolean isExclWriteEnabled() {
    return this.exclWriteEnabled;
  }

  public void setExclWriteEnabled(boolean exclWriteEnabled) {
    this.exclWriteEnabled = exclWriteEnabled;
    setExclWriteEnabledIsSet(true);
  }

  public void unsetExclWriteEnabled() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __EXCLWRITEENABLED_ISSET_ID);
  }

  /** Returns true if field exclWriteEnabled is set (has been assigned a value) and false otherwise */
  public boolean isSetExclWriteEnabled() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __EXCLWRITEENABLED_ISSET_ID);
  }

  public void setExclWriteEnabledIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __EXCLWRITEENABLED_ISSET_ID, value);
  }

  /**
   * 
   * @see TxnType
   */
  @org.apache.thrift.annotation.Nullable
  public TxnType getTxn_type() {
    return this.txn_type;
  }

  /**
   * 
   * @see TxnType
   */
  public void setTxn_type(@org.apache.thrift.annotation.Nullable TxnType txn_type) {
    this.txn_type = txn_type;
  }

  public void unsetTxn_type() {
    this.txn_type = null;
  }

  /** Returns true if field txn_type is set (has been assigned a value) and false otherwise */
  public boolean isSetTxn_type() {
    return this.txn_type != null;
  }

  public void setTxn_typeIsSet(boolean value) {
    if (!value) {
      this.txn_type = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TXNID:
      if (value == null) {
        unsetTxnid();
      } else {
        setTxnid((java.lang.Long)value);
      }
      break;

    case REPL_POLICY:
      if (value == null) {
        unsetReplPolicy();
      } else {
        setReplPolicy((java.lang.String)value);
      }
      break;

    case WRITE_EVENT_INFOS:
      if (value == null) {
        unsetWriteEventInfos();
      } else {
        setWriteEventInfos((java.util.List<WriteEventInfo>)value);
      }
      break;

    case REPL_LAST_ID_INFO:
      if (value == null) {
        unsetReplLastIdInfo();
      } else {
        setReplLastIdInfo((ReplLastIdInfo)value);
      }
      break;

    case KEY_VALUE:
      if (value == null) {
        unsetKeyValue();
      } else {
        setKeyValue((CommitTxnKeyValue)value);
      }
      break;

    case EXCL_WRITE_ENABLED:
      if (value == null) {
        unsetExclWriteEnabled();
      } else {
        setExclWriteEnabled((java.lang.Boolean)value);
      }
      break;

    case TXN_TYPE:
      if (value == null) {
        unsetTxn_type();
      } else {
        setTxn_type((TxnType)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TXNID:
      return getTxnid();

    case REPL_POLICY:
      return getReplPolicy();

    case WRITE_EVENT_INFOS:
      return getWriteEventInfos();

    case REPL_LAST_ID_INFO:
      return getReplLastIdInfo();

    case KEY_VALUE:
      return getKeyValue();

    case EXCL_WRITE_ENABLED:
      return isExclWriteEnabled();

    case TXN_TYPE:
      return getTxn_type();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TXNID:
      return isSetTxnid();
    case REPL_POLICY:
      return isSetReplPolicy();
    case WRITE_EVENT_INFOS:
      return isSetWriteEventInfos();
    case REPL_LAST_ID_INFO:
      return isSetReplLastIdInfo();
    case KEY_VALUE:
      return isSetKeyValue();
    case EXCL_WRITE_ENABLED:
      return isSetExclWriteEnabled();
    case TXN_TYPE:
      return isSetTxn_type();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof CommitTxnRequest)
      return this.equals((CommitTxnRequest)that);
    return false;
  }

  public boolean equals(CommitTxnRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_txnid = true;
    boolean that_present_txnid = true;
    if (this_present_txnid || that_present_txnid) {
      if (!(this_present_txnid && that_present_txnid))
        return false;
      if (this.txnid != that.txnid)
        return false;
    }

    boolean this_present_replPolicy = true && this.isSetReplPolicy();
    boolean that_present_replPolicy = true && that.isSetReplPolicy();
    if (this_present_replPolicy || that_present_replPolicy) {
      if (!(this_present_replPolicy && that_present_replPolicy))
        return false;
      if (!this.replPolicy.equals(that.replPolicy))
        return false;
    }

    boolean this_present_writeEventInfos = true && this.isSetWriteEventInfos();
    boolean that_present_writeEventInfos = true && that.isSetWriteEventInfos();
    if (this_present_writeEventInfos || that_present_writeEventInfos) {
      if (!(this_present_writeEventInfos && that_present_writeEventInfos))
        return false;
      if (!this.writeEventInfos.equals(that.writeEventInfos))
        return false;
    }

    boolean this_present_replLastIdInfo = true && this.isSetReplLastIdInfo();
    boolean that_present_replLastIdInfo = true && that.isSetReplLastIdInfo();
    if (this_present_replLastIdInfo || that_present_replLastIdInfo) {
      if (!(this_present_replLastIdInfo && that_present_replLastIdInfo))
        return false;
      if (!this.replLastIdInfo.equals(that.replLastIdInfo))
        return false;
    }

    boolean this_present_keyValue = true && this.isSetKeyValue();
    boolean that_present_keyValue = true && that.isSetKeyValue();
    if (this_present_keyValue || that_present_keyValue) {
      if (!(this_present_keyValue && that_present_keyValue))
        return false;
      if (!this.keyValue.equals(that.keyValue))
        return false;
    }

    boolean this_present_exclWriteEnabled = true && this.isSetExclWriteEnabled();
    boolean that_present_exclWriteEnabled = true && that.isSetExclWriteEnabled();
    if (this_present_exclWriteEnabled || that_present_exclWriteEnabled) {
      if (!(this_present_exclWriteEnabled && that_present_exclWriteEnabled))
        return false;
      if (this.exclWriteEnabled != that.exclWriteEnabled)
        return false;
    }

    boolean this_present_txn_type = true && this.isSetTxn_type();
    boolean that_present_txn_type = true && that.isSetTxn_type();
    if (this_present_txn_type || that_present_txn_type) {
      if (!(this_present_txn_type && that_present_txn_type))
        return false;
      if (!this.txn_type.equals(that.txn_type))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(txnid);

    hashCode = hashCode * 8191 + ((isSetReplPolicy()) ? 131071 : 524287);
    if (isSetReplPolicy())
      hashCode = hashCode * 8191 + replPolicy.hashCode();

    hashCode = hashCode * 8191 + ((isSetWriteEventInfos()) ? 131071 : 524287);
    if (isSetWriteEventInfos())
      hashCode = hashCode * 8191 + writeEventInfos.hashCode();

    hashCode = hashCode * 8191 + ((isSetReplLastIdInfo()) ? 131071 : 524287);
    if (isSetReplLastIdInfo())
      hashCode = hashCode * 8191 + replLastIdInfo.hashCode();

    hashCode = hashCode * 8191 + ((isSetKeyValue()) ? 131071 : 524287);
    if (isSetKeyValue())
      hashCode = hashCode * 8191 + keyValue.hashCode();

    hashCode = hashCode * 8191 + ((isSetExclWriteEnabled()) ? 131071 : 524287);
    if (isSetExclWriteEnabled())
      hashCode = hashCode * 8191 + ((exclWriteEnabled) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetTxn_type()) ? 131071 : 524287);
    if (isSetTxn_type())
      hashCode = hashCode * 8191 + txn_type.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(CommitTxnRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTxnid(), other.isSetTxnid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxnid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.txnid, other.txnid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetReplPolicy(), other.isSetReplPolicy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReplPolicy()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.replPolicy, other.replPolicy);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetWriteEventInfos(), other.isSetWriteEventInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWriteEventInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.writeEventInfos, other.writeEventInfos);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetReplLastIdInfo(), other.isSetReplLastIdInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReplLastIdInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.replLastIdInfo, other.replLastIdInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetKeyValue(), other.isSetKeyValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeyValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.keyValue, other.keyValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetExclWriteEnabled(), other.isSetExclWriteEnabled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExclWriteEnabled()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exclWriteEnabled, other.exclWriteEnabled);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTxn_type(), other.isSetTxn_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxn_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.txn_type, other.txn_type);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("CommitTxnRequest(");
    boolean first = true;

    sb.append("txnid:");
    sb.append(this.txnid);
    first = false;
    if (isSetReplPolicy()) {
      if (!first) sb.append(", ");
      sb.append("replPolicy:");
      if (this.replPolicy == null) {
        sb.append("null");
      } else {
        sb.append(this.replPolicy);
      }
      first = false;
    }
    if (isSetWriteEventInfos()) {
      if (!first) sb.append(", ");
      sb.append("writeEventInfos:");
      if (this.writeEventInfos == null) {
        sb.append("null");
      } else {
        sb.append(this.writeEventInfos);
      }
      first = false;
    }
    if (isSetReplLastIdInfo()) {
      if (!first) sb.append(", ");
      sb.append("replLastIdInfo:");
      if (this.replLastIdInfo == null) {
        sb.append("null");
      } else {
        sb.append(this.replLastIdInfo);
      }
      first = false;
    }
    if (isSetKeyValue()) {
      if (!first) sb.append(", ");
      sb.append("keyValue:");
      if (this.keyValue == null) {
        sb.append("null");
      } else {
        sb.append(this.keyValue);
      }
      first = false;
    }
    if (isSetExclWriteEnabled()) {
      if (!first) sb.append(", ");
      sb.append("exclWriteEnabled:");
      sb.append(this.exclWriteEnabled);
      first = false;
    }
    if (isSetTxn_type()) {
      if (!first) sb.append(", ");
      sb.append("txn_type:");
      if (this.txn_type == null) {
        sb.append("null");
      } else {
        sb.append(this.txn_type);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTxnid()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'txnid' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (replLastIdInfo != null) {
      replLastIdInfo.validate();
    }
    if (keyValue != null) {
      keyValue.validate();
    }
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

  private static class CommitTxnRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CommitTxnRequestStandardScheme getScheme() {
      return new CommitTxnRequestStandardScheme();
    }
  }

  private static class CommitTxnRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<CommitTxnRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CommitTxnRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TXNID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.txnid = iprot.readI64();
              struct.setTxnidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REPL_POLICY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.replPolicy = iprot.readString();
              struct.setReplPolicyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // WRITE_EVENT_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list758 = iprot.readListBegin();
                struct.writeEventInfos = new java.util.ArrayList<WriteEventInfo>(_list758.size);
                @org.apache.thrift.annotation.Nullable WriteEventInfo _elem759;
                for (int _i760 = 0; _i760 < _list758.size; ++_i760)
                {
                  _elem759 = new WriteEventInfo();
                  _elem759.read(iprot);
                  struct.writeEventInfos.add(_elem759);
                }
                iprot.readListEnd();
              }
              struct.setWriteEventInfosIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // REPL_LAST_ID_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.replLastIdInfo = new ReplLastIdInfo();
              struct.replLastIdInfo.read(iprot);
              struct.setReplLastIdInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // KEY_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.keyValue = new CommitTxnKeyValue();
              struct.keyValue.read(iprot);
              struct.setKeyValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // EXCL_WRITE_ENABLED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.exclWriteEnabled = iprot.readBool();
              struct.setExclWriteEnabledIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // TXN_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.txn_type = org.apache.hadoop.hive.metastore.api.TxnType.findByValue(iprot.readI32());
              struct.setTxn_typeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CommitTxnRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TXNID_FIELD_DESC);
      oprot.writeI64(struct.txnid);
      oprot.writeFieldEnd();
      if (struct.replPolicy != null) {
        if (struct.isSetReplPolicy()) {
          oprot.writeFieldBegin(REPL_POLICY_FIELD_DESC);
          oprot.writeString(struct.replPolicy);
          oprot.writeFieldEnd();
        }
      }
      if (struct.writeEventInfos != null) {
        if (struct.isSetWriteEventInfos()) {
          oprot.writeFieldBegin(WRITE_EVENT_INFOS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.writeEventInfos.size()));
            for (WriteEventInfo _iter761 : struct.writeEventInfos)
            {
              _iter761.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.replLastIdInfo != null) {
        if (struct.isSetReplLastIdInfo()) {
          oprot.writeFieldBegin(REPL_LAST_ID_INFO_FIELD_DESC);
          struct.replLastIdInfo.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.keyValue != null) {
        if (struct.isSetKeyValue()) {
          oprot.writeFieldBegin(KEY_VALUE_FIELD_DESC);
          struct.keyValue.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetExclWriteEnabled()) {
        oprot.writeFieldBegin(EXCL_WRITE_ENABLED_FIELD_DESC);
        oprot.writeBool(struct.exclWriteEnabled);
        oprot.writeFieldEnd();
      }
      if (struct.txn_type != null) {
        if (struct.isSetTxn_type()) {
          oprot.writeFieldBegin(TXN_TYPE_FIELD_DESC);
          oprot.writeI32(struct.txn_type.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CommitTxnRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CommitTxnRequestTupleScheme getScheme() {
      return new CommitTxnRequestTupleScheme();
    }
  }

  private static class CommitTxnRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<CommitTxnRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CommitTxnRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.txnid);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetReplPolicy()) {
        optionals.set(0);
      }
      if (struct.isSetWriteEventInfos()) {
        optionals.set(1);
      }
      if (struct.isSetReplLastIdInfo()) {
        optionals.set(2);
      }
      if (struct.isSetKeyValue()) {
        optionals.set(3);
      }
      if (struct.isSetExclWriteEnabled()) {
        optionals.set(4);
      }
      if (struct.isSetTxn_type()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetReplPolicy()) {
        oprot.writeString(struct.replPolicy);
      }
      if (struct.isSetWriteEventInfos()) {
        {
          oprot.writeI32(struct.writeEventInfos.size());
          for (WriteEventInfo _iter762 : struct.writeEventInfos)
          {
            _iter762.write(oprot);
          }
        }
      }
      if (struct.isSetReplLastIdInfo()) {
        struct.replLastIdInfo.write(oprot);
      }
      if (struct.isSetKeyValue()) {
        struct.keyValue.write(oprot);
      }
      if (struct.isSetExclWriteEnabled()) {
        oprot.writeBool(struct.exclWriteEnabled);
      }
      if (struct.isSetTxn_type()) {
        oprot.writeI32(struct.txn_type.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CommitTxnRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.txnid = iprot.readI64();
      struct.setTxnidIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.replPolicy = iprot.readString();
        struct.setReplPolicyIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list763 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.writeEventInfos = new java.util.ArrayList<WriteEventInfo>(_list763.size);
          @org.apache.thrift.annotation.Nullable WriteEventInfo _elem764;
          for (int _i765 = 0; _i765 < _list763.size; ++_i765)
          {
            _elem764 = new WriteEventInfo();
            _elem764.read(iprot);
            struct.writeEventInfos.add(_elem764);
          }
        }
        struct.setWriteEventInfosIsSet(true);
      }
      if (incoming.get(2)) {
        struct.replLastIdInfo = new ReplLastIdInfo();
        struct.replLastIdInfo.read(iprot);
        struct.setReplLastIdInfoIsSet(true);
      }
      if (incoming.get(3)) {
        struct.keyValue = new CommitTxnKeyValue();
        struct.keyValue.read(iprot);
        struct.setKeyValueIsSet(true);
      }
      if (incoming.get(4)) {
        struct.exclWriteEnabled = iprot.readBool();
        struct.setExclWriteEnabledIsSet(true);
      }
      if (incoming.get(5)) {
        struct.txn_type = org.apache.hadoop.hive.metastore.api.TxnType.findByValue(iprot.readI32());
        struct.setTxn_typeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

