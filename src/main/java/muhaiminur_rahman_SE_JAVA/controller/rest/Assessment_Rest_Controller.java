package muhaiminur_rahman_SE_JAVA.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import muhaiminur_rahman_SE_JAVA.doa.Assessment_epository;
import muhaiminur_rahman_SE_JAVA.models.product_info;
import muhaiminur_rahman_SE_JAVA.service.Assesment_service;

@RestController
@RequestMapping("/customer")
public class Assessment_Rest_Controller {
	
	@Autowired
	Assessment_epository rp;
	
	
	
	@RequestMapping("/findall")
    @ResponseBody
	public List<product_info> findall(){
		return rp.findAll();
	}
	
	
	@RequestMapping("/delete")
    @ResponseBody
	public void delete_product(@RequestParam int id) {
		rp.delete(id);
	}
	
	public product_info findoneok(int id) {
		return rp.findOne(id);
	}


}
