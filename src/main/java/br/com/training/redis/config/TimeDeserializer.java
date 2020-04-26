package br.com.training.redis.config;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDeserializer extends JsonDeserializer<Date> {

    private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public Date deserialize(JsonParser p, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {

        String date = p.getText();

        try {
            return format.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}