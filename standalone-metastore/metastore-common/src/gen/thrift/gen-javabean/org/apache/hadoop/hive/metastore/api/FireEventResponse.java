/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class FireEventResponse implements org.apache.thrift.TBase<FireEventResponse, FireEventResponse._Fields>, java.io.Serializable, Cloneable, Comparable<FireEventResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FireEventResponse");

  private static final org.apache.thrift.protocol.TField EVENT_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("eventIds", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new FireEventResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new FireEventResponseTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Long> eventIds; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EVENT_IDS((short)1, "eventIds");

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
        case 1: // EVENT_IDS
          return EVENT_IDS;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EVENT_IDS, new org.apache.thrift.meta_data.FieldMetaData("eventIds", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FireEventResponse.class, metaDataMap);
  }

  public FireEventResponse() {
  }

  public FireEventResponse(
    java.util.List<java.lang.Long> eventIds)
  {
    this();
    this.eventIds = eventIds;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FireEventResponse(FireEventResponse other) {
    if (other.isSetEventIds()) {
      java.util.List<java.lang.Long> __this__eventIds = new java.util.ArrayList<java.lang.Long>(other.eventIds);
      this.eventIds = __this__eventIds;
    }
  }

  public FireEventResponse deepCopy() {
    return new FireEventResponse(this);
  }

  @Override
  public void clear() {
    this.eventIds = null;
  }

  public int getEventIdsSize() {
    return (this.eventIds == null) ? 0 : this.eventIds.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Long> getEventIdsIterator() {
    return (this.eventIds == null) ? null : this.eventIds.iterator();
  }

  public void addToEventIds(long elem) {
    if (this.eventIds == null) {
      this.eventIds = new java.util.ArrayList<java.lang.Long>();
    }
    this.eventIds.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Long> getEventIds() {
    return this.eventIds;
  }

  public void setEventIds(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Long> eventIds) {
    this.eventIds = eventIds;
  }

  public void unsetEventIds() {
    this.eventIds = null;
  }

  /** Returns true if field eventIds is set (has been assigned a value) and false otherwise */
  public boolean isSetEventIds() {
    return this.eventIds != null;
  }

  public void setEventIdsIsSet(boolean value) {
    if (!value) {
      this.eventIds = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case EVENT_IDS:
      if (value == null) {
        unsetEventIds();
      } else {
        setEventIds((java.util.List<java.lang.Long>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case EVENT_IDS:
      return getEventIds();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case EVENT_IDS:
      return isSetEventIds();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof FireEventResponse)
      return this.equals((FireEventResponse)that);
    return false;
  }

  public boolean equals(FireEventResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_eventIds = true && this.isSetEventIds();
    boolean that_present_eventIds = true && that.isSetEventIds();
    if (this_present_eventIds || that_present_eventIds) {
      if (!(this_present_eventIds && that_present_eventIds))
        return false;
      if (!this.eventIds.equals(that.eventIds))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetEventIds()) ? 131071 : 524287);
    if (isSetEventIds())
      hashCode = hashCode * 8191 + eventIds.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(FireEventResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetEventIds(), other.isSetEventIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEventIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.eventIds, other.eventIds);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("FireEventResponse(");
    boolean first = true;

    sb.append("eventIds:");
    if (this.eventIds == null) {
      sb.append("null");
    } else {
      sb.append(this.eventIds);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FireEventResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public FireEventResponseStandardScheme getScheme() {
      return new FireEventResponseStandardScheme();
    }
  }

  private static class FireEventResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<FireEventResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FireEventResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EVENT_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list1042 = iprot.readListBegin();
                struct.eventIds = new java.util.ArrayList<java.lang.Long>(_list1042.size);
                long _elem1043;
                for (int _i1044 = 0; _i1044 < _list1042.size; ++_i1044)
                {
                  _elem1043 = iprot.readI64();
                  struct.eventIds.add(_elem1043);
                }
                iprot.readListEnd();
              }
              struct.setEventIdsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FireEventResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.eventIds != null) {
        oprot.writeFieldBegin(EVENT_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.eventIds.size()));
          for (long _iter1045 : struct.eventIds)
          {
            oprot.writeI64(_iter1045);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FireEventResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public FireEventResponseTupleScheme getScheme() {
      return new FireEventResponseTupleScheme();
    }
  }

  private static class FireEventResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<FireEventResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FireEventResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetEventIds()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetEventIds()) {
        {
          oprot.writeI32(struct.eventIds.size());
          for (long _iter1046 : struct.eventIds)
          {
            oprot.writeI64(_iter1046);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FireEventResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list1047 = iprot.readListBegin(org.apache.thrift.protocol.TType.I64);
          struct.eventIds = new java.util.ArrayList<java.lang.Long>(_list1047.size);
          long _elem1048;
          for (int _i1049 = 0; _i1049 < _list1047.size; ++_i1049)
          {
            _elem1048 = iprot.readI64();
            struct.eventIds.add(_elem1048);
          }
        }
        struct.setEventIdsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

