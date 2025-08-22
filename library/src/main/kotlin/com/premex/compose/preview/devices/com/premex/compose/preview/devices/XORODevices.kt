package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XORO device specifications for Android Compose previews.
 *
 * This extension provides XORO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XORO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XORO: Any
  get() = object {
      /** DeviceSpec(manufacturer=XORO, code=Megapad_1333_Pro, width=1080, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XORO, code=Megapad_1333_Pro,
      width=1080, height=1920, dpi=213, isGoogleDevice=false).code */
      val MEGAPAD_1333_PRO = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=XORO, code=XORO, width=1080, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XORO, code=XORO, width=1080,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val XORO = "spec:width=1080,height=1920,unit=px,dpi=213"

  }
