
package com.gdg.rocky.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.16
 * Tue Jan 02 14:36:07 IST 2018
 * Generated source version: 3.0.16
 */

@XmlRootElement(name = "returnSum", namespace = "http://ws.rocky.gdg.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "returnSum", namespace = "http://ws.rocky.gdg.com/", propOrder = {"arg0", "arg1"})

public class ReturnSum {

    @XmlElement(name = "arg0")
    private int arg0;
    @XmlElement(name = "arg1")
    private int arg1;

    public int getArg0() {
        return this.arg0;
    }

    public void setArg0(int newArg0)  {
        this.arg0 = newArg0;
    }

    public int getArg1() {
        return this.arg1;
    }

    public void setArg1(int newArg1)  {
        this.arg1 = newArg1;
    }

}

