package com.samepage.jaxb.java;

import org.joda.time.LocalDate;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.Date;

public class DateOnlyAdapter extends XmlAdapter<String, Date> {

    @Override
    public Date unmarshal(String xsdDate) throws Exception {

            return new LocalDate(xsdDate).toDate();
    }

    @Override
    public String marshal(Date date) throws Exception {

        return (date != null ? new LocalDate(date).toString() : "");
    }
}