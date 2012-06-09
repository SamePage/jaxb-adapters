package com.samepage.jaxb.joda;

import org.joda.time.DateTime;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateTimeAdapter extends XmlAdapter<String, DateTime> {

    @Override
    public DateTime unmarshal(String xsdDateTime) throws Exception {
        return new DateTime(xsdDateTime);
    }

    @Override
    public String marshal(DateTime dateTime) throws Exception {
        return (dateTime != null ? dateTime.toString() : "");
    }
}