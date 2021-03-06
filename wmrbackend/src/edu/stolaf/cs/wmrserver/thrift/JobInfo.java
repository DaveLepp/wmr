/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package edu.stolaf.cs.wmrserver.thrift;

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

public class JobInfo implements org.apache.thrift.TBase<JobInfo, JobInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobInfo");

  private static final org.apache.thrift.protocol.TField NATIVE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("nativeID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TEST_FIELD_DESC = new org.apache.thrift.protocol.TField("test", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField INPUT_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("inputPath", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField OUTPUT_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("outputPath", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField MAPPER_FIELD_DESC = new org.apache.thrift.protocol.TField("mapper", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField REDUCER_FIELD_DESC = new org.apache.thrift.protocol.TField("reducer", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField REQUESTED_MAP_TASKS_FIELD_DESC = new org.apache.thrift.protocol.TField("requestedMapTasks", org.apache.thrift.protocol.TType.I32, (short)8);
  private static final org.apache.thrift.protocol.TField REQUESTED_REDUCE_TASKS_FIELD_DESC = new org.apache.thrift.protocol.TField("requestedReduceTasks", org.apache.thrift.protocol.TType.I32, (short)9);
  private static final org.apache.thrift.protocol.TField NUMERIC_SORT_FIELD_DESC = new org.apache.thrift.protocol.TField("numericSort", org.apache.thrift.protocol.TType.BOOL, (short)10);

  private String nativeID; // required
  private String name; // required
  private boolean test; // required
  private String inputPath; // required
  private String outputPath; // required
  private String mapper; // required
  private String reducer; // required
  private int requestedMapTasks; // required
  private int requestedReduceTasks; // required
  private boolean numericSort; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NATIVE_ID((short)1, "nativeID"),
    NAME((short)2, "name"),
    TEST((short)3, "test"),
    INPUT_PATH((short)4, "inputPath"),
    OUTPUT_PATH((short)5, "outputPath"),
    MAPPER((short)6, "mapper"),
    REDUCER((short)7, "reducer"),
    REQUESTED_MAP_TASKS((short)8, "requestedMapTasks"),
    REQUESTED_REDUCE_TASKS((short)9, "requestedReduceTasks"),
    NUMERIC_SORT((short)10, "numericSort");

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
        case 1: // NATIVE_ID
          return NATIVE_ID;
        case 2: // NAME
          return NAME;
        case 3: // TEST
          return TEST;
        case 4: // INPUT_PATH
          return INPUT_PATH;
        case 5: // OUTPUT_PATH
          return OUTPUT_PATH;
        case 6: // MAPPER
          return MAPPER;
        case 7: // REDUCER
          return REDUCER;
        case 8: // REQUESTED_MAP_TASKS
          return REQUESTED_MAP_TASKS;
        case 9: // REQUESTED_REDUCE_TASKS
          return REQUESTED_REDUCE_TASKS;
        case 10: // NUMERIC_SORT
          return NUMERIC_SORT;
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
  private static final int __TEST_ISSET_ID = 0;
  private static final int __REQUESTEDMAPTASKS_ISSET_ID = 1;
  private static final int __REQUESTEDREDUCETASKS_ISSET_ID = 2;
  private static final int __NUMERICSORT_ISSET_ID = 3;
  private BitSet __isset_bit_vector = new BitSet(4);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NATIVE_ID, new org.apache.thrift.meta_data.FieldMetaData("nativeID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TEST, new org.apache.thrift.meta_data.FieldMetaData("test", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.INPUT_PATH, new org.apache.thrift.meta_data.FieldMetaData("inputPath", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OUTPUT_PATH, new org.apache.thrift.meta_data.FieldMetaData("outputPath", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MAPPER, new org.apache.thrift.meta_data.FieldMetaData("mapper", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REDUCER, new org.apache.thrift.meta_data.FieldMetaData("reducer", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REQUESTED_MAP_TASKS, new org.apache.thrift.meta_data.FieldMetaData("requestedMapTasks", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.REQUESTED_REDUCE_TASKS, new org.apache.thrift.meta_data.FieldMetaData("requestedReduceTasks", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NUMERIC_SORT, new org.apache.thrift.meta_data.FieldMetaData("numericSort", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobInfo.class, metaDataMap);
  }

  public JobInfo() {
  }

  public JobInfo(
    String nativeID,
    String name,
    boolean test,
    String inputPath,
    String outputPath,
    String mapper,
    String reducer,
    boolean numericSort)
  {
    this();
    this.nativeID = nativeID;
    this.name = name;
    this.test = test;
    setTestIsSet(true);
    this.inputPath = inputPath;
    this.outputPath = outputPath;
    this.mapper = mapper;
    this.reducer = reducer;
    this.numericSort = numericSort;
    setNumericSortIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobInfo(JobInfo other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetNativeID()) {
      this.nativeID = other.nativeID;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.test = other.test;
    if (other.isSetInputPath()) {
      this.inputPath = other.inputPath;
    }
    if (other.isSetOutputPath()) {
      this.outputPath = other.outputPath;
    }
    if (other.isSetMapper()) {
      this.mapper = other.mapper;
    }
    if (other.isSetReducer()) {
      this.reducer = other.reducer;
    }
    this.requestedMapTasks = other.requestedMapTasks;
    this.requestedReduceTasks = other.requestedReduceTasks;
    this.numericSort = other.numericSort;
  }

  public JobInfo deepCopy() {
    return new JobInfo(this);
  }

  @Override
  public void clear() {
    this.nativeID = null;
    this.name = null;
    setTestIsSet(false);
    this.test = false;
    this.inputPath = null;
    this.outputPath = null;
    this.mapper = null;
    this.reducer = null;
    setRequestedMapTasksIsSet(false);
    this.requestedMapTasks = 0;
    setRequestedReduceTasksIsSet(false);
    this.requestedReduceTasks = 0;
    setNumericSortIsSet(false);
    this.numericSort = false;
  }

  public String getNativeID() {
    return this.nativeID;
  }

  public void setNativeID(String nativeID) {
    this.nativeID = nativeID;
  }

  public void unsetNativeID() {
    this.nativeID = null;
  }

  /** Returns true if field nativeID is set (has been assigned a value) and false otherwise */
  public boolean isSetNativeID() {
    return this.nativeID != null;
  }

  public void setNativeIDIsSet(boolean value) {
    if (!value) {
      this.nativeID = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public boolean isTest() {
    return this.test;
  }

  public void setTest(boolean test) {
    this.test = test;
    setTestIsSet(true);
  }

  public void unsetTest() {
    __isset_bit_vector.clear(__TEST_ISSET_ID);
  }

  /** Returns true if field test is set (has been assigned a value) and false otherwise */
  public boolean isSetTest() {
    return __isset_bit_vector.get(__TEST_ISSET_ID);
  }

  public void setTestIsSet(boolean value) {
    __isset_bit_vector.set(__TEST_ISSET_ID, value);
  }

  public String getInputPath() {
    return this.inputPath;
  }

  public void setInputPath(String inputPath) {
    this.inputPath = inputPath;
  }

  public void unsetInputPath() {
    this.inputPath = null;
  }

  /** Returns true if field inputPath is set (has been assigned a value) and false otherwise */
  public boolean isSetInputPath() {
    return this.inputPath != null;
  }

  public void setInputPathIsSet(boolean value) {
    if (!value) {
      this.inputPath = null;
    }
  }

  public String getOutputPath() {
    return this.outputPath;
  }

  public void setOutputPath(String outputPath) {
    this.outputPath = outputPath;
  }

  public void unsetOutputPath() {
    this.outputPath = null;
  }

  /** Returns true if field outputPath is set (has been assigned a value) and false otherwise */
  public boolean isSetOutputPath() {
    return this.outputPath != null;
  }

  public void setOutputPathIsSet(boolean value) {
    if (!value) {
      this.outputPath = null;
    }
  }

  public String getMapper() {
    return this.mapper;
  }

  public void setMapper(String mapper) {
    this.mapper = mapper;
  }

  public void unsetMapper() {
    this.mapper = null;
  }

  /** Returns true if field mapper is set (has been assigned a value) and false otherwise */
  public boolean isSetMapper() {
    return this.mapper != null;
  }

  public void setMapperIsSet(boolean value) {
    if (!value) {
      this.mapper = null;
    }
  }

  public String getReducer() {
    return this.reducer;
  }

  public void setReducer(String reducer) {
    this.reducer = reducer;
  }

  public void unsetReducer() {
    this.reducer = null;
  }

  /** Returns true if field reducer is set (has been assigned a value) and false otherwise */
  public boolean isSetReducer() {
    return this.reducer != null;
  }

  public void setReducerIsSet(boolean value) {
    if (!value) {
      this.reducer = null;
    }
  }

  public int getRequestedMapTasks() {
    return this.requestedMapTasks;
  }

  public void setRequestedMapTasks(int requestedMapTasks) {
    this.requestedMapTasks = requestedMapTasks;
    setRequestedMapTasksIsSet(true);
  }

  public void unsetRequestedMapTasks() {
    __isset_bit_vector.clear(__REQUESTEDMAPTASKS_ISSET_ID);
  }

  /** Returns true if field requestedMapTasks is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestedMapTasks() {
    return __isset_bit_vector.get(__REQUESTEDMAPTASKS_ISSET_ID);
  }

  public void setRequestedMapTasksIsSet(boolean value) {
    __isset_bit_vector.set(__REQUESTEDMAPTASKS_ISSET_ID, value);
  }

  public int getRequestedReduceTasks() {
    return this.requestedReduceTasks;
  }

  public void setRequestedReduceTasks(int requestedReduceTasks) {
    this.requestedReduceTasks = requestedReduceTasks;
    setRequestedReduceTasksIsSet(true);
  }

  public void unsetRequestedReduceTasks() {
    __isset_bit_vector.clear(__REQUESTEDREDUCETASKS_ISSET_ID);
  }

  /** Returns true if field requestedReduceTasks is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestedReduceTasks() {
    return __isset_bit_vector.get(__REQUESTEDREDUCETASKS_ISSET_ID);
  }

  public void setRequestedReduceTasksIsSet(boolean value) {
    __isset_bit_vector.set(__REQUESTEDREDUCETASKS_ISSET_ID, value);
  }

  public boolean isNumericSort() {
    return this.numericSort;
  }

  public void setNumericSort(boolean numericSort) {
    this.numericSort = numericSort;
    setNumericSortIsSet(true);
  }

  public void unsetNumericSort() {
    __isset_bit_vector.clear(__NUMERICSORT_ISSET_ID);
  }

  /** Returns true if field numericSort is set (has been assigned a value) and false otherwise */
  public boolean isSetNumericSort() {
    return __isset_bit_vector.get(__NUMERICSORT_ISSET_ID);
  }

  public void setNumericSortIsSet(boolean value) {
    __isset_bit_vector.set(__NUMERICSORT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NATIVE_ID:
      if (value == null) {
        unsetNativeID();
      } else {
        setNativeID((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case TEST:
      if (value == null) {
        unsetTest();
      } else {
        setTest((Boolean)value);
      }
      break;

    case INPUT_PATH:
      if (value == null) {
        unsetInputPath();
      } else {
        setInputPath((String)value);
      }
      break;

    case OUTPUT_PATH:
      if (value == null) {
        unsetOutputPath();
      } else {
        setOutputPath((String)value);
      }
      break;

    case MAPPER:
      if (value == null) {
        unsetMapper();
      } else {
        setMapper((String)value);
      }
      break;

    case REDUCER:
      if (value == null) {
        unsetReducer();
      } else {
        setReducer((String)value);
      }
      break;

    case REQUESTED_MAP_TASKS:
      if (value == null) {
        unsetRequestedMapTasks();
      } else {
        setRequestedMapTasks((Integer)value);
      }
      break;

    case REQUESTED_REDUCE_TASKS:
      if (value == null) {
        unsetRequestedReduceTasks();
      } else {
        setRequestedReduceTasks((Integer)value);
      }
      break;

    case NUMERIC_SORT:
      if (value == null) {
        unsetNumericSort();
      } else {
        setNumericSort((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NATIVE_ID:
      return getNativeID();

    case NAME:
      return getName();

    case TEST:
      return Boolean.valueOf(isTest());

    case INPUT_PATH:
      return getInputPath();

    case OUTPUT_PATH:
      return getOutputPath();

    case MAPPER:
      return getMapper();

    case REDUCER:
      return getReducer();

    case REQUESTED_MAP_TASKS:
      return Integer.valueOf(getRequestedMapTasks());

    case REQUESTED_REDUCE_TASKS:
      return Integer.valueOf(getRequestedReduceTasks());

    case NUMERIC_SORT:
      return Boolean.valueOf(isNumericSort());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NATIVE_ID:
      return isSetNativeID();
    case NAME:
      return isSetName();
    case TEST:
      return isSetTest();
    case INPUT_PATH:
      return isSetInputPath();
    case OUTPUT_PATH:
      return isSetOutputPath();
    case MAPPER:
      return isSetMapper();
    case REDUCER:
      return isSetReducer();
    case REQUESTED_MAP_TASKS:
      return isSetRequestedMapTasks();
    case REQUESTED_REDUCE_TASKS:
      return isSetRequestedReduceTasks();
    case NUMERIC_SORT:
      return isSetNumericSort();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JobInfo)
      return this.equals((JobInfo)that);
    return false;
  }

  public boolean equals(JobInfo that) {
    if (that == null)
      return false;

    boolean this_present_nativeID = true && this.isSetNativeID();
    boolean that_present_nativeID = true && that.isSetNativeID();
    if (this_present_nativeID || that_present_nativeID) {
      if (!(this_present_nativeID && that_present_nativeID))
        return false;
      if (!this.nativeID.equals(that.nativeID))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_test = true;
    boolean that_present_test = true;
    if (this_present_test || that_present_test) {
      if (!(this_present_test && that_present_test))
        return false;
      if (this.test != that.test)
        return false;
    }

    boolean this_present_inputPath = true && this.isSetInputPath();
    boolean that_present_inputPath = true && that.isSetInputPath();
    if (this_present_inputPath || that_present_inputPath) {
      if (!(this_present_inputPath && that_present_inputPath))
        return false;
      if (!this.inputPath.equals(that.inputPath))
        return false;
    }

    boolean this_present_outputPath = true && this.isSetOutputPath();
    boolean that_present_outputPath = true && that.isSetOutputPath();
    if (this_present_outputPath || that_present_outputPath) {
      if (!(this_present_outputPath && that_present_outputPath))
        return false;
      if (!this.outputPath.equals(that.outputPath))
        return false;
    }

    boolean this_present_mapper = true && this.isSetMapper();
    boolean that_present_mapper = true && that.isSetMapper();
    if (this_present_mapper || that_present_mapper) {
      if (!(this_present_mapper && that_present_mapper))
        return false;
      if (!this.mapper.equals(that.mapper))
        return false;
    }

    boolean this_present_reducer = true && this.isSetReducer();
    boolean that_present_reducer = true && that.isSetReducer();
    if (this_present_reducer || that_present_reducer) {
      if (!(this_present_reducer && that_present_reducer))
        return false;
      if (!this.reducer.equals(that.reducer))
        return false;
    }

    boolean this_present_requestedMapTasks = true && this.isSetRequestedMapTasks();
    boolean that_present_requestedMapTasks = true && that.isSetRequestedMapTasks();
    if (this_present_requestedMapTasks || that_present_requestedMapTasks) {
      if (!(this_present_requestedMapTasks && that_present_requestedMapTasks))
        return false;
      if (this.requestedMapTasks != that.requestedMapTasks)
        return false;
    }

    boolean this_present_requestedReduceTasks = true && this.isSetRequestedReduceTasks();
    boolean that_present_requestedReduceTasks = true && that.isSetRequestedReduceTasks();
    if (this_present_requestedReduceTasks || that_present_requestedReduceTasks) {
      if (!(this_present_requestedReduceTasks && that_present_requestedReduceTasks))
        return false;
      if (this.requestedReduceTasks != that.requestedReduceTasks)
        return false;
    }

    boolean this_present_numericSort = true;
    boolean that_present_numericSort = true;
    if (this_present_numericSort || that_present_numericSort) {
      if (!(this_present_numericSort && that_present_numericSort))
        return false;
      if (this.numericSort != that.numericSort)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(JobInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    JobInfo typedOther = (JobInfo)other;

    lastComparison = Boolean.valueOf(isSetNativeID()).compareTo(typedOther.isSetNativeID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNativeID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nativeID, typedOther.nativeID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTest()).compareTo(typedOther.isSetTest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.test, typedOther.test);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInputPath()).compareTo(typedOther.isSetInputPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInputPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inputPath, typedOther.inputPath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOutputPath()).compareTo(typedOther.isSetOutputPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOutputPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.outputPath, typedOther.outputPath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMapper()).compareTo(typedOther.isSetMapper());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMapper()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mapper, typedOther.mapper);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReducer()).compareTo(typedOther.isSetReducer());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReducer()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reducer, typedOther.reducer);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRequestedMapTasks()).compareTo(typedOther.isSetRequestedMapTasks());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestedMapTasks()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestedMapTasks, typedOther.requestedMapTasks);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRequestedReduceTasks()).compareTo(typedOther.isSetRequestedReduceTasks());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestedReduceTasks()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestedReduceTasks, typedOther.requestedReduceTasks);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNumericSort()).compareTo(typedOther.isSetNumericSort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumericSort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.numericSort, typedOther.numericSort);
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
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // NATIVE_ID
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.nativeID = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // NAME
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.name = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // TEST
          if (field.type == org.apache.thrift.protocol.TType.BOOL) {
            this.test = iprot.readBool();
            setTestIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // INPUT_PATH
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.inputPath = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // OUTPUT_PATH
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.outputPath = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // MAPPER
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.mapper = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // REDUCER
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.reducer = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // REQUESTED_MAP_TASKS
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.requestedMapTasks = iprot.readI32();
            setRequestedMapTasksIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 9: // REQUESTED_REDUCE_TASKS
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.requestedReduceTasks = iprot.readI32();
            setRequestedReduceTasksIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 10: // NUMERIC_SORT
          if (field.type == org.apache.thrift.protocol.TType.BOOL) {
            this.numericSort = iprot.readBool();
            setNumericSortIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.nativeID != null) {
      oprot.writeFieldBegin(NATIVE_ID_FIELD_DESC);
      oprot.writeString(this.nativeID);
      oprot.writeFieldEnd();
    }
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(TEST_FIELD_DESC);
    oprot.writeBool(this.test);
    oprot.writeFieldEnd();
    if (this.inputPath != null) {
      oprot.writeFieldBegin(INPUT_PATH_FIELD_DESC);
      oprot.writeString(this.inputPath);
      oprot.writeFieldEnd();
    }
    if (this.outputPath != null) {
      oprot.writeFieldBegin(OUTPUT_PATH_FIELD_DESC);
      oprot.writeString(this.outputPath);
      oprot.writeFieldEnd();
    }
    if (this.mapper != null) {
      oprot.writeFieldBegin(MAPPER_FIELD_DESC);
      oprot.writeString(this.mapper);
      oprot.writeFieldEnd();
    }
    if (this.reducer != null) {
      oprot.writeFieldBegin(REDUCER_FIELD_DESC);
      oprot.writeString(this.reducer);
      oprot.writeFieldEnd();
    }
    if (isSetRequestedMapTasks()) {
      oprot.writeFieldBegin(REQUESTED_MAP_TASKS_FIELD_DESC);
      oprot.writeI32(this.requestedMapTasks);
      oprot.writeFieldEnd();
    }
    if (isSetRequestedReduceTasks()) {
      oprot.writeFieldBegin(REQUESTED_REDUCE_TASKS_FIELD_DESC);
      oprot.writeI32(this.requestedReduceTasks);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(NUMERIC_SORT_FIELD_DESC);
    oprot.writeBool(this.numericSort);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("JobInfo(");
    boolean first = true;

    sb.append("nativeID:");
    if (this.nativeID == null) {
      sb.append("null");
    } else {
      sb.append(this.nativeID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("test:");
    sb.append(this.test);
    first = false;
    if (!first) sb.append(", ");
    sb.append("inputPath:");
    if (this.inputPath == null) {
      sb.append("null");
    } else {
      sb.append(this.inputPath);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("outputPath:");
    if (this.outputPath == null) {
      sb.append("null");
    } else {
      sb.append(this.outputPath);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("mapper:");
    if (this.mapper == null) {
      sb.append("null");
    } else {
      sb.append(this.mapper);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("reducer:");
    if (this.reducer == null) {
      sb.append("null");
    } else {
      sb.append(this.reducer);
    }
    first = false;
    if (isSetRequestedMapTasks()) {
      if (!first) sb.append(", ");
      sb.append("requestedMapTasks:");
      sb.append(this.requestedMapTasks);
      first = false;
    }
    if (isSetRequestedReduceTasks()) {
      if (!first) sb.append(", ");
      sb.append("requestedReduceTasks:");
      sb.append(this.requestedReduceTasks);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("numericSort:");
    sb.append(this.numericSort);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

