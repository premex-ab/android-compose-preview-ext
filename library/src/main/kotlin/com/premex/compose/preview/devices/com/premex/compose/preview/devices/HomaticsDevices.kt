package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Homatics device specifications for Android Compose previews.
 *
 * This extension provides Homatics device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Homatics.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Homatics: Any
  get() = object {
      /** DeviceSpec(manufacturer=Homatics, code=HND, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Homatics, code=HND, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HND = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Homatics, code=IAD, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Homatics, code=IAD, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IAD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Homatics, code=ICN, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Homatics, code=ICN, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ICN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Homatics, code=MIA, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Homatics, code=MIA, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MIA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Homatics, code=SEI700HMG, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Homatics, code=SEI700HMG,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI700HMG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Homatics, code=YQB, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Homatics, code=YQB, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val YQB = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Homatics, code=YQX, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Homatics, code=YQX, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val YQX = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Homatics, code=YYJ, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Homatics, code=YYJ, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val YYJ = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Homatics, code=YZF, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Homatics, code=YZF, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val YZF = "spec:width=720,height=1280,unit=px,dpi=320"

  }
