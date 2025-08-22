package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KD_Interactive device specifications for Android Compose previews.
 *
 * This extension provides KD_Interactive device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KDInteractive.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KDInteractive: Any
  get() = object {
      /** DeviceSpec(manufacturer=KD_Interactive, code=Pixi3-7_KD, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KD_Interactive, code=Pixi3-7_KD,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PIXI3_7_KD = "spec:width=600,height=1024,unit=px,dpi=160"

  }
