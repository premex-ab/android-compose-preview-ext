package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GRUNDIG device specifications for Android Compose previews.
 *
 * This extension provides GRUNDIG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GRUNDIG.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GRUNDIG: Any
  get() = object {
      /** DeviceSpec(manufacturer=GRUNDIG, code=akropoli, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GRUNDIG, code=akropoli, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val AKROPOLI = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GRUNDIG, code=kunyang, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GRUNDIG, code=kunyang, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KUNYANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GRUNDIG, code=R4, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GRUNDIG, code=R4, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GRUNDIG, code=sinchon, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GRUNDIG, code=sinchon, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SINCHON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GRUNDIG, code=wanchai, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GRUNDIG, code=wanchai, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val WANCHAI = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
