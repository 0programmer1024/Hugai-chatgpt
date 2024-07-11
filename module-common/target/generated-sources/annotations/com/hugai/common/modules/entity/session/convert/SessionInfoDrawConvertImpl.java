package com.hugai.common.modules.entity.session.convert;

import com.hugai.common.modules.entity.session.dto.SessionInfoDrawDTO;
import com.hugai.common.modules.entity.session.model.SessionInfoDrawModel;
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
public class SessionInfoDrawConvertImpl implements SessionInfoDrawConvert {

    @Override
    public SessionInfoDrawModel convertToModel(SessionInfoDrawDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SessionInfoDrawModel sessionInfoDrawModel = new SessionInfoDrawModel();

        sessionInfoDrawModel.setId( arg0.getId() );
        sessionInfoDrawModel.setCreateTime( arg0.getCreateTime() );
        sessionInfoDrawModel.setCreateOper( arg0.getCreateOper() );
        sessionInfoDrawModel.setUpdateTime( arg0.getUpdateTime() );
        sessionInfoDrawModel.setUpdateOper( arg0.getUpdateOper() );
        sessionInfoDrawModel.setDelFlag( arg0.getDelFlag() );
        sessionInfoDrawModel.setCreateTime_( arg0.getCreateTime_() );
        sessionInfoDrawModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sessionInfoDrawModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sessionInfoDrawModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sessionInfoDrawModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sessionInfoDrawModel.setPage( arg0.getPage() );
        sessionInfoDrawModel.setSize( arg0.getSize() );
        sessionInfoDrawModel.setUserId( arg0.getUserId() );
        sessionInfoDrawModel.setPrompt( arg0.getPrompt() );
        sessionInfoDrawModel.setDrawUniqueKey( arg0.getDrawUniqueKey() );
        sessionInfoDrawModel.setDrawApiKey( arg0.getDrawApiKey() );
        sessionInfoDrawModel.setShowImg( arg0.getShowImg() );
        sessionInfoDrawModel.setBaseImg( arg0.getBaseImg() );
        sessionInfoDrawModel.setSdResponseInfo( arg0.getSdResponseInfo() );
        sessionInfoDrawModel.setOriginalImgUrl( arg0.getOriginalImgUrl() );
        sessionInfoDrawModel.setTaskId( arg0.getTaskId() );
        sessionInfoDrawModel.setOriginalTaskDrawId( arg0.getOriginalTaskDrawId() );

        return sessionInfoDrawModel;
    }

    @Override
    public List<SessionInfoDrawModel> convertToModel(List<SessionInfoDrawDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SessionInfoDrawModel> list = new ArrayList<SessionInfoDrawModel>( arg0.size() );
        for ( SessionInfoDrawDTO sessionInfoDrawDTO : arg0 ) {
            list.add( convertToModel( sessionInfoDrawDTO ) );
        }

        return list;
    }

    @Override
    public SessionInfoDrawDTO convertToDTO(SessionInfoDrawModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SessionInfoDrawDTO sessionInfoDrawDTO = new SessionInfoDrawDTO();

        sessionInfoDrawDTO.setId( arg0.getId() );
        sessionInfoDrawDTO.setCreateTime( arg0.getCreateTime() );
        sessionInfoDrawDTO.setCreateOper( arg0.getCreateOper() );
        sessionInfoDrawDTO.setUpdateTime( arg0.getUpdateTime() );
        sessionInfoDrawDTO.setUpdateOper( arg0.getUpdateOper() );
        sessionInfoDrawDTO.setDelFlag( arg0.getDelFlag() );
        sessionInfoDrawDTO.setCreateTime_( arg0.getCreateTime_() );
        sessionInfoDrawDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sessionInfoDrawDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sessionInfoDrawDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sessionInfoDrawDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sessionInfoDrawDTO.setPage( arg0.getPage() );
        sessionInfoDrawDTO.setSize( arg0.getSize() );
        sessionInfoDrawDTO.setUserId( arg0.getUserId() );
        sessionInfoDrawDTO.setPrompt( arg0.getPrompt() );
        sessionInfoDrawDTO.setDrawUniqueKey( arg0.getDrawUniqueKey() );
        sessionInfoDrawDTO.setDrawApiKey( arg0.getDrawApiKey() );
        sessionInfoDrawDTO.setShowImg( arg0.getShowImg() );
        sessionInfoDrawDTO.setBaseImg( arg0.getBaseImg() );
        sessionInfoDrawDTO.setSdResponseInfo( arg0.getSdResponseInfo() );
        sessionInfoDrawDTO.setOriginalImgUrl( arg0.getOriginalImgUrl() );
        sessionInfoDrawDTO.setTaskId( arg0.getTaskId() );
        sessionInfoDrawDTO.setOriginalTaskDrawId( arg0.getOriginalTaskDrawId() );

        return sessionInfoDrawDTO;
    }

    @Override
    public List<SessionInfoDrawDTO> convertToDTO(List<SessionInfoDrawModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SessionInfoDrawDTO> list = new ArrayList<SessionInfoDrawDTO>( arg0.size() );
        for ( SessionInfoDrawModel sessionInfoDrawModel : arg0 ) {
            list.add( convertToDTO( sessionInfoDrawModel ) );
        }

        return list;
    }
}
