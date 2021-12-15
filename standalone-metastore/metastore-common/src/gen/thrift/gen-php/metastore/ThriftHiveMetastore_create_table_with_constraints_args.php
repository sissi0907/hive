<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class ThriftHiveMetastore_create_table_with_constraints_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'tbl',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\Table',
        ),
        2 => array(
            'var' => 'primaryKeys',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\SQLPrimaryKey',
                ),
        ),
        3 => array(
            'var' => 'foreignKeys',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\SQLForeignKey',
                ),
        ),
        4 => array(
            'var' => 'uniqueConstraints',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\SQLUniqueConstraint',
                ),
        ),
        5 => array(
            'var' => 'notNullConstraints',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\SQLNotNullConstraint',
                ),
        ),
        6 => array(
            'var' => 'defaultConstraints',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\SQLDefaultConstraint',
                ),
        ),
        7 => array(
            'var' => 'checkConstraints',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\SQLCheckConstraint',
                ),
        ),
    );

    /**
     * @var \metastore\Table
     */
    public $tbl = null;
    /**
     * @var \metastore\SQLPrimaryKey[]
     */
    public $primaryKeys = null;
    /**
     * @var \metastore\SQLForeignKey[]
     */
    public $foreignKeys = null;
    /**
     * @var \metastore\SQLUniqueConstraint[]
     */
    public $uniqueConstraints = null;
    /**
     * @var \metastore\SQLNotNullConstraint[]
     */
    public $notNullConstraints = null;
    /**
     * @var \metastore\SQLDefaultConstraint[]
     */
    public $defaultConstraints = null;
    /**
     * @var \metastore\SQLCheckConstraint[]
     */
    public $checkConstraints = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['tbl'])) {
                $this->tbl = $vals['tbl'];
            }
            if (isset($vals['primaryKeys'])) {
                $this->primaryKeys = $vals['primaryKeys'];
            }
            if (isset($vals['foreignKeys'])) {
                $this->foreignKeys = $vals['foreignKeys'];
            }
            if (isset($vals['uniqueConstraints'])) {
                $this->uniqueConstraints = $vals['uniqueConstraints'];
            }
            if (isset($vals['notNullConstraints'])) {
                $this->notNullConstraints = $vals['notNullConstraints'];
            }
            if (isset($vals['defaultConstraints'])) {
                $this->defaultConstraints = $vals['defaultConstraints'];
            }
            if (isset($vals['checkConstraints'])) {
                $this->checkConstraints = $vals['checkConstraints'];
            }
        }
    }

    public function getName()
    {
        return 'ThriftHiveMetastore_create_table_with_constraints_args';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::STRUCT) {
                        $this->tbl = new \metastore\Table();
                        $xfer += $this->tbl->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::LST) {
                        $this->primaryKeys = array();
                        $_size1311 = 0;
                        $_etype1314 = 0;
                        $xfer += $input->readListBegin($_etype1314, $_size1311);
                        for ($_i1315 = 0; $_i1315 < $_size1311; ++$_i1315) {
                            $elem1316 = null;
                            $elem1316 = new \metastore\SQLPrimaryKey();
                            $xfer += $elem1316->read($input);
                            $this->primaryKeys []= $elem1316;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::LST) {
                        $this->foreignKeys = array();
                        $_size1317 = 0;
                        $_etype1320 = 0;
                        $xfer += $input->readListBegin($_etype1320, $_size1317);
                        for ($_i1321 = 0; $_i1321 < $_size1317; ++$_i1321) {
                            $elem1322 = null;
                            $elem1322 = new \metastore\SQLForeignKey();
                            $xfer += $elem1322->read($input);
                            $this->foreignKeys []= $elem1322;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::LST) {
                        $this->uniqueConstraints = array();
                        $_size1323 = 0;
                        $_etype1326 = 0;
                        $xfer += $input->readListBegin($_etype1326, $_size1323);
                        for ($_i1327 = 0; $_i1327 < $_size1323; ++$_i1327) {
                            $elem1328 = null;
                            $elem1328 = new \metastore\SQLUniqueConstraint();
                            $xfer += $elem1328->read($input);
                            $this->uniqueConstraints []= $elem1328;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::LST) {
                        $this->notNullConstraints = array();
                        $_size1329 = 0;
                        $_etype1332 = 0;
                        $xfer += $input->readListBegin($_etype1332, $_size1329);
                        for ($_i1333 = 0; $_i1333 < $_size1329; ++$_i1333) {
                            $elem1334 = null;
                            $elem1334 = new \metastore\SQLNotNullConstraint();
                            $xfer += $elem1334->read($input);
                            $this->notNullConstraints []= $elem1334;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::LST) {
                        $this->defaultConstraints = array();
                        $_size1335 = 0;
                        $_etype1338 = 0;
                        $xfer += $input->readListBegin($_etype1338, $_size1335);
                        for ($_i1339 = 0; $_i1339 < $_size1335; ++$_i1339) {
                            $elem1340 = null;
                            $elem1340 = new \metastore\SQLDefaultConstraint();
                            $xfer += $elem1340->read($input);
                            $this->defaultConstraints []= $elem1340;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 7:
                    if ($ftype == TType::LST) {
                        $this->checkConstraints = array();
                        $_size1341 = 0;
                        $_etype1344 = 0;
                        $xfer += $input->readListBegin($_etype1344, $_size1341);
                        for ($_i1345 = 0; $_i1345 < $_size1341; ++$_i1345) {
                            $elem1346 = null;
                            $elem1346 = new \metastore\SQLCheckConstraint();
                            $xfer += $elem1346->read($input);
                            $this->checkConstraints []= $elem1346;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('ThriftHiveMetastore_create_table_with_constraints_args');
        if ($this->tbl !== null) {
            if (!is_object($this->tbl)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('tbl', TType::STRUCT, 1);
            $xfer += $this->tbl->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->primaryKeys !== null) {
            if (!is_array($this->primaryKeys)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('primaryKeys', TType::LST, 2);
            $output->writeListBegin(TType::STRUCT, count($this->primaryKeys));
            foreach ($this->primaryKeys as $iter1347) {
                $xfer += $iter1347->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->foreignKeys !== null) {
            if (!is_array($this->foreignKeys)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('foreignKeys', TType::LST, 3);
            $output->writeListBegin(TType::STRUCT, count($this->foreignKeys));
            foreach ($this->foreignKeys as $iter1348) {
                $xfer += $iter1348->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->uniqueConstraints !== null) {
            if (!is_array($this->uniqueConstraints)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('uniqueConstraints', TType::LST, 4);
            $output->writeListBegin(TType::STRUCT, count($this->uniqueConstraints));
            foreach ($this->uniqueConstraints as $iter1349) {
                $xfer += $iter1349->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->notNullConstraints !== null) {
            if (!is_array($this->notNullConstraints)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('notNullConstraints', TType::LST, 5);
            $output->writeListBegin(TType::STRUCT, count($this->notNullConstraints));
            foreach ($this->notNullConstraints as $iter1350) {
                $xfer += $iter1350->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->defaultConstraints !== null) {
            if (!is_array($this->defaultConstraints)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('defaultConstraints', TType::LST, 6);
            $output->writeListBegin(TType::STRUCT, count($this->defaultConstraints));
            foreach ($this->defaultConstraints as $iter1351) {
                $xfer += $iter1351->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->checkConstraints !== null) {
            if (!is_array($this->checkConstraints)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('checkConstraints', TType::LST, 7);
            $output->writeListBegin(TType::STRUCT, count($this->checkConstraints));
            foreach ($this->checkConstraints as $iter1352) {
                $xfer += $iter1352->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
