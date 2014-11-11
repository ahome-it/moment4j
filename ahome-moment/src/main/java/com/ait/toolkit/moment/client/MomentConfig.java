/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.moment.client;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class MomentConfig extends JsObject {

	protected MomentConfig(JavaScriptObject peer) {
		jsObj = peer;
	}

	public MomentConfig() {
		jsObj = JsoHelper.createObject();
	}

	public void setSeconds(int value) {
		JsoHelper.setAttribute(jsObj, "seconds", value);
	}

	public void setMinutes(int value) {
		JsoHelper.setAttribute(jsObj, "minutes", value);
	}

	public void setHours(int value) {
		JsoHelper.setAttribute(jsObj, "hours", value);
	}

	public void setDays(int value) {
		JsoHelper.setAttribute(jsObj, "days", value);
	}

	public void setWeeks(int value) {
		JsoHelper.setAttribute(jsObj, "weeks", value);
	}

	public void setMonths(int value) {
		JsoHelper.setAttribute(jsObj, "months", value);
	}

	public void setYears(int value) {
		JsoHelper.setAttribute(jsObj, "years", value);
	}
}
