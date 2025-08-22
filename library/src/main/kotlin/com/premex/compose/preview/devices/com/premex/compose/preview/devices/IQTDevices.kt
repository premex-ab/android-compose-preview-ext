package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iQT device specifications for Android Compose previews.
 *
 * This extension provides iQT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IQT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IQT: Any
  get() = object {
      /** DeviceSpec(manufacturer=iQT, code=iQT_N8, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQT, code=iQT_N8, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val IQT_N8 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=iQT, code=N3, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQT, code=N3, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val N3 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=iQT, code=N6, width=480, height=996, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iQT, code=N6, width=480,
      height=996, dpi=240, isGoogleDevice=false).code */
      val N6 = "spec:width=480,height=996,unit=px,dpi=240"

  }
