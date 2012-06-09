package com.samepage.jaxb.java;

import org.joda.time.DateTime;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.Date;

public class DateAdapter extends XmlAdapter<String, Date> {

    @Override
    public Date unmarshal(String xsdDate) throws Exception {

            return new DateTime(xsdDate).toDate();
    }

    @Override
    public String marshal(Date date) throws Exception {

        return (date != null ? new DateTime(date).toString() : "");
    }
}