package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XITRIX device specifications for Android Compose previews.
 *
 * This extension provides XITRIX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XITRIX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XITRIX: Any
  get() = object {
      /** DeviceSpec(manufacturer=XITRIX, code=stanford, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XITRIX, code=stanford, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=XITRIX, code=zhongshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XITRIX, code=zhongshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
