package com.u.maps;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageAdapter extends PagerAdapter 
{
	Context context;
	private int[] GalImages;
	
	ImageAdapter(Context context, int[] gal)
	{
		this.context = context;
		this.GalImages = gal;
	}
	
	@Override
	public int getCount() 
	{
		return GalImages.length;
	}
	 
	@Override
	public boolean isViewFromObject(View view, Object object) 
	{
		return view == ((ImageView) object);
	}
	 
	@Override
	public Object instantiateItem(ViewGroup container, int position) 
	{
		ImageView imageView = new ImageView(context);
		int padding = context.getResources().getDimensionPixelSize(R.dimen.padding_medium);
		imageView.setPadding(padding, padding, padding, padding);
		imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
		imageView.setImageResource(GalImages[position]);
		((ViewPager) container).addView(imageView, 0);
		return imageView;
	}
 
	@Override
	public void destroyItem(ViewGroup container, int position, Object object) 
	{
		((ViewPager) container).removeView((ImageView) object);
	}
}