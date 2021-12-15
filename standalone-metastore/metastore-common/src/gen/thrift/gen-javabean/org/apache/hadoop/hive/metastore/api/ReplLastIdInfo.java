/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class ReplLastIdInfo implements org.apache.thrift.TBase<ReplLastIdInfo, ReplLastIdInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ReplLastIdInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ReplLastIdInfo");

  private static final org.apache.thrift.protocol.TField DATABASE_FIELD_DESC = new org.apache.thrift.protocol.TField("database", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField LAST_REPL_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("lastReplId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField TABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("table", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CATALOG_FIELD_DESC = new org.apache.thrift.protocol.TField("catalog", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField PARTITION_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("partitionList", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ReplLastIdInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ReplLastIdInfoTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String database; // required
  private long lastReplId; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String table; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String catalog; // optional
  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> partitionList; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DATABASE((short)1, "database"),
    LAST_REPL_ID((short)2, "lastReplId"),
    TABLE((short)3, "table"),
    CATALOG((short)4, "catalog"),
    PARTITION_LIST((short)5, "partitionList");

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
        case 1: // DATABASE
          return DATABASE;
        case 2: // LAST_REPL_ID
          return LAST_REPL_ID;
        case 3: // TABLE
          return TABLE;
        case 4: // CATALOG
          return CATALOG;
        case 5: // PARTITION_LIST
          return PARTITION_LIST;
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
  private static final int __LASTREPLID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TABLE,_Fields.CATALOG,_Fields.PARTITION_LIST};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DATABASE, new org.apache.thrift.meta_data.FieldMetaData("database", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LAST_REPL_ID, new org.apache.thrift.meta_data.FieldMetaData("lastReplId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TABLE, new org.apache.thrift.meta_data.FieldMetaData("table", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CATALOG, new org.apache.thrift.meta_data.FieldMetaData("catalog", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARTITION_LIST, new org.apache.thrift.meta_data.FieldMetaData("partitionList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ReplLastIdInfo.class, metaDataMap);
  }

  public ReplLastIdInfo() {
  }

  public ReplLastIdInfo(
    java.lang.String database,
    long lastReplId)
  {
    this();
    this.database = database;
    this.lastReplId = lastReplId;
    setLastReplIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReplLastIdInfo(ReplLastIdInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetDatabase()) {
      this.database = other.database;
    }
    this.lastReplId = other.lastReplId;
    if (other.isSetTable()) {
      this.table = other.table;
    }
    if (other.isSetCatalog()) {
      this.catalog = other.catalog;
    }
    if (other.isSetPartitionList()) {
      java.util.List<java.lang.String> __this__partitionList = new java.util.ArrayList<java.lang.String>(other.partitionList);
      this.partitionList = __this__partitionList;
    }
  }

  public ReplLastIdInfo deepCopy() {
    return new ReplLastIdInfo(this);
  }

  @Override
  public void clear() {
    this.database = null;
    setLastReplIdIsSet(false);
    this.lastReplId = 0;
    this.table = null;
    this.catalog = null;
    this.partitionList = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDatabase() {
    return this.database;
  }

  public void setDatabase(@org.apache.thrift.annotation.Nullable java.lang.String database) {
    this.database = database;
  }

  public void unsetDatabase() {
    this.database = null;
  }

  /** Returns true if field database is set (has been assigned a value) and false otherwise */
  public boolean isSetDatabase() {
    return this.database != null;
  }

  public void setDatabaseIsSet(boolean value) {
    if (!value) {
      this.database = null;
    }
  }

  public long getLastReplId() {
    return this.lastReplId;
  }

  public void setLastReplId(long lastReplId) {
    this.lastReplId = lastReplId;
    setLastReplIdIsSet(true);
  }

  public void unsetLastReplId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LASTREPLID_ISSET_ID);
  }

  /** Returns true if field lastReplId is set (has been assigned a value) and false otherwise */
  public boolean isSetLastReplId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LASTREPLID_ISSET_ID);
  }

  public void setLastReplIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LASTREPLID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTable() {
    return this.table;
  }

  public void setTable(@org.apache.thrift.annotation.Nullable java.lang.String table) {
    this.table = table;
  }

  public void unsetTable() {
    this.table = null;
  }

  /** Returns true if field table is set (has been assigned a value) and false otherwise */
  public boolean isSetTable() {
    return this.table != null;
  }

  public void setTableIsSet(boolean value) {
    if (!value) {
      this.table = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCatalog() {
    return this.catalog;
  }

  public void setCatalog(@org.apache.thrift.annotation.Nullable java.lang.String catalog) {
    this.catalog = catalog;
  }

  public void unsetCatalog() {
    this.catalog = null;
  }

  /** Returns true if field catalog is set (has been assigned a value) and false otherwise */
  public boolean isSetCatalog() {
    return this.catalog != null;
  }

  public void setCatalogIsSet(boolean value) {
    if (!value) {
      this.catalog = null;
    }
  }

  public int getPartitionListSize() {
    return (this.partitionList == null) ? 0 : this.partitionList.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getPartitionListIterator() {
    return (this.partitionList == null) ? null : this.partitionList.iterator();
  }

  public void addToPartitionList(java.lang.String elem) {
    if (this.partitionList == null) {
      this.partitionList = new java.util.ArrayList<java.lang.String>();
    }
    this.partitionList.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getPartitionList() {
    return this.partitionList;
  }

  public void setPartitionList(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> partitionList) {
    this.partitionList = partitionList;
  }

  public void unsetPartitionList() {
    this.partitionList = null;
  }

  /** Returns true if field partitionList is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionList() {
    return this.partitionList != null;
  }

  public void setPartitionListIsSet(boolean value) {
    if (!value) {
      this.partitionList = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case DATABASE:
      if (value == null) {
        unsetDatabase();
      } else {
        setDatabase((java.lang.String)value);
      }
      break;

    case LAST_REPL_ID:
      if (value == null) {
        unsetLastReplId();
      } else {
        setLastReplId((java.lang.Long)value);
      }
      break;

    case TABLE:
      if (value == null) {
        unsetTable();
      } else {
        setTable((java.lang.String)value);
      }
      break;

    case CATALOG:
      if (value == null) {
        unsetCatalog();
      } else {
        setCatalog((java.lang.String)value);
      }
      break;

    case PARTITION_LIST:
      if (value == null) {
        unsetPartitionList();
      } else {
        setPartitionList((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DATABASE:
      return getDatabase();

    case LAST_REPL_ID:
      return getLastReplId();

    case TABLE:
      return getTable();

    case CATALOG:
      return getCatalog();

    case PARTITION_LIST:
      return getPartitionList();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case DATABASE:
      return isSetDatabase();
    case LAST_REPL_ID:
      return isSetLastReplId();
    case TABLE:
      return isSetTable();
    case CATALOG:
      return isSetCatalog();
    case PARTITION_LIST:
      return isSetPartitionList();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof ReplLastIdInfo)
      return this.equals((ReplLastIdInfo)that);
    return false;
  }

  public boolean equals(ReplLastIdInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_database = true && this.isSetDatabase();
    boolean that_present_database = true && that.isSetDatabase();
    if (this_present_database || that_present_database) {
      if (!(this_present_database && that_present_database))
        return false;
      if (!this.database.equals(that.database))
        return false;
    }

    boolean this_present_lastReplId = true;
    boolean that_present_lastReplId = true;
    if (this_present_lastReplId || that_present_lastReplId) {
      if (!(this_present_lastReplId && that_present_lastReplId))
        return false;
      if (this.lastReplId != that.lastReplId)
        return false;
    }

    boolean this_present_table = true && this.isSetTable();
    boolean that_present_table = true && that.isSetTable();
    if (this_present_table || that_present_table) {
      if (!(this_present_table && that_present_table))
        return false;
      if (!this.table.equals(that.table))
        return false;
    }

    boolean this_present_catalog = true && this.isSetCatalog();
    boolean that_present_catalog = true && that.isSetCatalog();
    if (this_present_catalog || that_present_catalog) {
      if (!(this_present_catalog && that_present_catalog))
        return false;
      if (!this.catalog.equals(that.catalog))
        return false;
    }

    boolean this_present_partitionList = true && this.isSetPartitionList();
    boolean that_present_partitionList = true && that.isSetPartitionList();
    if (this_present_partitionList || that_present_partitionList) {
      if (!(this_present_partitionList && that_present_partitionList))
        return false;
      if (!this.partitionList.equals(that.partitionList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetDatabase()) ? 131071 : 524287);
    if (isSetDatabase())
      hashCode = hashCode * 8191 + database.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(lastReplId);

    hashCode = hashCode * 8191 + ((isSetTable()) ? 131071 : 524287);
    if (isSetTable())
      hashCode = hashCode * 8191 + table.hashCode();

    hashCode = hashCode * 8191 + ((isSetCatalog()) ? 131071 : 524287);
    if (isSetCatalog())
      hashCode = hashCode * 8191 + catalog.hashCode();

    hashCode = hashCode * 8191 + ((isSetPartitionList()) ? 131071 : 524287);
    if (isSetPartitionList())
      hashCode = hashCode * 8191 + partitionList.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ReplLastIdInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetDatabase(), other.isSetDatabase());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDatabase()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.database, other.database);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetLastReplId(), other.isSetLastReplId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastReplId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastReplId, other.lastReplId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTable(), other.isSetTable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table, other.table);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCatalog(), other.isSetCatalog());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCatalog()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.catalog, other.catalog);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPartitionList(), other.isSetPartitionList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partitionList, other.partitionList);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ReplLastIdInfo(");
    boolean first = true;

    sb.append("database:");
    if (this.database == null) {
      sb.append("null");
    } else {
      sb.append(this.database);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastReplId:");
    sb.append(this.lastReplId);
    first = false;
    if (isSetTable()) {
      if (!first) sb.append(", ");
      sb.append("table:");
      if (this.table == null) {
        sb.append("null");
      } else {
        sb.append(this.table);
      }
      first = false;
    }
    if (isSetCatalog()) {
      if (!first) sb.append(", ");
      sb.append("catalog:");
      if (this.catalog == null) {
        sb.append("null");
      } else {
        sb.append(this.catalog);
      }
      first = false;
    }
    if (isSetPartitionList()) {
      if (!first) sb.append(", ");
      sb.append("partitionList:");
      if (this.partitionList == null) {
        sb.append("null");
      } else {
        sb.append(this.partitionList);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetDatabase()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'database' is unset! Struct:" + toString());
    }

    if (!isSetLastReplId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'lastReplId' is unset! Struct:" + toString());
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

  private static class ReplLastIdInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ReplLastIdInfoStandardScheme getScheme() {
      return new ReplLastIdInfoStandardScheme();
    }
  }

  private static class ReplLastIdInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<ReplLastIdInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ReplLastIdInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DATABASE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.database = iprot.readString();
              struct.setDatabaseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LAST_REPL_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lastReplId = iprot.readI64();
              struct.setLastReplIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.table = iprot.readString();
              struct.setTableIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CATALOG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.catalog = iprot.readString();
              struct.setCatalogIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PARTITION_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list750 = iprot.readListBegin();
                struct.partitionList = new java.util.ArrayList<java.lang.String>(_list750.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem751;
                for (int _i752 = 0; _i752 < _list750.size; ++_i752)
                {
                  _elem751 = iprot.readString();
                  struct.partitionList.add(_elem751);
                }
                iprot.readListEnd();
              }
              struct.setPartitionListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ReplLastIdInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.database != null) {
        oprot.writeFieldBegin(DATABASE_FIELD_DESC);
        oprot.writeString(struct.database);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(LAST_REPL_ID_FIELD_DESC);
      oprot.writeI64(struct.lastReplId);
      oprot.writeFieldEnd();
      if (struct.table != null) {
        if (struct.isSetTable()) {
          oprot.writeFieldBegin(TABLE_FIELD_DESC);
          oprot.writeString(struct.table);
          oprot.writeFieldEnd();
        }
      }
      if (struct.catalog != null) {
        if (struct.isSetCatalog()) {
          oprot.writeFieldBegin(CATALOG_FIELD_DESC);
          oprot.writeString(struct.catalog);
          oprot.writeFieldEnd();
        }
      }
      if (struct.partitionList != null) {
        if (struct.isSetPartitionList()) {
          oprot.writeFieldBegin(PARTITION_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.partitionList.size()));
            for (java.lang.String _iter753 : struct.partitionList)
            {
              oprot.writeString(_iter753);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReplLastIdInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ReplLastIdInfoTupleScheme getScheme() {
      return new ReplLastIdInfoTupleScheme();
    }
  }

  private static class ReplLastIdInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<ReplLastIdInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ReplLastIdInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.database);
      oprot.writeI64(struct.lastReplId);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTable()) {
        optionals.set(0);
      }
      if (struct.isSetCatalog()) {
        optionals.set(1);
      }
      if (struct.isSetPartitionList()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTable()) {
        oprot.writeString(struct.table);
      }
      if (struct.isSetCatalog()) {
        oprot.writeString(struct.catalog);
      }
      if (struct.isSetPartitionList()) {
        {
          oprot.writeI32(struct.partitionList.size());
          for (java.lang.String _iter754 : struct.partitionList)
          {
            oprot.writeString(_iter754);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ReplLastIdInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.database = iprot.readString();
      struct.setDatabaseIsSet(true);
      struct.lastReplId = iprot.readI64();
      struct.setLastReplIdIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.table = iprot.readString();
        struct.setTableIsSet(true);
      }
      if (incoming.get(1)) {
        struct.catalog = iprot.readString();
        struct.setCatalogIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list755 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
          struct.partitionList = new java.util.ArrayList<java.lang.String>(_list755.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem756;
          for (int _i757 = 0; _i757 < _list755.size; ++_i757)
          {
            _elem756 = iprot.readString();
            struct.partitionList.add(_elem756);
          }
        }
        struct.setPartitionListIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

