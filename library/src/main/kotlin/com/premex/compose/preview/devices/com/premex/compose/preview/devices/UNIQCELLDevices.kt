package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UNIQCELL device specifications for Android Compose previews.
 *
 * This extension provides UNIQCELL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UNIQCELL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UNIQCELL: Any
  get() = object {
      /** DeviceSpec(manufacturer=UNIQCELL, code=UNIQ0122, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNIQCELL, code=UNIQ0122, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val UNIQ0122 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=UNIQCELL, code=UNIQCELL_A4, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNIQCELL, code=UNIQCELL_A4,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val UNIQCELL_A4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=UNIQCELL, code=UNIQCELL_A55, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNIQCELL, code=UNIQCELL_A55,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val UNIQCELL_A55 = "spec:width=480,height=960,unit=px,dpi=213"

  }
