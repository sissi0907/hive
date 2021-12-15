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

class PartitionValuesRow
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'row',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::STRING,
            'elem' => array(
                'type' => TType::STRING,
                ),
        ),
    );

    /**
     * @var string[]
     */
    public $row = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['row'])) {
                $this->row = $vals['row'];
            }
        }
    }

    public function getName()
    {
        return 'PartitionValuesRow';
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
                    if ($ftype == TType::LST) {
                        $this->row = array();
                        $_size576 = 0;
                        $_etype579 = 0;
                        $xfer += $input->readListBegin($_etype579, $_size576);
                        for ($_i580 = 0; $_i580 < $_size576; ++$_i580) {
                            $elem581 = null;
                            $xfer += $input->readString($elem581);
                            $this->row []= $elem581;
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
        $xfer += $output->writeStructBegin('PartitionValuesRow');
        if ($this->row !== null) {
            if (!is_array($this->row)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('row', TType::LST, 1);
            $output->writeListBegin(TType::STRING, count($this->row));
            foreach ($this->row as $iter582) {
                $xfer += $output->writeString($iter582);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
