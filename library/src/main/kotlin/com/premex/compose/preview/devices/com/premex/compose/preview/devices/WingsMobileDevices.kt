package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Wings_Mobile device specifications for Android Compose previews.
 *
 * This extension provides Wings_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WingsMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WingsMobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=Wings_Mobile, code=W4, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wings_Mobile, code=W4, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val W4 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Wings_Mobile, code=W7_Q, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wings_Mobile, code=W7_Q,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val W7_Q = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
