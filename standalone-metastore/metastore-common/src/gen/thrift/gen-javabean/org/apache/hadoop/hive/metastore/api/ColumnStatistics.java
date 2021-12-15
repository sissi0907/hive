/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class ColumnStatistics implements org.apache.thrift.TBase<ColumnStatistics, ColumnStatistics._Fields>, java.io.Serializable, Cloneable, Comparable<ColumnStatistics> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ColumnStatistics");

  private static final org.apache.thrift.protocol.TField STATS_DESC_FIELD_DESC = new org.apache.thrift.protocol.TField("statsDesc", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField STATS_OBJ_FIELD_DESC = new org.apache.thrift.protocol.TField("statsObj", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField IS_STATS_COMPLIANT_FIELD_DESC = new org.apache.thrift.protocol.TField("isStatsCompliant", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField ENGINE_FIELD_DESC = new org.apache.thrift.protocol.TField("engine", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ColumnStatisticsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ColumnStatisticsTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable ColumnStatisticsDesc statsDesc; // required
  private @org.apache.thrift.annotation.Nullable java.util.List<ColumnStatisticsObj> statsObj; // required
  private boolean isStatsCompliant; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String engine; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATS_DESC((short)1, "statsDesc"),
    STATS_OBJ((short)2, "statsObj"),
    IS_STATS_COMPLIANT((short)3, "isStatsCompliant"),
    ENGINE((short)4, "engine");

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
        case 1: // STATS_DESC
          return STATS_DESC;
        case 2: // STATS_OBJ
          return STATS_OBJ;
        case 3: // IS_STATS_COMPLIANT
          return IS_STATS_COMPLIANT;
        case 4: // ENGINE
          return ENGINE;
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
  private static final int __ISSTATSCOMPLIANT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.IS_STATS_COMPLIANT,_Fields.ENGINE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATS_DESC, new org.apache.thrift.meta_data.FieldMetaData("statsDesc", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ColumnStatisticsDesc.class)));
    tmpMap.put(_Fields.STATS_OBJ, new org.apache.thrift.meta_data.FieldMetaData("statsObj", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ColumnStatisticsObj.class))));
    tmpMap.put(_Fields.IS_STATS_COMPLIANT, new org.apache.thrift.meta_data.FieldMetaData("isStatsCompliant", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ENGINE, new org.apache.thrift.meta_data.FieldMetaData("engine", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ColumnStatistics.class, metaDataMap);
  }

  public ColumnStatistics() {
  }

  public ColumnStatistics(
    ColumnStatisticsDesc statsDesc,
    java.util.List<ColumnStatisticsObj> statsObj)
  {
    this();
    this.statsDesc = statsDesc;
    this.statsObj = statsObj;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ColumnStatistics(ColumnStatistics other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatsDesc()) {
      this.statsDesc = new ColumnStatisticsDesc(other.statsDesc);
    }
    if (other.isSetStatsObj()) {
      java.util.List<ColumnStatisticsObj> __this__statsObj = new java.util.ArrayList<ColumnStatisticsObj>(other.statsObj.size());
      for (ColumnStatisticsObj other_element : other.statsObj) {
        __this__statsObj.add(new ColumnStatisticsObj(other_element));
      }
      this.statsObj = __this__statsObj;
    }
    this.isStatsCompliant = other.isStatsCompliant;
    if (other.isSetEngine()) {
      this.engine = other.engine;
    }
  }

  public ColumnStatistics deepCopy() {
    return new ColumnStatistics(this);
  }

  @Override
  public void clear() {
    this.statsDesc = null;
    this.statsObj = null;
    setIsStatsCompliantIsSet(false);
    this.isStatsCompliant = false;
    this.engine = null;
  }

  @org.apache.thrift.annotation.Nullable
  public ColumnStatisticsDesc getStatsDesc() {
    return this.statsDesc;
  }

  public void setStatsDesc(@org.apache.thrift.annotation.Nullable ColumnStatisticsDesc statsDesc) {
    this.statsDesc = statsDesc;
  }

  public void unsetStatsDesc() {
    this.statsDesc = null;
  }

  /** Returns true if field statsDesc is set (has been assigned a value) and false otherwise */
  public boolean isSetStatsDesc() {
    return this.statsDesc != null;
  }

  public void setStatsDescIsSet(boolean value) {
    if (!value) {
      this.statsDesc = null;
    }
  }

  public int getStatsObjSize() {
    return (this.statsObj == null) ? 0 : this.statsObj.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<ColumnStatisticsObj> getStatsObjIterator() {
    return (this.statsObj == null) ? null : this.statsObj.iterator();
  }

  public void addToStatsObj(ColumnStatisticsObj elem) {
    if (this.statsObj == null) {
      this.statsObj = new java.util.ArrayList<ColumnStatisticsObj>();
    }
    this.statsObj.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<ColumnStatisticsObj> getStatsObj() {
    return this.statsObj;
  }

  public void setStatsObj(@org.apache.thrift.annotation.Nullable java.util.List<ColumnStatisticsObj> statsObj) {
    this.statsObj = statsObj;
  }

  public void unsetStatsObj() {
    this.statsObj = null;
  }

  /** Returns true if field statsObj is set (has been assigned a value) and false otherwise */
  public boolean isSetStatsObj() {
    return this.statsObj != null;
  }

  public void setStatsObjIsSet(boolean value) {
    if (!value) {
      this.statsObj = null;
    }
  }

  public boolean isIsStatsCompliant() {
    return this.isStatsCompliant;
  }

  public void setIsStatsCompliant(boolean isStatsCompliant) {
    this.isStatsCompliant = isStatsCompliant;
    setIsStatsCompliantIsSet(true);
  }

  public void unsetIsStatsCompliant() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISSTATSCOMPLIANT_ISSET_ID);
  }

  /** Returns true if field isStatsCompliant is set (has been assigned a value) and false otherwise */
  public boolean isSetIsStatsCompliant() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISSTATSCOMPLIANT_ISSET_ID);
  }

  public void setIsStatsCompliantIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISSTATSCOMPLIANT_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getEngine() {
    return this.engine;
  }

  public void setEngine(@org.apache.thrift.annotation.Nullable java.lang.String engine) {
    this.engine = engine;
  }

  public void unsetEngine() {
    this.engine = null;
  }

  /** Returns true if field engine is set (has been assigned a value) and false otherwise */
  public boolean isSetEngine() {
    return this.engine != null;
  }

  public void setEngineIsSet(boolean value) {
    if (!value) {
      this.engine = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case STATS_DESC:
      if (value == null) {
        unsetStatsDesc();
      } else {
        setStatsDesc((ColumnStatisticsDesc)value);
      }
      break;

    case STATS_OBJ:
      if (value == null) {
        unsetStatsObj();
      } else {
        setStatsObj((java.util.List<ColumnStatisticsObj>)value);
      }
      break;

    case IS_STATS_COMPLIANT:
      if (value == null) {
        unsetIsStatsCompliant();
      } else {
        setIsStatsCompliant((java.lang.Boolean)value);
      }
      break;

    case ENGINE:
      if (value == null) {
        unsetEngine();
      } else {
        setEngine((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATS_DESC:
      return getStatsDesc();

    case STATS_OBJ:
      return getStatsObj();

    case IS_STATS_COMPLIANT:
      return isIsStatsCompliant();

    case ENGINE:
      return getEngine();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STATS_DESC:
      return isSetStatsDesc();
    case STATS_OBJ:
      return isSetStatsObj();
    case IS_STATS_COMPLIANT:
      return isSetIsStatsCompliant();
    case ENGINE:
      return isSetEngine();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof ColumnStatistics)
      return this.equals((ColumnStatistics)that);
    return false;
  }

  public boolean equals(ColumnStatistics that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_statsDesc = true && this.isSetStatsDesc();
    boolean that_present_statsDesc = true && that.isSetStatsDesc();
    if (this_present_statsDesc || that_present_statsDesc) {
      if (!(this_present_statsDesc && that_present_statsDesc))
        return false;
      if (!this.statsDesc.equals(that.statsDesc))
        return false;
    }

    boolean this_present_statsObj = true && this.isSetStatsObj();
    boolean that_present_statsObj = true && that.isSetStatsObj();
    if (this_present_statsObj || that_present_statsObj) {
      if (!(this_present_statsObj && that_present_statsObj))
        return false;
      if (!this.statsObj.equals(that.statsObj))
        return false;
    }

    boolean this_present_isStatsCompliant = true && this.isSetIsStatsCompliant();
    boolean that_present_isStatsCompliant = true && that.isSetIsStatsCompliant();
    if (this_present_isStatsCompliant || that_present_isStatsCompliant) {
      if (!(this_present_isStatsCompliant && that_present_isStatsCompliant))
        return false;
      if (this.isStatsCompliant != that.isStatsCompliant)
        return false;
    }

    boolean this_present_engine = true && this.isSetEngine();
    boolean that_present_engine = true && that.isSetEngine();
    if (this_present_engine || that_present_engine) {
      if (!(this_present_engine && that_present_engine))
        return false;
      if (!this.engine.equals(that.engine))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStatsDesc()) ? 131071 : 524287);
    if (isSetStatsDesc())
      hashCode = hashCode * 8191 + statsDesc.hashCode();

    hashCode = hashCode * 8191 + ((isSetStatsObj()) ? 131071 : 524287);
    if (isSetStatsObj())
      hashCode = hashCode * 8191 + statsObj.hashCode();

    hashCode = hashCode * 8191 + ((isSetIsStatsCompliant()) ? 131071 : 524287);
    if (isSetIsStatsCompliant())
      hashCode = hashCode * 8191 + ((isStatsCompliant) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetEngine()) ? 131071 : 524287);
    if (isSetEngine())
      hashCode = hashCode * 8191 + engine.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ColumnStatistics other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetStatsDesc(), other.isSetStatsDesc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatsDesc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.statsDesc, other.statsDesc);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetStatsObj(), other.isSetStatsObj());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatsObj()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.statsObj, other.statsObj);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIsStatsCompliant(), other.isSetIsStatsCompliant());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsStatsCompliant()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isStatsCompliant, other.isStatsCompliant);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEngine(), other.isSetEngine());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEngine()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.engine, other.engine);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ColumnStatistics(");
    boolean first = true;

    sb.append("statsDesc:");
    if (this.statsDesc == null) {
      sb.append("null");
    } else {
      sb.append(this.statsDesc);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("statsObj:");
    if (this.statsObj == null) {
      sb.append("null");
    } else {
      sb.append(this.statsObj);
    }
    first = false;
    if (isSetIsStatsCompliant()) {
      if (!first) sb.append(", ");
      sb.append("isStatsCompliant:");
      sb.append(this.isStatsCompliant);
      first = false;
    }
    if (isSetEngine()) {
      if (!first) sb.append(", ");
      sb.append("engine:");
      if (this.engine == null) {
        sb.append("null");
      } else {
        sb.append(this.engine);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetStatsDesc()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'statsDesc' is unset! Struct:" + toString());
    }

    if (!isSetStatsObj()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'statsObj' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (statsDesc != null) {
      statsDesc.validate();
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

  private static class ColumnStatisticsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ColumnStatisticsStandardScheme getScheme() {
      return new ColumnStatisticsStandardScheme();
    }
  }

  private static class ColumnStatisticsStandardScheme extends org.apache.thrift.scheme.StandardScheme<ColumnStatistics> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ColumnStatistics struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATS_DESC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.statsDesc = new ColumnStatisticsDesc();
              struct.statsDesc.read(iprot);
              struct.setStatsDescIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STATS_OBJ
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list280 = iprot.readListBegin();
                struct.statsObj = new java.util.ArrayList<ColumnStatisticsObj>(_list280.size);
                @org.apache.thrift.annotation.Nullable ColumnStatisticsObj _elem281;
                for (int _i282 = 0; _i282 < _list280.size; ++_i282)
                {
                  _elem281 = new ColumnStatisticsObj();
                  _elem281.read(iprot);
                  struct.statsObj.add(_elem281);
                }
                iprot.readListEnd();
              }
              struct.setStatsObjIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IS_STATS_COMPLIANT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isStatsCompliant = iprot.readBool();
              struct.setIsStatsCompliantIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ENGINE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.engine = iprot.readString();
              struct.setEngineIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ColumnStatistics struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.statsDesc != null) {
        oprot.writeFieldBegin(STATS_DESC_FIELD_DESC);
        struct.statsDesc.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.statsObj != null) {
        oprot.writeFieldBegin(STATS_OBJ_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.statsObj.size()));
          for (ColumnStatisticsObj _iter283 : struct.statsObj)
          {
            _iter283.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.isSetIsStatsCompliant()) {
        oprot.writeFieldBegin(IS_STATS_COMPLIANT_FIELD_DESC);
        oprot.writeBool(struct.isStatsCompliant);
        oprot.writeFieldEnd();
      }
      if (struct.engine != null) {
        if (struct.isSetEngine()) {
          oprot.writeFieldBegin(ENGINE_FIELD_DESC);
          oprot.writeString(struct.engine);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ColumnStatisticsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ColumnStatisticsTupleScheme getScheme() {
      return new ColumnStatisticsTupleScheme();
    }
  }

  private static class ColumnStatisticsTupleScheme extends org.apache.thrift.scheme.TupleScheme<ColumnStatistics> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ColumnStatistics struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.statsDesc.write(oprot);
      {
        oprot.writeI32(struct.statsObj.size());
        for (ColumnStatisticsObj _iter284 : struct.statsObj)
        {
          _iter284.write(oprot);
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetIsStatsCompliant()) {
        optionals.set(0);
      }
      if (struct.isSetEngine()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetIsStatsCompliant()) {
        oprot.writeBool(struct.isStatsCompliant);
      }
      if (struct.isSetEngine()) {
        oprot.writeString(struct.engine);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ColumnStatistics struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.statsDesc = new ColumnStatisticsDesc();
      struct.statsDesc.read(iprot);
      struct.setStatsDescIsSet(true);
      {
        org.apache.thrift.protocol.TList _list285 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
        struct.statsObj = new java.util.ArrayList<ColumnStatisticsObj>(_list285.size);
        @org.apache.thrift.annotation.Nullable ColumnStatisticsObj _elem286;
        for (int _i287 = 0; _i287 < _list285.size; ++_i287)
        {
          _elem286 = new ColumnStatisticsObj();
          _elem286.read(iprot);
          struct.statsObj.add(_elem286);
        }
      }
      struct.setStatsObjIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.isStatsCompliant = iprot.readBool();
        struct.setIsStatsCompliantIsSet(true);
      }
      if (incoming.get(1)) {
        struct.engine = iprot.readString();
        struct.setEngineIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

