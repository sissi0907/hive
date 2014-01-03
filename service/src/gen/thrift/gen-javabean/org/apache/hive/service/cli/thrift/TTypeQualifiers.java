/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hive.service.cli.thrift;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TTypeQualifiers implements org.apache.thrift.TBase<TTypeQualifiers, TTypeQualifiers._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTypeQualifiers");

  private static final org.apache.thrift.protocol.TField QUALIFIERS_FIELD_DESC = new org.apache.thrift.protocol.TField("qualifiers", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TTypeQualifiersStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TTypeQualifiersTupleSchemeFactory());
  }

  private Map<String,TTypeQualifierValue> qualifiers; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    QUALIFIERS((short)1, "qualifiers");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // QUALIFIERS
          return QUALIFIERS;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUALIFIERS, new org.apache.thrift.meta_data.FieldMetaData("qualifiers", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTypeQualifierValue.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTypeQualifiers.class, metaDataMap);
  }

  public TTypeQualifiers() {
  }

  public TTypeQualifiers(
    Map<String,TTypeQualifierValue> qualifiers)
  {
    this();
    this.qualifiers = qualifiers;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTypeQualifiers(TTypeQualifiers other) {
    if (other.isSetQualifiers()) {
      Map<String,TTypeQualifierValue> __this__qualifiers = new HashMap<String,TTypeQualifierValue>();
      for (Map.Entry<String, TTypeQualifierValue> other_element : other.qualifiers.entrySet()) {

        String other_element_key = other_element.getKey();
        TTypeQualifierValue other_element_value = other_element.getValue();

        String __this__qualifiers_copy_key = other_element_key;

        TTypeQualifierValue __this__qualifiers_copy_value = new TTypeQualifierValue(other_element_value);

        __this__qualifiers.put(__this__qualifiers_copy_key, __this__qualifiers_copy_value);
      }
      this.qualifiers = __this__qualifiers;
    }
  }

  public TTypeQualifiers deepCopy() {
    return new TTypeQualifiers(this);
  }

  @Override
  public void clear() {
    this.qualifiers = null;
  }

  public int getQualifiersSize() {
    return (this.qualifiers == null) ? 0 : this.qualifiers.size();
  }

  public void putToQualifiers(String key, TTypeQualifierValue val) {
    if (this.qualifiers == null) {
      this.qualifiers = new HashMap<String,TTypeQualifierValue>();
    }
    this.qualifiers.put(key, val);
  }

  public Map<String,TTypeQualifierValue> getQualifiers() {
    return this.qualifiers;
  }

  public void setQualifiers(Map<String,TTypeQualifierValue> qualifiers) {
    this.qualifiers = qualifiers;
  }

  public void unsetQualifiers() {
    this.qualifiers = null;
  }

  /** Returns true if field qualifiers is set (has been assigned a value) and false otherwise */
  public boolean isSetQualifiers() {
    return this.qualifiers != null;
  }

  public void setQualifiersIsSet(boolean value) {
    if (!value) {
      this.qualifiers = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUALIFIERS:
      if (value == null) {
        unsetQualifiers();
      } else {
        setQualifiers((Map<String,TTypeQualifierValue>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUALIFIERS:
      return getQualifiers();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUALIFIERS:
      return isSetQualifiers();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TTypeQualifiers)
      return this.equals((TTypeQualifiers)that);
    return false;
  }

  public boolean equals(TTypeQualifiers that) {
    if (that == null)
      return false;

    boolean this_present_qualifiers = true && this.isSetQualifiers();
    boolean that_present_qualifiers = true && that.isSetQualifiers();
    if (this_present_qualifiers || that_present_qualifiers) {
      if (!(this_present_qualifiers && that_present_qualifiers))
        return false;
      if (!this.qualifiers.equals(that.qualifiers))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_qualifiers = true && (isSetQualifiers());
    builder.append(present_qualifiers);
    if (present_qualifiers)
      builder.append(qualifiers);

    return builder.toHashCode();
  }

  public int compareTo(TTypeQualifiers other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TTypeQualifiers typedOther = (TTypeQualifiers)other;

    lastComparison = Boolean.valueOf(isSetQualifiers()).compareTo(typedOther.isSetQualifiers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQualifiers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.qualifiers, typedOther.qualifiers);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TTypeQualifiers(");
    boolean first = true;

    sb.append("qualifiers:");
    if (this.qualifiers == null) {
      sb.append("null");
    } else {
      sb.append(this.qualifiers);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetQualifiers()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'qualifiers' is unset! Struct:" + toString());
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TTypeQualifiersStandardSchemeFactory implements SchemeFactory {
    public TTypeQualifiersStandardScheme getScheme() {
      return new TTypeQualifiersStandardScheme();
    }
  }

  private static class TTypeQualifiersStandardScheme extends StandardScheme<TTypeQualifiers> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTypeQualifiers struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUALIFIERS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.qualifiers = new HashMap<String,TTypeQualifierValue>(2*_map0.size);
                for (int _i1 = 0; _i1 < _map0.size; ++_i1)
                {
                  String _key2; // required
                  TTypeQualifierValue _val3; // optional
                  _key2 = iprot.readString();
                  _val3 = new TTypeQualifierValue();
                  _val3.read(iprot);
                  struct.qualifiers.put(_key2, _val3);
                }
                iprot.readMapEnd();
              }
              struct.setQualifiersIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTypeQualifiers struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.qualifiers != null) {
        oprot.writeFieldBegin(QUALIFIERS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.qualifiers.size()));
          for (Map.Entry<String, TTypeQualifierValue> _iter4 : struct.qualifiers.entrySet())
          {
            oprot.writeString(_iter4.getKey());
            _iter4.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTypeQualifiersTupleSchemeFactory implements SchemeFactory {
    public TTypeQualifiersTupleScheme getScheme() {
      return new TTypeQualifiersTupleScheme();
    }
  }

  private static class TTypeQualifiersTupleScheme extends TupleScheme<TTypeQualifiers> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTypeQualifiers struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.qualifiers.size());
        for (Map.Entry<String, TTypeQualifierValue> _iter5 : struct.qualifiers.entrySet())
        {
          oprot.writeString(_iter5.getKey());
          _iter5.getValue().write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTypeQualifiers struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.qualifiers = new HashMap<String,TTypeQualifierValue>(2*_map6.size);
        for (int _i7 = 0; _i7 < _map6.size; ++_i7)
        {
          String _key8; // required
          TTypeQualifierValue _val9; // optional
          _key8 = iprot.readString();
          _val9 = new TTypeQualifierValue();
          _val9.read(iprot);
          struct.qualifiers.put(_key8, _val9);
        }
      }
      struct.setQualifiersIsSet(true);
    }
  }

}

