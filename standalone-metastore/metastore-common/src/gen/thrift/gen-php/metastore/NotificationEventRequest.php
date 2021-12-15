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

class NotificationEventRequest
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'lastEvent',
            'isRequired' => true,
            'type' => TType::I64,
        ),
        2 => array(
            'var' => 'maxEvents',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        3 => array(
            'var' => 'eventTypeSkipList',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRING,
            'elem' => array(
                'type' => TType::STRING,
                ),
        ),
    );

    /**
     * @var int
     */
    public $lastEvent = null;
    /**
     * @var int
     */
    public $maxEvents = null;
    /**
     * @var string[]
     */
    public $eventTypeSkipList = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['lastEvent'])) {
                $this->lastEvent = $vals['lastEvent'];
            }
            if (isset($vals['maxEvents'])) {
                $this->maxEvents = $vals['maxEvents'];
            }
            if (isset($vals['eventTypeSkipList'])) {
                $this->eventTypeSkipList = $vals['eventTypeSkipList'];
            }
        }
    }

    public function getName()
    {
        return 'NotificationEventRequest';
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
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->lastEvent);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->maxEvents);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::LST) {
                        $this->eventTypeSkipList = array();
                        $_size792 = 0;
                        $_etype795 = 0;
                        $xfer += $input->readListBegin($_etype795, $_size792);
                        for ($_i796 = 0; $_i796 < $_size792; ++$_i796) {
                            $elem797 = null;
                            $xfer += $input->readString($elem797);
                            $this->eventTypeSkipList []= $elem797;
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
        $xfer += $output->writeStructBegin('NotificationEventRequest');
        if ($this->lastEvent !== null) {
            $xfer += $output->writeFieldBegin('lastEvent', TType::I64, 1);
            $xfer += $output->writeI64($this->lastEvent);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->maxEvents !== null) {
            $xfer += $output->writeFieldBegin('maxEvents', TType::I32, 2);
            $xfer += $output->writeI32($this->maxEvents);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->eventTypeSkipList !== null) {
            if (!is_array($this->eventTypeSkipList)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('eventTypeSkipList', TType::LST, 3);
            $output->writeListBegin(TType::STRING, count($this->eventTypeSkipList));
            foreach ($this->eventTypeSkipList as $iter798) {
                $xfer += $output->writeString($iter798);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
