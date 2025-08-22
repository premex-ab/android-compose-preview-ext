package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PROTON device specifications for Android Compose previews.
 *
 * This extension provides PROTON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PROTON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PROTON: Any
  get() = object {
      /** DeviceSpec(manufacturer=PROTON, code=bandra, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PROTON, code=bandra, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BANDRA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PROTON, code=capitolhill, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PROTON, code=capitolhill,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val CAPITOLHILL = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PROTON, code=kenton, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PROTON, code=kenton, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KENTON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PROTON, code=keoneae, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PROTON, code=keoneae, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PROTON, code=lasalle, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PROTON, code=lasalle, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

  }
