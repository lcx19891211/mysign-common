package cn.lcxian.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
@TableName("t_bse_Machine")
public class Machine implements Serializable{
	private static final long serialVersionUID = -4364463409388950852L;
	@TableId(type=IdType.AUTO)
	private Integer macid;
	private String macname;
	private String desciption;
	private Integer status;
	private Integer seqid;
}
