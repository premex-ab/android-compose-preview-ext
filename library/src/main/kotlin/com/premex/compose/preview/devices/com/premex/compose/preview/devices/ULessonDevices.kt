package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * uLesson device specifications for Android Compose previews.
 *
 * This extension provides uLesson device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ULesson.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ULesson: Any
  get() = object {
      /** DeviceSpec(manufacturer=uLesson, code=uLesson_Education_Tab, width=800, height=1280,
      dpi=213, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=uLesson,
      code=uLesson_Education_Tab, width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ULESSON_EDUCATION_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=uLesson, code=uLesson_Tab_V2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=uLesson, code=uLesson_Tab_V2,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ULESSON_TAB_V2 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
