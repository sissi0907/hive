/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class AddCheckConstraintRequest implements org.apache.thrift.TBase<AddCheckConstraintRequest, AddCheckConstraintRequest._Fields>, java.io.Serializable, Cloneable, Comparable<AddCheckConstraintRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AddCheckConstraintRequest");

  private static final org.apache.thrift.protocol.TField CHECK_CONSTRAINT_COLS_FIELD_DESC = new org.apache.thrift.protocol.TField("checkConstraintCols", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AddCheckConstraintRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AddCheckConstraintRequestTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<SQLCheckConstraint> checkConstraintCols; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CHECK_CONSTRAINT_COLS((short)1, "checkConstraintCols");

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
        case 1: // CHECK_CONSTRAINT_COLS
          return CHECK_CONSTRAINT_COLS;
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
    tmpMap.put(_Fields.CHECK_CONSTRAINT_COLS, new org.apache.thrift.meta_data.FieldMetaData("checkConstraintCols", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SQLCheckConstraint.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AddCheckConstraintRequest.class, metaDataMap);
  }

  public AddCheckConstraintRequest() {
  }

  public AddCheckConstraintRequest(
    java.util.List<SQLCheckConstraint> checkConstraintCols)
  {
    this();
    this.checkConstraintCols = checkConstraintCols;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AddCheckConstraintRequest(AddCheckConstraintRequest other) {
    if (other.isSetCheckConstraintCols()) {
      java.util.List<SQLCheckConstraint> __this__checkConstraintCols = new java.util.ArrayList<SQLCheckConstraint>(other.checkConstraintCols.size());
      for (SQLCheckConstraint other_element : other.checkConstraintCols) {
        __this__checkConstraintCols.add(new SQLCheckConstraint(other_element));
      }
      this.checkConstraintCols = __this__checkConstraintCols;
    }
  }

  public AddCheckConstraintRequest deepCopy() {
    return new AddCheckConstraintRequest(this);
  }

  @Override
  public void clear() {
    this.checkConstraintCols = null;
  }

  public int getCheckConstraintColsSize() {
    return (this.checkConstraintCols == null) ? 0 : this.checkConstraintCols.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<SQLCheckConstraint> getCheckConstraintColsIterator() {
    return (this.checkConstraintCols == null) ? null : this.checkConstraintCols.iterator();
  }

  public void addToCheckConstraintCols(SQLCheckConstraint elem) {
    if (this.checkConstraintCols == null) {
      this.checkConstraintCols = new java.util.ArrayList<SQLCheckConstraint>();
    }
    this.checkConstraintCols.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<SQLCheckConstraint> getCheckConstraintCols() {
    return this.checkConstraintCols;
  }

  public void setCheckConstraintCols(@org.apache.thrift.annotation.Nullable java.util.List<SQLCheckConstraint> checkConstraintCols) {
    this.checkConstraintCols = checkConstraintCols;
  }

  public void unsetCheckConstraintCols() {
    this.checkConstraintCols = null;
  }

  /** Returns true if field checkConstraintCols is set (has been assigned a value) and false otherwise */
  public boolean isSetCheckConstraintCols() {
    return this.checkConstraintCols != null;
  }

  public void setCheckConstraintColsIsSet(boolean value) {
    if (!value) {
      this.checkConstraintCols = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CHECK_CONSTRAINT_COLS:
      if (value == null) {
        unsetCheckConstraintCols();
      } else {
        setCheckConstraintCols((java.util.List<SQLCheckConstraint>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CHECK_CONSTRAINT_COLS:
      return getCheckConstraintCols();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CHECK_CONSTRAINT_COLS:
      return isSetCheckConstraintCols();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof AddCheckConstraintRequest)
      return this.equals((AddCheckConstraintRequest)that);
    return false;
  }

  public boolean equals(AddCheckConstraintRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_checkConstraintCols = true && this.isSetCheckConstraintCols();
    boolean that_present_checkConstraintCols = true && that.isSetCheckConstraintCols();
    if (this_present_checkConstraintCols || that_present_checkConstraintCols) {
      if (!(this_present_checkConstraintCols && that_present_checkConstraintCols))
        return false;
      if (!this.checkConstraintCols.equals(that.checkConstraintCols))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCheckConstraintCols()) ? 131071 : 524287);
    if (isSetCheckConstraintCols())
      hashCode = hashCode * 8191 + checkConstraintCols.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(AddCheckConstraintRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetCheckConstraintCols(), other.isSetCheckConstraintCols());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCheckConstraintCols()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.checkConstraintCols, other.checkConstraintCols);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("AddCheckConstraintRequest(");
    boolean first = true;

    sb.append("checkConstraintCols:");
    if (this.checkConstraintCols == null) {
      sb.append("null");
    } else {
      sb.append(this.checkConstraintCols);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetCheckConstraintCols()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'checkConstraintCols' is unset! Struct:" + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AddCheckConstraintRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AddCheckConstraintRequestStandardScheme getScheme() {
      return new AddCheckConstraintRequestStandardScheme();
    }
  }

  private static class AddCheckConstraintRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<AddCheckConstraintRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AddCheckConstraintRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CHECK_CONSTRAINT_COLS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list522 = iprot.readListBegin();
                struct.checkConstraintCols = new java.util.ArrayList<SQLCheckConstraint>(_list522.size);
                @org.apache.thrift.annotation.Nullable SQLCheckConstraint _elem523;
                for (int _i524 = 0; _i524 < _list522.size; ++_i524)
                {
                  _elem523 = new SQLCheckConstraint();
                  _elem523.read(iprot);
                  struct.checkConstraintCols.add(_elem523);
                }
                iprot.readListEnd();
              }
              struct.setCheckConstraintColsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AddCheckConstraintRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.checkConstraintCols != null) {
        oprot.writeFieldBegin(CHECK_CONSTRAINT_COLS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.checkConstraintCols.size()));
          for (SQLCheckConstraint _iter525 : struct.checkConstraintCols)
          {
            _iter525.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AddCheckConstraintRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AddCheckConstraintRequestTupleScheme getScheme() {
      return new AddCheckConstraintRequestTupleScheme();
    }
  }

  private static class AddCheckConstraintRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<AddCheckConstraintRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AddCheckConstraintRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.checkConstraintCols.size());
        for (SQLCheckConstraint _iter526 : struct.checkConstraintCols)
        {
          _iter526.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AddCheckConstraintRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list527 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
        struct.checkConstraintCols = new java.util.ArrayList<SQLCheckConstraint>(_list527.size);
        @org.apache.thrift.annotation.Nullable SQLCheckConstraint _elem528;
        for (int _i529 = 0; _i529 < _list527.size; ++_i529)
        {
          _elem528 = new SQLCheckConstraint();
          _elem528.read(iprot);
          struct.checkConstraintCols.add(_elem528);
        }
      }
      struct.setCheckConstraintColsIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

