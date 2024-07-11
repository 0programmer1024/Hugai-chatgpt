package com.hugai.common.modules.entity.system.convert;

import com.hugai.common.modules.entity.system.dto.SysLogininforDTO;
import com.hugai.common.modules.entity.system.model.SysLogininforModel;
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
public class SysLogininforConvertImpl implements SysLogininforConvert {

    @Override
    public SysLogininforModel convertToModel(SysLogininforDTO arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysLogininforModel sysLogininforModel = new SysLogininforModel();

        sysLogininforModel.setId( arg0.getId() );
        sysLogininforModel.setCreateTime( arg0.getCreateTime() );
        sysLogininforModel.setCreateOper( arg0.getCreateOper() );
        sysLogininforModel.setUpdateTime( arg0.getUpdateTime() );
        sysLogininforModel.setUpdateOper( arg0.getUpdateOper() );
        sysLogininforModel.setCreateTime_( arg0.getCreateTime_() );
        sysLogininforModel.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysLogininforModel.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysLogininforModel.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysLogininforModel.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysLogininforModel.setPage( arg0.getPage() );
        sysLogininforModel.setSize( arg0.getSize() );
        sysLogininforModel.setDelFlag( arg0.getDelFlag() );
        sysLogininforModel.setUserName( arg0.getUserName() );
        sysLogininforModel.setIpaddr( arg0.getIpaddr() );
        sysLogininforModel.setLoginLocation( arg0.getLoginLocation() );
        sysLogininforModel.setBrowser( arg0.getBrowser() );
        sysLogininforModel.setOs( arg0.getOs() );
        sysLogininforModel.setStatus( arg0.getStatus() );
        sysLogininforModel.setMsg( arg0.getMsg() );
        sysLogininforModel.setLoginTime( arg0.getLoginTime() );
        sysLogininforModel.setLoginType( arg0.getLoginType() );

        return sysLogininforModel;
    }

    @Override
    public List<SysLogininforModel> convertToModel(List<SysLogininforDTO> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysLogininforModel> list = new ArrayList<SysLogininforModel>( arg0.size() );
        for ( SysLogininforDTO sysLogininforDTO : arg0 ) {
            list.add( convertToModel( sysLogininforDTO ) );
        }

        return list;
    }

    @Override
    public SysLogininforDTO convertToDTO(SysLogininforModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysLogininforDTO sysLogininforDTO = new SysLogininforDTO();

        sysLogininforDTO.setId( arg0.getId() );
        sysLogininforDTO.setCreateTime( arg0.getCreateTime() );
        sysLogininforDTO.setCreateOper( arg0.getCreateOper() );
        sysLogininforDTO.setUpdateTime( arg0.getUpdateTime() );
        sysLogininforDTO.setUpdateOper( arg0.getUpdateOper() );
        sysLogininforDTO.setCreateTime_( arg0.getCreateTime_() );
        sysLogininforDTO.setUpdateTime_( arg0.getUpdateTime_() );
        Map<String, Object> map = arg0.getParamExtMap();
        if ( map != null ) {
            sysLogininforDTO.setParamExtMap( new LinkedHashMap<String, Object>( map ) );
        }
        Map<String, String> map1 = arg0.getQueryCondition();
        if ( map1 != null ) {
            sysLogininforDTO.setQueryCondition( new LinkedHashMap<String, String>( map1 ) );
        }
        Map<String, Boolean> map2 = arg0.getSortCondition();
        if ( map2 != null ) {
            sysLogininforDTO.setSortCondition( new LinkedHashMap<String, Boolean>( map2 ) );
        }
        sysLogininforDTO.setPage( arg0.getPage() );
        sysLogininforDTO.setSize( arg0.getSize() );
        sysLogininforDTO.setDelFlag( arg0.getDelFlag() );
        sysLogininforDTO.setUserName( arg0.getUserName() );
        sysLogininforDTO.setIpaddr( arg0.getIpaddr() );
        sysLogininforDTO.setLoginLocation( arg0.getLoginLocation() );
        sysLogininforDTO.setBrowser( arg0.getBrowser() );
        sysLogininforDTO.setOs( arg0.getOs() );
        sysLogininforDTO.setStatus( arg0.getStatus() );
        sysLogininforDTO.setMsg( arg0.getMsg() );
        sysLogininforDTO.setLoginTime( arg0.getLoginTime() );
        sysLogininforDTO.setLoginType( arg0.getLoginType() );

        return sysLogininforDTO;
    }

    @Override
    public List<SysLogininforDTO> convertToDTO(List<SysLogininforModel> arg0) {
        if ( arg0 == null ) {
            return null;
        }

        List<SysLogininforDTO> list = new ArrayList<SysLogininforDTO>( arg0.size() );
        for ( SysLogininforModel sysLogininforModel : arg0 ) {
            list.add( convertToDTO( sysLogininforModel ) );
        }

        return list;
    }
}
