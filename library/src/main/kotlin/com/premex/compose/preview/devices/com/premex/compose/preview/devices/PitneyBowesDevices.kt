package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PitneyBowes device specifications for Android Compose previews.
 *
 * This extension provides PitneyBowes device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PitneyBowes.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PitneyBowes: Any
  get() = object {
      /** DeviceSpec(manufacturer=PitneyBowes, code=TitanX2, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PitneyBowes, code=TitanX2,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TITANX2 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
