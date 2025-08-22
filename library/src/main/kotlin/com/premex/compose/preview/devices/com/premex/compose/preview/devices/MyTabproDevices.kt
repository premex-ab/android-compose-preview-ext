package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MyTab_pro device specifications for Android Compose previews.
 *
 * This extension provides MyTab_pro device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MyTabpro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MyTabpro: Any
  get() = object {
      /** DeviceSpec(manufacturer=MyTab_pro, code=MyTab_Pro_13, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MyTab_pro, code=MyTab_Pro_13,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val MYTAB_PRO_13 = "spec:width=800,height=1280,unit=px,dpi=200"

  }
