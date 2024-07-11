package com.hugai.modules.chat.convert;

import com.hugai.common.modules.entity.draw.vo.openai.OpenaiTxt2ImgRequest;
import com.theokanning.openai.image.CreateImageRequest;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-11T16:30:28+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.9 (Eclipse Adoptium)"
)
public class DrawOpenaiConvertImpl implements DrawOpenaiConvert {

    @Override
    public CreateImageRequest convertApiParam(OpenaiTxt2ImgRequest param) {
        if ( param == null ) {
            return null;
        }

        CreateImageRequest createImageRequest = new CreateImageRequest();

        createImageRequest.setPrompt( param.getPrompt() );
        createImageRequest.setN( param.getN() );
        createImageRequest.setSize( param.getSize() );
        createImageRequest.setResponseFormat( param.getResponseFormat() );
        createImageRequest.setUser( param.getUser() );

        return createImageRequest;
    }
}
