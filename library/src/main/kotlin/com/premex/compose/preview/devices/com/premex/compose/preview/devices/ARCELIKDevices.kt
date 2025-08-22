package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ARCELIK device specifications for Android Compose previews.
 *
 * This extension provides ARCELIK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ARCELIK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ARCELIK: Any
  get() = object {
      /** DeviceSpec(manufacturer=ARCELIK, code=akropoli, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARCELIK, code=akropoli, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val AKROPOLI = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ARCELIK, code=kunyang, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARCELIK, code=kunyang, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KUNYANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ARCELIK, code=R4, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARCELIK, code=R4, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ARCELIK, code=sinchon, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARCELIK, code=sinchon, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SINCHON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ARCELIK, code=wanchai, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARCELIK, code=wanchai, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val WANCHAI = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
