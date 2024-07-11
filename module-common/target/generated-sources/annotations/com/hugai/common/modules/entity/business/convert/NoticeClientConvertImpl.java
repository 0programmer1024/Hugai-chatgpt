package com.hugai.common.modules.entity.business.convert;

import com.hugai.common.modules.entity.business.dto.NoticeClientDTO;
import com.hugai.common.modules.entity.business.model.NoticeClientModel;
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
public class NoticeClientConvertImpl implements NoticeClientConvert {

    @Override
    public NoticeClientModel convertToModel(NoticeClientDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        NoticeClientModel noticeClientModel = new NoticeClientModel();

        noticeClientModel.setId( arg0.getId() );
        noticeClientModel.setCreateTime( arg0.getCreateTime() );
        noticeClientModel.setCreateOper( arg0.getCreateOper() );
        noticeClientModel.setUpdateTime( arg0.getUpdateTime() );
        noticeClientModel.setUpdateOper( arg0.getUpdateOper() );
        noticeClientModel.setDelFlag( arg0.getDelFlag() );
        noticeClientModel.setCreateTime_( arg0.getCreateTime_() );
        noticeClientModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            noticeClientModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            noticeClientModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            noticeClientModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        noticeClientModel.setPage( arg0.getPage() );
        noticeClientModel.setSize( arg0.getSize() );
        noticeClientModel.setTitle( arg0.getTitle() );
        noticeClientModel.setNoticeType( arg0.getNoticeType() );
        noticeClientModel.setContent( arg0.getContent() );
        noticeClientModel.setSort( arg0.getSort() );
        noticeClientModel.setIfShow( arg0.getIfShow() );

        return noticeClientModel;
    }

    @Override
    public List<NoticeClientModel> convertToModel(List<NoticeClientDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<NoticeClientModel> list = new ArrayList<NoticeClientModel>( arg0.size() );
        for ( NoticeClientDTO noticeClientDTO : arg0 ) {
            list.add( convertToModel( noticeClientDTO ) );
        }

        return list;
    }

    @Override
    public NoticeClientDTO convertToDTO(NoticeClientModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        NoticeClientDTO noticeClientDTO = new NoticeClientDTO();

        noticeClientDTO.setId( arg0.getId() );
        noticeClientDTO.setCreateTime( arg0.getCreateTime() );
        noticeClientDTO.setCreateOper( arg0.getCreateOper() );
        noticeClientDTO.setUpdateTime( arg0.getUpdateTime() );
        noticeClientDTO.setUpdateOper( arg0.getUpdateOper() );
        noticeClientDTO.setDelFlag( arg0.getDelFlag() );
        noticeClientDTO.setCreateTime_( arg0.getCreateTime_() );
        noticeClientDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            noticeClientDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            noticeClientDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            noticeClientDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        noticeClientDTO.setPage( arg0.getPage() );
        noticeClientDTO.setSize( arg0.getSize() );
        noticeClientDTO.setTitle( arg0.getTitle() );
        noticeClientDTO.setNoticeType( arg0.getNoticeType() );
        noticeClientDTO.setContent( arg0.getContent() );
        noticeClientDTO.setSort( arg0.getSort() );
        noticeClientDTO.setIfShow( arg0.getIfShow() );

        return noticeClientDTO;
    }

    @Override
    public List<NoticeClientDTO> convertToDTO(List<NoticeClientModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<NoticeClientDTO> list = new ArrayList<NoticeClientDTO>( arg0.size() );
        for ( NoticeClientModel noticeClientModel : arg0 ) {
            list.add( convertToDTO( noticeClientModel ) );
        }

        return list;
    }
}
