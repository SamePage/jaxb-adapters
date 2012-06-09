package com.samepage.jaxb.joda;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.joda.time.LocalTime;

public class LocalTimeAdapter extends XmlAdapter<String, LocalTime> {

    @Override
    public LocalTime unmarshal(String xsdTime) throws Exception {
        return new LocalTime(xsdTime);
    }

    @Override
    public String marshal(LocalTime localTime) throws Exception {
        return (localTime != null ? localTime.toString() : "" );
    }

}
