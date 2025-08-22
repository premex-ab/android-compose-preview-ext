package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Letv device specifications for Android Compose previews.
 *
 * This extension provides Letv device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Letv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Letv: Any
  get() = object {
      /** DeviceSpec(manufacturer=Letv, code=DemeterDV, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Letv, code=DemeterDV, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DEMETERDV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Letv, code=DemeterUHD, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Letv, code=DemeterUHD, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DEMETERUHD = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Letv, code=le_s2_ww, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Letv, code=le_s2_ww, width=1080,
      height=1920, dpi=420, isGoogleDevice=false).code */
      val LE_S2_WW = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Letv, code=le_x2, width=1440, height=2560, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Letv, code=le_x2, width=1440,
      height=2560, dpi=560, isGoogleDevice=false).code */
      val LE_X2 = "spec:width=1440,height=2560,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=Letv, code=X3_HK, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Letv, code=X3_HK, width=1080,
      height=1920, dpi=420, isGoogleDevice=false).code */
      val X3_HK = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Letv, code=x600, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Letv, code=x600, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val X600 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
