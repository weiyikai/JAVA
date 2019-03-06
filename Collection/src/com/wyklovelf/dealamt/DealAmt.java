package com.wyklovelf.dealamt;

public class DealAmt {
	public void deal(String key,String count1,String count2) {
		//根据key取到面额值 String value = "1分"
		//判断value字符串中是否有"元","角","分"
		//有"元"则找到"元"的位置,截取开始位置到"元"的字符串转换为BigDecimal数字，在BigDecimal bd = BigDecimal(value).mutiply1
		//有"角"则找到"角"的位置,截取开始位置到"角"的字符串转换为BigDecimal数字，在BigDecimal bd = BigDecimal(value).mutiply1
		//有"分"则找到"分"的位置,截取开始位置到"分"的字符串转换为BigDecimal数字，在BigDecimal bd = BigDecimal(value).mutiply1
		//用BigDecimal sum = bd.mutiply(coun1x1000 + count2)
		//将sum->String然后更新到数据容器即可
		
	}
}
