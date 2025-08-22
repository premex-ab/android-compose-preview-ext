package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AOSKEY device specifications for Android Compose previews.
 *
 * This extension provides AOSKEY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AOSKEY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AOSKEY: Any
  get() = object {
      /** DeviceSpec(manufacturer=AOSKEY, code=F11, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AOSKEY, code=F11, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val F11 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AOSKEY, code=P21, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AOSKEY, code=P21, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val P21 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
