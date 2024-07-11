package com.hugai.common.modules.entity.system.convert;

import com.hugai.common.modules.entity.system.dto.SysAttachmentDTO;
import com.hugai.common.modules.entity.system.model.SysAttachmentModel;
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
public class SysAttachmentConvertImpl implements SysAttachmentConvert {

    @Override
    public SysAttachmentModel convertToModel(SysAttachmentDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysAttachmentModel sysAttachmentModel = new SysAttachmentModel();

        sysAttachmentModel.setId( arg0.getId() );
        sysAttachmentModel.setCreateTime( arg0.getCreateTime() );
        sysAttachmentModel.setCreateOper( arg0.getCreateOper() );
        sysAttachmentModel.setUpdateTime( arg0.getUpdateTime() );
        sysAttachmentModel.setUpdateOper( arg0.getUpdateOper() );
        sysAttachmentModel.setDelFlag( arg0.getDelFlag() );
        sysAttachmentModel.setCreateTime_( arg0.getCreateTime_() );
        sysAttachmentModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysAttachmentModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysAttachmentModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysAttachmentModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysAttachmentModel.setPage( arg0.getPage() );
        sysAttachmentModel.setSize( arg0.getSize() );
        sysAttachmentModel.setBusinessId( arg0.getBusinessId() );
        sysAttachmentModel.setOriginalFileName( arg0.getOriginalFileName() );
        sysAttachmentModel.setFileSize( arg0.getFileSize() );
        sysAttachmentModel.setFileNameMd5( arg0.getFileNameMd5() );
        sysAttachmentModel.setFileAbsolutePath( arg0.getFileAbsolutePath() );
        sysAttachmentModel.setFileSuffix( arg0.getFileSuffix() );

        return sysAttachmentModel;
    }

    @Override
    public List<SysAttachmentModel> convertToModel(List<SysAttachmentDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysAttachmentModel> list = new ArrayList<SysAttachmentModel>( arg0.size() );
        for ( SysAttachmentDTO sysAttachmentDTO : arg0 ) {
            list.add( convertToModel( sysAttachmentDTO ) );
        }

        return list;
    }

    @Override
    public SysAttachmentDTO convertToDTO(SysAttachmentModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysAttachmentDTO sysAttachmentDTO = new SysAttachmentDTO();

        sysAttachmentDTO.setId( arg0.getId() );
        sysAttachmentDTO.setCreateTime( arg0.getCreateTime() );
        sysAttachmentDTO.setCreateOper( arg0.getCreateOper() );
        sysAttachmentDTO.setUpdateTime( arg0.getUpdateTime() );
        sysAttachmentDTO.setUpdateOper( arg0.getUpdateOper() );
        sysAttachmentDTO.setDelFlag( arg0.getDelFlag() );
        sysAttachmentDTO.setCreateTime_( arg0.getCreateTime_() );
        sysAttachmentDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysAttachmentDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysAttachmentDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysAttachmentDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysAttachmentDTO.setPage( arg0.getPage() );
        sysAttachmentDTO.setSize( arg0.getSize() );
        sysAttachmentDTO.setBusinessId( arg0.getBusinessId() );
        sysAttachmentDTO.setOriginalFileName( arg0.getOriginalFileName() );
        sysAttachmentDTO.setFileSize( arg0.getFileSize() );
        sysAttachmentDTO.setFileNameMd5( arg0.getFileNameMd5() );
        sysAttachmentDTO.setFileAbsolutePath( arg0.getFileAbsolutePath() );
        sysAttachmentDTO.setFileSuffix( arg0.getFileSuffix() );

        return sysAttachmentDTO;
    }

    @Override
    public List<SysAttachmentDTO> convertToDTO(List<SysAttachmentModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysAttachmentDTO> list = new ArrayList<SysAttachmentDTO>( arg0.size() );
        for ( SysAttachmentModel sysAttachmentModel : arg0 ) {
            list.add( convertToDTO( sysAttachmentModel ) );
        }

        return list;
    }
}
