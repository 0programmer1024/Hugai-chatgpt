package com.hugai.common.modules.entity.session.convert;

import com.hugai.common.modules.entity.session.dto.SessionRecordDTO;
import com.hugai.common.modules.entity.session.model.SessionRecordModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-11T16:17:08+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.9 (Eclipse Adoptium)"
)
public class SessionRecordConvertImpl implements SessionRecordConvert {

    @Override
    public SessionRecordModel convertToModel(SessionRecordDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SessionRecordModel sessionRecordModel = new SessionRecordModel();

        sessionRecordModel.setId( arg0.getId() );
        sessionRecordModel.setCreateTime( arg0.getCreateTime() );
        sessionRecordModel.setCreateOper( arg0.getCreateOper() );
        sessionRecordModel.setUpdateTime( arg0.getUpdateTime() );
        sessionRecordModel.setUpdateOper( arg0.getUpdateOper() );
        sessionRecordModel.setDelFlag( arg0.getDelFlag() );
        sessionRecordModel.setCreateTime_( arg0.getCreateTime_() );
        sessionRecordModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sessionRecordModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sessionRecordModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sessionRecordModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sessionRecordModel.setPage( arg0.getPage() );
        sessionRecordModel.setSize( arg0.getSize() );
        sessionRecordModel.setUserId( arg0.getUserId() );
        sessionRecordModel.setSessionId( arg0.getSessionId() );
        sessionRecordModel.setDomainUniqueKey( arg0.getDomainUniqueKey() );
        sessionRecordModel.setRole( arg0.getRole() );
        sessionRecordModel.setContent( arg0.getContent() );
        sessionRecordModel.setIfShow( arg0.getIfShow() );
        sessionRecordModel.setIfContext( arg0.getIfContext() );
        sessionRecordModel.setIfDomainTop( arg0.getIfDomainTop() );
        sessionRecordModel.setConsumerToken( arg0.getConsumerToken() );
        sessionRecordModel.setChatModelId( arg0.getChatModelId() );
        sessionRecordModel.setChatModelValue( arg0.getChatModelValue() );

        return sessionRecordModel;
    }

    @Override
    public List<SessionRecordModel> convertToModel(List<SessionRecordDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SessionRecordModel> list = new ArrayList<SessionRecordModel>( arg0.size() );
        for ( SessionRecordDTO sessionRecordDTO : arg0 ) {
            list.add( convertToModel( sessionRecordDTO ) );
        }

        return list;
    }

    @Override
    public SessionRecordDTO convertToDTO(SessionRecordModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SessionRecordDTO sessionRecordDTO = new SessionRecordDTO();

        sessionRecordDTO.setId( arg0.getId() );
        sessionRecordDTO.setCreateTime( arg0.getCreateTime() );
        sessionRecordDTO.setCreateOper( arg0.getCreateOper() );
        sessionRecordDTO.setUpdateTime( arg0.getUpdateTime() );
        sessionRecordDTO.setUpdateOper( arg0.getUpdateOper() );
        sessionRecordDTO.setDelFlag( arg0.getDelFlag() );
        sessionRecordDTO.setCreateTime_( arg0.getCreateTime_() );
        sessionRecordDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sessionRecordDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sessionRecordDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sessionRecordDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sessionRecordDTO.setPage( arg0.getPage() );
        sessionRecordDTO.setSize( arg0.getSize() );
        sessionRecordDTO.setUserId( arg0.getUserId() );
        sessionRecordDTO.setSessionId( arg0.getSessionId() );
        sessionRecordDTO.setDomainUniqueKey( arg0.getDomainUniqueKey() );
        sessionRecordDTO.setRole( arg0.getRole() );
        sessionRecordDTO.setContent( arg0.getContent() );
        sessionRecordDTO.setIfShow( arg0.getIfShow() );
        sessionRecordDTO.setIfContext( arg0.getIfContext() );
        sessionRecordDTO.setIfDomainTop( arg0.getIfDomainTop() );
        sessionRecordDTO.setConsumerToken( arg0.getConsumerToken() );
        sessionRecordDTO.setChatModelId( arg0.getChatModelId() );
        sessionRecordDTO.setChatModelValue( arg0.getChatModelValue() );

        return sessionRecordDTO;
    }

    @Override
    public List<SessionRecordDTO> convertToDTO(List<SessionRecordModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SessionRecordDTO> list = new ArrayList<SessionRecordDTO>( arg0.size() );
        for ( SessionRecordModel sessionRecordModel : arg0 ) {
            list.add( convertToDTO( sessionRecordModel ) );
        }

        return list;
    }
}
