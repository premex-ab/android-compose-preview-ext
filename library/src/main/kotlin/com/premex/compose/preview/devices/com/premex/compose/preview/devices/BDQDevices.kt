package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BDQ device specifications for Android Compose previews.
 *
 * This extension provides BDQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BDQ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BDQ: Any
  get() = object {
      /** DeviceSpec(manufacturer=BDQ, code=Destiny, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BDQ, code=Destiny, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val DESTINY = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BDQ, code=Destiny-4G, width=600, height=1024, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BDQ, code=Destiny-4G, width=600,
      height=1024, dpi=200, isGoogleDevice=false).code */
      val DESTINY_4G = "spec:width=600,height=1024,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=BDQ, code=Smart_Camon, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BDQ, code=Smart_Camon, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val SMART_CAMON = "spec:width=480,height=800,unit=px,dpi=240"

  }
