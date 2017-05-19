package org.cc11001100.jfinal.modle;

import java.io.File;
import java.sql.SQLException;

import org.apache.commons.io.FilenameUtils;
import org.cc11001100.jfinal.modle.base.BaseResume;
import org.cc11001100.jfinal.utils.ConstantRepo;
import org.cc11001100.jfinal.utils.GenUtil;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.IAtom;
import com.jfinal.upload.UploadFile;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Resume extends BaseResume<Resume> {
	
	public static final Resume dao = new Resume().dao();
	
	
	/**
	 * 上传新简历
	 */
	public static void uploadNewResume(UploadFile uploadNewResume, User user){
		
		//将其保存到磁盘上
		File newResumeTempSaveFile=uploadNewResume.getFile();
		String originName=newResumeTempSaveFile.getName();
		String extenstion=FilenameUtils.getExtension(newResumeTempSaveFile.getName());
		String newFileName=new StringBuilder().append(newResumeTempSaveFile.getParent()).append("/").append(GenUtil.id()).append(".").append(extenstion).toString();
		File newResumeFile=new File(newFileName);
		newResumeTempSaveFile.renameTo(newResumeFile);
		
		//将其保存到数据库中，因为同一时间只能有一个，所以要先删除掉之前的那个
		if(user.getResume()!=null){
			dao.deleteById(user.getResume().getId());
			user.setResume(null);
		}
		new Resume().setId(GenUtil.id()).setUserId(user.getId()).setName(originName).setPath(newResumeFile.getName()).save();
		
	}
	
	/**简历所述的用户*/
	private User user;

	public User getUser() {
		if(user==null){
			user=User.dao.findById(getUserId());
		}
		return user;
	}

	public Resume setUser(User user) {
		this.user = user;
		return this;
	}
	
	
	
}