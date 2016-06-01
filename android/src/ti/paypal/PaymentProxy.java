/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ti.paypal;

import org.appcelerator.kroll.KrollDict;

import org.appcelerator.kroll.KrollProxy;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiC;
import org.appcelerator.titanium.util.Log;
import org.appcelerator.titanium.util.TiConfig;
import org.appcelerator.titanium.util.TiConvert;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.view.TiCompositeLayout;
import org.appcelerator.titanium.view.TiCompositeLayout.LayoutArrangement;
import org.appcelerator.titanium.view.TiUIView;

import android.app.Activity;
import java.util.ArrayList;

import com.paypal.android.sdk.payments.PayPalAuthorization;
import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalFuturePaymentActivity;
import com.paypal.android.sdk.payments.PayPalItem;
import com.paypal.android.sdk.payments.PayPalOAuthScopes;
import com.paypal.android.sdk.payments.PayPalPayment;
import com.paypal.android.sdk.payments.PayPalPaymentDetails;
import com.paypal.android.sdk.payments.PayPalProfileSharingActivity;
import com.paypal.android.sdk.payments.PayPalService;
import com.paypal.android.sdk.payments.PaymentActivity;
import com.paypal.android.sdk.payments.PaymentConfirmation;
import com.paypal.android.sdk.payments.ShippingAddress;

// This proxy can be created by calling Paypal.createExample({message: "hello world"})
@Kroll.proxy(creatableInModule = PaypalModule.class)
public class PaymentProxy extends KrollProxy {
	// Standard Debugging variables
	String currencyCode, shortDescription;
	int intent;

	// Constructor
	public PaymentProxy() {
		super();
	}

	// Handle creation options
	@Override
	public void handleCreationDict(KrollDict options) {
		super.handleCreationDict(options);
		if (options.containsKeyAndNotNull("currencyCode")) {
			currencyCode = TiConvert.toString(options.get("currencyCode"));
		}
		if (options.containsKeyAndNotNull("shortDescription")) {
			shortDescription = TiConvert.toString(options
					.get("shortDescription"));
		}
		if (options.containsKeyAndNotNull("intent")) {
			intent = TiConvert.toInt(options.get("intent"));
		}
		
		/* now importing of configuration and/or paymentitems : */
		if (options.containsKeyAndNotNull("items")) {
			Object items = options.get("items");

		}
		if (options.containsKeyAndNotNull("configuration")) {
			Object configuration = options.get("configurations");

		}

	}

}