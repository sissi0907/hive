/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class NotificationEventRequest implements org.apache.thrift.TBase<NotificationEventRequest, NotificationEventRequest._Fields>, java.io.Serializable, Cloneable, Comparable<NotificationEventRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NotificationEventRequest");

  private static final org.apache.thrift.protocol.TField LAST_EVENT_FIELD_DESC = new org.apache.thrift.protocol.TField("lastEvent", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField MAX_EVENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("maxEvents", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField EVENT_TYPE_SKIP_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("eventTypeSkipList", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new NotificationEventRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new NotificationEventRequestTupleSchemeFactory();

  private long lastEvent; // required
  private int maxEvents; // optional
  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> eventTypeSkipList; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LAST_EVENT((short)1, "lastEvent"),
    MAX_EVENTS((short)2, "maxEvents"),
    EVENT_TYPE_SKIP_LIST((short)3, "eventTypeSkipList");

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
        case 1: // LAST_EVENT
          return LAST_EVENT;
        case 2: // MAX_EVENTS
          return MAX_EVENTS;
        case 3: // EVENT_TYPE_SKIP_LIST
          return EVENT_TYPE_SKIP_LIST;
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
  private static final int __LASTEVENT_ISSET_ID = 0;
  private static final int __MAXEVENTS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.MAX_EVENTS,_Fields.EVENT_TYPE_SKIP_LIST};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LAST_EVENT, new org.apache.thrift.meta_data.FieldMetaData("lastEvent", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.MAX_EVENTS, new org.apache.thrift.meta_data.FieldMetaData("maxEvents", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.EVENT_TYPE_SKIP_LIST, new org.apache.thrift.meta_data.FieldMetaData("eventTypeSkipList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NotificationEventRequest.class, metaDataMap);
  }

  public NotificationEventRequest() {
  }

  public NotificationEventRequest(
    long lastEvent)
  {
    this();
    this.lastEvent = lastEvent;
    setLastEventIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NotificationEventRequest(NotificationEventRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.lastEvent = other.lastEvent;
    this.maxEvents = other.maxEvents;
    if (other.isSetEventTypeSkipList()) {
      java.util.List<java.lang.String> __this__eventTypeSkipList = new java.util.ArrayList<java.lang.String>(other.eventTypeSkipList);
      this.eventTypeSkipList = __this__eventTypeSkipList;
    }
  }

  public NotificationEventRequest deepCopy() {
    return new NotificationEventRequest(this);
  }

  @Override
  public void clear() {
    setLastEventIsSet(false);
    this.lastEvent = 0;
    setMaxEventsIsSet(false);
    this.maxEvents = 0;
    this.eventTypeSkipList = null;
  }

  public long getLastEvent() {
    return this.lastEvent;
  }

  public void setLastEvent(long lastEvent) {
    this.lastEvent = lastEvent;
    setLastEventIsSet(true);
  }

  public void unsetLastEvent() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LASTEVENT_ISSET_ID);
  }

  /** Returns true if field lastEvent is set (has been assigned a value) and false otherwise */
  public boolean isSetLastEvent() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LASTEVENT_ISSET_ID);
  }

  public void setLastEventIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LASTEVENT_ISSET_ID, value);
  }

  public int getMaxEvents() {
    return this.maxEvents;
  }

  public void setMaxEvents(int maxEvents) {
    this.maxEvents = maxEvents;
    setMaxEventsIsSet(true);
  }

  public void unsetMaxEvents() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MAXEVENTS_ISSET_ID);
  }

  /** Returns true if field maxEvents is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxEvents() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MAXEVENTS_ISSET_ID);
  }

  public void setMaxEventsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MAXEVENTS_ISSET_ID, value);
  }

  public int getEventTypeSkipListSize() {
    return (this.eventTypeSkipList == null) ? 0 : this.eventTypeSkipList.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getEventTypeSkipListIterator() {
    return (this.eventTypeSkipList == null) ? null : this.eventTypeSkipList.iterator();
  }

  public void addToEventTypeSkipList(java.lang.String elem) {
    if (this.eventTypeSkipList == null) {
      this.eventTypeSkipList = new java.util.ArrayList<java.lang.String>();
    }
    this.eventTypeSkipList.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getEventTypeSkipList() {
    return this.eventTypeSkipList;
  }

  public void setEventTypeSkipList(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> eventTypeSkipList) {
    this.eventTypeSkipList = eventTypeSkipList;
  }

  public void unsetEventTypeSkipList() {
    this.eventTypeSkipList = null;
  }

  /** Returns true if field eventTypeSkipList is set (has been assigned a value) and false otherwise */
  public boolean isSetEventTypeSkipList() {
    return this.eventTypeSkipList != null;
  }

  public void setEventTypeSkipListIsSet(boolean value) {
    if (!value) {
      this.eventTypeSkipList = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case LAST_EVENT:
      if (value == null) {
        unsetLastEvent();
      } else {
        setLastEvent((java.lang.Long)value);
      }
      break;

    case MAX_EVENTS:
      if (value == null) {
        unsetMaxEvents();
      } else {
        setMaxEvents((java.lang.Integer)value);
      }
      break;

    case EVENT_TYPE_SKIP_LIST:
      if (value == null) {
        unsetEventTypeSkipList();
      } else {
        setEventTypeSkipList((java.util.List<java.lang.String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case LAST_EVENT:
      return getLastEvent();

    case MAX_EVENTS:
      return getMaxEvents();

    case EVENT_TYPE_SKIP_LIST:
      return getEventTypeSkipList();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case LAST_EVENT:
      return isSetLastEvent();
    case MAX_EVENTS:
      return isSetMaxEvents();
    case EVENT_TYPE_SKIP_LIST:
      return isSetEventTypeSkipList();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof NotificationEventRequest)
      return this.equals((NotificationEventRequest)that);
    return false;
  }

  public boolean equals(NotificationEventRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_lastEvent = true;
    boolean that_present_lastEvent = true;
    if (this_present_lastEvent || that_present_lastEvent) {
      if (!(this_present_lastEvent && that_present_lastEvent))
        return false;
      if (this.lastEvent != that.lastEvent)
        return false;
    }

    boolean this_present_maxEvents = true && this.isSetMaxEvents();
    boolean that_present_maxEvents = true && that.isSetMaxEvents();
    if (this_present_maxEvents || that_present_maxEvents) {
      if (!(this_present_maxEvents && that_present_maxEvents))
        return false;
      if (this.maxEvents != that.maxEvents)
        return false;
    }

    boolean this_present_eventTypeSkipList = true && this.isSetEventTypeSkipList();
    boolean that_present_eventTypeSkipList = true && that.isSetEventTypeSkipList();
    if (this_present_eventTypeSkipList || that_present_eventTypeSkipList) {
      if (!(this_present_eventTypeSkipList && that_present_eventTypeSkipList))
        return false;
      if (!this.eventTypeSkipList.equals(that.eventTypeSkipList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(lastEvent);

    hashCode = hashCode * 8191 + ((isSetMaxEvents()) ? 131071 : 524287);
    if (isSetMaxEvents())
      hashCode = hashCode * 8191 + maxEvents;

    hashCode = hashCode * 8191 + ((isSetEventTypeSkipList()) ? 131071 : 524287);
    if (isSetEventTypeSkipList())
      hashCode = hashCode * 8191 + eventTypeSkipList.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(NotificationEventRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetLastEvent(), other.isSetLastEvent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastEvent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastEvent, other.lastEvent);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMaxEvents(), other.isSetMaxEvents());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxEvents()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.maxEvents, other.maxEvents);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEventTypeSkipList(), other.isSetEventTypeSkipList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEventTypeSkipList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.eventTypeSkipList, other.eventTypeSkipList);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("NotificationEventRequest(");
    boolean first = true;

    sb.append("lastEvent:");
    sb.append(this.lastEvent);
    first = false;
    if (isSetMaxEvents()) {
      if (!first) sb.append(", ");
      sb.append("maxEvents:");
      sb.append(this.maxEvents);
      first = false;
    }
    if (isSetEventTypeSkipList()) {
      if (!first) sb.append(", ");
      sb.append("eventTypeSkipList:");
      if (this.eventTypeSkipList == null) {
        sb.append("null");
      } else {
        sb.append(this.eventTypeSkipList);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetLastEvent()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'lastEvent' is unset! Struct:" + toString());
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

  private static class NotificationEventRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public NotificationEventRequestStandardScheme getScheme() {
      return new NotificationEventRequestStandardScheme();
    }
  }

  private static class NotificationEventRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<NotificationEventRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NotificationEventRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LAST_EVENT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lastEvent = iprot.readI64();
              struct.setLastEventIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MAX_EVENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.maxEvents = iprot.readI32();
              struct.setMaxEventsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EVENT_TYPE_SKIP_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list896 = iprot.readListBegin();
                struct.eventTypeSkipList = new java.util.ArrayList<java.lang.String>(_list896.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem897;
                for (int _i898 = 0; _i898 < _list896.size; ++_i898)
                {
                  _elem897 = iprot.readString();
                  struct.eventTypeSkipList.add(_elem897);
                }
                iprot.readListEnd();
              }
              struct.setEventTypeSkipListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, NotificationEventRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(LAST_EVENT_FIELD_DESC);
      oprot.writeI64(struct.lastEvent);
      oprot.writeFieldEnd();
      if (struct.isSetMaxEvents()) {
        oprot.writeFieldBegin(MAX_EVENTS_FIELD_DESC);
        oprot.writeI32(struct.maxEvents);
        oprot.writeFieldEnd();
      }
      if (struct.eventTypeSkipList != null) {
        if (struct.isSetEventTypeSkipList()) {
          oprot.writeFieldBegin(EVENT_TYPE_SKIP_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.eventTypeSkipList.size()));
            for (java.lang.String _iter899 : struct.eventTypeSkipList)
            {
              oprot.writeString(_iter899);
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

  private static class NotificationEventRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public NotificationEventRequestTupleScheme getScheme() {
      return new NotificationEventRequestTupleScheme();
    }
  }

  private static class NotificationEventRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<NotificationEventRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NotificationEventRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.lastEvent);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMaxEvents()) {
        optionals.set(0);
      }
      if (struct.isSetEventTypeSkipList()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetMaxEvents()) {
        oprot.writeI32(struct.maxEvents);
      }
      if (struct.isSetEventTypeSkipList()) {
        {
          oprot.writeI32(struct.eventTypeSkipList.size());
          for (java.lang.String _iter900 : struct.eventTypeSkipList)
          {
            oprot.writeString(_iter900);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, NotificationEventRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.lastEvent = iprot.readI64();
      struct.setLastEventIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.maxEvents = iprot.readI32();
        struct.setMaxEventsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list901 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
          struct.eventTypeSkipList = new java.util.ArrayList<java.lang.String>(_list901.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem902;
          for (int _i903 = 0; _i903 < _list901.size; ++_i903)
          {
            _elem902 = iprot.readString();
            struct.eventTypeSkipList.add(_elem902);
          }
        }
        struct.setEventTypeSkipListIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

