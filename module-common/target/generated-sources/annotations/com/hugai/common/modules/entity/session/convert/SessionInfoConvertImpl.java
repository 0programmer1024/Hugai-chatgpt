package com.hugai.common.modules.entity.session.convert;

import com.hugai.common.modules.entity.session.dto.SessionInfoDTO;
import com.hugai.common.modules.entity.session.model.SessionInfoModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-11T16:17:07+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.9 (Eclipse Adoptium)"
)
public class SessionInfoConvertImpl implements SessionInfoConvert {

    @Override
    public SessionInfoModel convertToModel(SessionInfoDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SessionInfoModel sessionInfoModel = new SessionInfoModel();

        sessionInfoModel.setId( arg0.getId() );
        sessionInfoModel.setCreateTime( arg0.getCreateTime() );
        sessionInfoModel.setCreateOper( arg0.getCreateOper() );
        sessionInfoModel.setUpdateTime( arg0.getUpdateTime() );
        sessionInfoModel.setUpdateOper( arg0.getUpdateOper() );
        sessionInfoModel.setDelFlag( arg0.getDelFlag() );
        sessionInfoModel.setCreateTime_( arg0.getCreateTime_() );
        sessionInfoModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sessionInfoModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sessionInfoModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sessionInfoModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sessionInfoModel.setPage( arg0.getPage() );
        sessionInfoModel.setSize( arg0.getSize() );
        sessionInfoModel.setUserId( arg0.getUserId() );
        sessionInfoModel.setType( arg0.getType() );
        sessionInfoModel.setSessionName( arg0.getSessionName() );
        sessionInfoModel.setDomainUniqueKey( arg0.getDomainUniqueKey() );
        sessionInfoModel.setStatus( arg0.getStatus() );
        sessionInfoModel.setAllConsumerToken( arg0.getAllConsumerToken() );
        sessionInfoModel.setChatModelId( arg0.getChatModelId() );

        return sessionInfoModel;
    }

    @Override
    public List<SessionInfoModel> convertToModel(List<SessionInfoDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SessionInfoModel> list = new ArrayList<SessionInfoModel>( arg0.size() );
        for ( SessionInfoDTO sessionInfoDTO : arg0 ) {
            list.add( convertToModel( sessionInfoDTO ) );
        }

        return list;
    }

    @Override
    public SessionInfoDTO convertToDTO(SessionInfoModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SessionInfoDTO sessionInfoDTO = new SessionInfoDTO();

        sessionInfoDTO.setId( arg0.getId() );
        sessionInfoDTO.setCreateTime( arg0.getCreateTime() );
        sessionInfoDTO.setCreateOper( arg0.getCreateOper() );
        sessionInfoDTO.setUpdateTime( arg0.getUpdateTime() );
        sessionInfoDTO.setUpdateOper( arg0.getUpdateOper() );
        sessionInfoDTO.setDelFlag( arg0.getDelFlag() );
        sessionInfoDTO.setCreateTime_( arg0.getCreateTime_() );
        sessionInfoDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sessionInfoDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sessionInfoDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sessionInfoDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sessionInfoDTO.setPage( arg0.getPage() );
        sessionInfoDTO.setSize( arg0.getSize() );
        sessionInfoDTO.setUserId( arg0.getUserId() );
        sessionInfoDTO.setType( arg0.getType() );
        sessionInfoDTO.setSessionName( arg0.getSessionName() );
        sessionInfoDTO.setDomainUniqueKey( arg0.getDomainUniqueKey() );
        sessionInfoDTO.setStatus( arg0.getStatus() );
        sessionInfoDTO.setAllConsumerToken( arg0.getAllConsumerToken() );
        sessionInfoDTO.setChatModelId( arg0.getChatModelId() );

        return sessionInfoDTO;
    }

    @Override
    public List<SessionInfoDTO> convertToDTO(List<SessionInfoModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SessionInfoDTO> list = new ArrayList<SessionInfoDTO>( arg0.size() );
        for ( SessionInfoModel sessionInfoModel : arg0 ) {
            list.add( convertToDTO( sessionInfoModel ) );
        }

        return list;
    }
}
