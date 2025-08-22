package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dany device specifications for Android Compose previews.
 *
 * This extension provides Dany device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dany.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dany: Any
  get() = object {
      /** DeviceSpec(manufacturer=Dany, code=MAXX_05, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dany, code=MAXX_05, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val MAXX_05 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Dany, code=Signature-S8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dany, code=Signature-S8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SIGNATURE_S8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
