package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Wings device specifications for Android Compose previews.
 *
 * This extension provides Wings device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wings.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wings: Any
  get() = object {
      /** DeviceSpec(manufacturer=Wings, code=W1, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wings, code=W1, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val W1 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Wings, code=W3, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wings, code=W3, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val W3 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Wings, code=W6, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wings, code=W6, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val W6 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Wings, code=W7, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wings, code=W7, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val W7 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Wings, code=WX, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wings, code=WX, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val WX = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
