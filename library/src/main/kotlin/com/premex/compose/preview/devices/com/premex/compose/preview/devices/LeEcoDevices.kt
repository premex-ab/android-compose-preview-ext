package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LeEco device specifications for Android Compose previews.
 *
 * This extension provides LeEco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LeEco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LeEco: Any
  get() = object {
      /** DeviceSpec(manufacturer=LeEco, code=le_s2, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LeEco, code=le_s2, width=1080,
      height=1920, dpi=420, isGoogleDevice=false).code */
      val LE_S2 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=LeEco, code=le_s2_na, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LeEco, code=le_s2_na, width=1080,
      height=1920, dpi=420, isGoogleDevice=false).code */
      val LE_S2_NA = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=LeEco, code=le_s2_ww, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LeEco, code=le_s2_ww, width=1080,
      height=1920, dpi=420, isGoogleDevice=false).code */
      val LE_S2_WW = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=LeEco, code=le_x2, width=1440, height=2560, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LeEco, code=le_x2, width=1440,
      height=2560, dpi=560, isGoogleDevice=false).code */
      val LE_X2 = "spec:width=1440,height=2560,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=LeEco, code=le_x2_na, width=1440, height=2560, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LeEco, code=le_x2_na, width=1440,
      height=2560, dpi=560, isGoogleDevice=false).code */
      val LE_X2_NA = "spec:width=1440,height=2560,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=LeEco, code=le_zl1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LeEco, code=le_zl1, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val LE_ZL1 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
