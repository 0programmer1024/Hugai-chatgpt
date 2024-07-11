package com.hugai.common.modules.entity.session.convert;

import com.hugai.common.modules.entity.session.dto.SessionRecordDrawDTO;
import com.hugai.common.modules.entity.session.model.SessionRecordDrawModel;
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
public class SessionRecordDrawConvertImpl implements SessionRecordDrawConvert {

    @Override
    public SessionRecordDrawModel convertToModel(SessionRecordDrawDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SessionRecordDrawModel sessionRecordDrawModel = new SessionRecordDrawModel();

        sessionRecordDrawModel.setId( arg0.getId() );
        sessionRecordDrawModel.setCreateTime( arg0.getCreateTime() );
        sessionRecordDrawModel.setCreateOper( arg0.getCreateOper() );
        sessionRecordDrawModel.setUpdateTime( arg0.getUpdateTime() );
        sessionRecordDrawModel.setUpdateOper( arg0.getUpdateOper() );
        sessionRecordDrawModel.setDelFlag( arg0.getDelFlag() );
        sessionRecordDrawModel.setCreateTime_( arg0.getCreateTime_() );
        sessionRecordDrawModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sessionRecordDrawModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sessionRecordDrawModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sessionRecordDrawModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sessionRecordDrawModel.setPage( arg0.getPage() );
        sessionRecordDrawModel.setSize( arg0.getSize() );
        sessionRecordDrawModel.setSessionInfoDrawId( arg0.getSessionInfoDrawId() );
        sessionRecordDrawModel.setOriginalTaskDrawId( arg0.getOriginalTaskDrawId() );
        sessionRecordDrawModel.setUserId( arg0.getUserId() );
        sessionRecordDrawModel.setTaskId( arg0.getTaskId() );
        sessionRecordDrawModel.setDrawUniqueKey( arg0.getDrawUniqueKey() );
        sessionRecordDrawModel.setDrawApiKey( arg0.getDrawApiKey() );
        sessionRecordDrawModel.setDrawImgUrl( arg0.getDrawImgUrl() );
        sessionRecordDrawModel.setBaseImg( arg0.getBaseImg() );
        sessionRecordDrawModel.setPrompt( arg0.getPrompt() );
        sessionRecordDrawModel.setAssistantImg1( arg0.getAssistantImg1() );
        sessionRecordDrawModel.setAssistantImg2( arg0.getAssistantImg2() );
        sessionRecordDrawModel.setOriginalImgUrl( arg0.getOriginalImgUrl() );
        sessionRecordDrawModel.setMjExtendParam( arg0.getMjExtendParam() );
        sessionRecordDrawModel.setMjImageIndex( arg0.getMjImageIndex() );
        sessionRecordDrawModel.setMjChannelId( arg0.getMjChannelId() );
        sessionRecordDrawModel.setMjGuildId( arg0.getMjGuildId() );
        sessionRecordDrawModel.setMjApplicationId( arg0.getMjApplicationId() );

        return sessionRecordDrawModel;
    }

    @Override
    public List<SessionRecordDrawModel> convertToModel(List<SessionRecordDrawDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SessionRecordDrawModel> list = new ArrayList<SessionRecordDrawModel>( arg0.size() );
        for ( SessionRecordDrawDTO sessionRecordDrawDTO : arg0 ) {
            list.add( convertToModel( sessionRecordDrawDTO ) );
        }

        return list;
    }

    @Override
    public SessionRecordDrawDTO convertToDTO(SessionRecordDrawModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SessionRecordDrawDTO sessionRecordDrawDTO = new SessionRecordDrawDTO();

        sessionRecordDrawDTO.setId( arg0.getId() );
        sessionRecordDrawDTO.setCreateTime( arg0.getCreateTime() );
        sessionRecordDrawDTO.setCreateOper( arg0.getCreateOper() );
        sessionRecordDrawDTO.setUpdateTime( arg0.getUpdateTime() );
        sessionRecordDrawDTO.setUpdateOper( arg0.getUpdateOper() );
        sessionRecordDrawDTO.setDelFlag( arg0.getDelFlag() );
        sessionRecordDrawDTO.setCreateTime_( arg0.getCreateTime_() );
        sessionRecordDrawDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sessionRecordDrawDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sessionRecordDrawDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sessionRecordDrawDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sessionRecordDrawDTO.setPage( arg0.getPage() );
        sessionRecordDrawDTO.setSize( arg0.getSize() );
        sessionRecordDrawDTO.setSessionInfoDrawId( arg0.getSessionInfoDrawId() );
        sessionRecordDrawDTO.setOriginalTaskDrawId( arg0.getOriginalTaskDrawId() );
        sessionRecordDrawDTO.setUserId( arg0.getUserId() );
        sessionRecordDrawDTO.setTaskId( arg0.getTaskId() );
        sessionRecordDrawDTO.setDrawUniqueKey( arg0.getDrawUniqueKey() );
        sessionRecordDrawDTO.setDrawApiKey( arg0.getDrawApiKey() );
        sessionRecordDrawDTO.setDrawImgUrl( arg0.getDrawImgUrl() );
        sessionRecordDrawDTO.setBaseImg( arg0.getBaseImg() );
        sessionRecordDrawDTO.setPrompt( arg0.getPrompt() );
        sessionRecordDrawDTO.setAssistantImg1( arg0.getAssistantImg1() );
        sessionRecordDrawDTO.setAssistantImg2( arg0.getAssistantImg2() );
        sessionRecordDrawDTO.setOriginalImgUrl( arg0.getOriginalImgUrl() );
        sessionRecordDrawDTO.setMjExtendParam( arg0.getMjExtendParam() );
        sessionRecordDrawDTO.setMjImageIndex( arg0.getMjImageIndex() );
        sessionRecordDrawDTO.setMjChannelId( arg0.getMjChannelId() );
        sessionRecordDrawDTO.setMjGuildId( arg0.getMjGuildId() );
        sessionRecordDrawDTO.setMjApplicationId( arg0.getMjApplicationId() );

        return sessionRecordDrawDTO;
    }

    @Override
    public List<SessionRecordDrawDTO> convertToDTO(List<SessionRecordDrawModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SessionRecordDrawDTO> list = new ArrayList<SessionRecordDrawDTO>( arg0.size() );
        for ( SessionRecordDrawModel sessionRecordDrawModel : arg0 ) {
            list.add( convertToDTO( sessionRecordDrawModel ) );
        }

        return list;
    }
}
