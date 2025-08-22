package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iWaylink device specifications for Android Compose previews.
 *
 * This extension provides iWaylink device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IWaylink.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IWaylink: Any
  get() = object {
      /** DeviceSpec(manufacturer=iWaylink, code=MC401_GWL, width=1600, height=2560, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iWaylink, code=MC401_GWL,
      width=1600, height=2560, dpi=160, isGoogleDevice=false).code */
      val MC401_GWL = "spec:width=1600,height=2560,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=iWaylink, code=TC601B_GWL, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iWaylink, code=TC601B_GWL,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val TC601B_GWL = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=iWaylink, code=TC601_GWL, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iWaylink, code=TC601_GWL,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val TC601_GWL = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
