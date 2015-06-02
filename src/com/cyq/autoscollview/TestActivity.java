package com.cyq.autoscollview;

import java.util.ArrayList;
import java.util.List;

import com.ccy.widget.MyBanner;
import com.ccy.widget.ImagePagerAdapter.BannerListener;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class TestActivity extends Activity implements BannerListener{
	private MyBanner myBanner;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);
		myBanner = (MyBanner) findViewById(R.id.banner);
		List<Object>       imageIdList =new ArrayList<Object>();
		int a[]={R.drawable.banner1,R.drawable.banner2,R.drawable.banner3};
		for (int i = 0; i < a.length; i++) {
			
			MyBannerBean bean = new MyBannerBean();
			bean.setImageurl(a[i]);
			imageIdList.add(bean);
		}
		myBanner.setImgData(imageIdList);
	}

	@Override
	public void click(int position,List<Object> imageList) {
		MyBannerBean m= (MyBannerBean) imageList.get(position);
		Toast.makeText(TestActivity.this, "默认Toast样式"+position+"<-->"+m.getImageurl(),
			     Toast.LENGTH_SHORT).show();
	}



}
