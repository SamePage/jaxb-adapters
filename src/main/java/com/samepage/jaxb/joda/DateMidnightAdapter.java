package com.samepage.jaxb.joda;

import org.joda.time.DateMidnight;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateMidnightAdapter extends XmlAdapter<String, DateMidnight> {

    @Override
    public DateMidnight unmarshal(String xsdDate) throws Exception {
        return new DateMidnight(xsdDate);
    }

    @Override
    public String marshal(DateMidnight dateMidnight) throws Exception {
        return (dateMidnight != null ? dateMidnight.toString() : "" );
    }
}