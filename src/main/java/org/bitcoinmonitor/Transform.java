package org.bitcoinmonitor;

import java.io.IOException;

import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


// Phase 3
@Component
public class Transform {
// Phase 3
	@Transformer(  )
	public String transformToCommonFormat(String json) throws JsonMappingException, JsonParseException, IOException{
	ObjectMapper objectMapper = new ObjectMapper();
    
    //convert json string to object
    RawData data = objectMapper.readValue(json, RawData.class);
    return data.toString();
	}
}
