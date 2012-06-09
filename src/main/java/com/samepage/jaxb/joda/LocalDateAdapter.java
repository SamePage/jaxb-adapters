package com.samepage.jaxb.joda;

import org.joda.time.LocalDate;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate>{

    @Override
    public LocalDate unmarshal(String xsdDate) throws Exception {
        return new LocalDate(xsdDate);
    }

    @Override
    public String marshal(LocalDate localDate) throws Exception {
        return (localDate != null ? localDate.toString() : "" );
    }
}
