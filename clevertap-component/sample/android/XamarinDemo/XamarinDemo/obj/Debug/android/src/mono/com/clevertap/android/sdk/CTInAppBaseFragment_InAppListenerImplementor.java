package mono.com.clevertap.android.sdk;


public class CTInAppBaseFragment_InAppListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.clevertap.android.sdk.CTInAppBaseFragment.InAppListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_inAppNotificationDidClick:(Lcom/clevertap/android/sdk/CTInAppNotification;Landroid/os/Bundle;Ljava/util/HashMap;)V:GetInAppNotificationDidClick_Lcom_clevertap_android_sdk_CTInAppNotification_Landroid_os_Bundle_Ljava_util_HashMap_Handler:Com.Clevertap.Android.Sdk.CTInAppBaseFragment/IInAppListenerInvoker, CleverTap.Bindings.Android\n" +
			"n_inAppNotificationDidDismiss:(Landroid/content/Context;Lcom/clevertap/android/sdk/CTInAppNotification;Landroid/os/Bundle;)V:GetInAppNotificationDidDismiss_Landroid_content_Context_Lcom_clevertap_android_sdk_CTInAppNotification_Landroid_os_Bundle_Handler:Com.Clevertap.Android.Sdk.CTInAppBaseFragment/IInAppListenerInvoker, CleverTap.Bindings.Android\n" +
			"n_inAppNotificationDidShow:(Lcom/clevertap/android/sdk/CTInAppNotification;Landroid/os/Bundle;)V:GetInAppNotificationDidShow_Lcom_clevertap_android_sdk_CTInAppNotification_Landroid_os_Bundle_Handler:Com.Clevertap.Android.Sdk.CTInAppBaseFragment/IInAppListenerInvoker, CleverTap.Bindings.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Clevertap.Android.Sdk.CTInAppBaseFragment+IInAppListenerImplementor, CleverTap.Bindings.Android", CTInAppBaseFragment_InAppListenerImplementor.class, __md_methods);
	}


	public CTInAppBaseFragment_InAppListenerImplementor ()
	{
		super ();
		if (getClass () == CTInAppBaseFragment_InAppListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Clevertap.Android.Sdk.CTInAppBaseFragment+IInAppListenerImplementor, CleverTap.Bindings.Android", "", this, new java.lang.Object[] {  });
	}


	public void inAppNotificationDidClick (com.clevertap.android.sdk.CTInAppNotification p0, android.os.Bundle p1, java.util.HashMap p2)
	{
		n_inAppNotificationDidClick (p0, p1, p2);
	}

	private native void n_inAppNotificationDidClick (com.clevertap.android.sdk.CTInAppNotification p0, android.os.Bundle p1, java.util.HashMap p2);


	public void inAppNotificationDidDismiss (android.content.Context p0, com.clevertap.android.sdk.CTInAppNotification p1, android.os.Bundle p2)
	{
		n_inAppNotificationDidDismiss (p0, p1, p2);
	}

	private native void n_inAppNotificationDidDismiss (android.content.Context p0, com.clevertap.android.sdk.CTInAppNotification p1, android.os.Bundle p2);


	public void inAppNotificationDidShow (com.clevertap.android.sdk.CTInAppNotification p0, android.os.Bundle p1)
	{
		n_inAppNotificationDidShow (p0, p1);
	}

	private native void n_inAppNotificationDidShow (com.clevertap.android.sdk.CTInAppNotification p0, android.os.Bundle p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
