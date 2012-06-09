package com.samepage.jaxb.joda;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.joda.time.LocalDateTime;

public class LocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime>{

    @Override
    public LocalDateTime unmarshal(String xsdDateTime) throws Exception {
        return new LocalDateTime(xsdDateTime);
    }

    @Override
    public String marshal(LocalDateTime localDateTime) throws Exception {
        return (localDateTime != null ? localDateTime.toString() : "" );
    }

}
