package com.hugai.chatsdk.common.entity.convert;

import com.hugai.chatsdk.common.entity.session.RecordData;
import com.hugai.common.modules.entity.session.model.SessionRecordModel;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-11T16:17:11+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.9 (Eclipse Adoptium)"
)
public class RecordConvertImpl implements RecordConvert {

    @Override
    public RecordData sessionConvertRecord(SessionRecordModel model) {
        if ( model == null ) {
            return null;
        }

        RecordData recordData = new RecordData();

        recordData.setRole( model.getRole() );
        recordData.setContent( model.getContent() );

        return recordData;
    }

    @Override
    public List<RecordData> sessionConvertRecord(List<SessionRecordModel> model) {
        if ( model == null ) {
            return null;
        }

        List<RecordData> list = new ArrayList<RecordData>( model.size() );
        for ( SessionRecordModel sessionRecordModel : model ) {
            list.add( sessionConvertRecord( sessionRecordModel ) );
        }

        return list;
    }
}
