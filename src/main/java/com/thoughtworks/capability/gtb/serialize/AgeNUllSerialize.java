package com.thoughtworks.capability.gtb.serialize;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class AgeNUllSerialize extends StdSerializer<Integer> {


    protected AgeNUllSerialize() {
        super(Integer.class);
    }

    @Override
    public void serialize(Integer value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        if (value==null){
            gen.writeNumber(0);
        }
    }
}
