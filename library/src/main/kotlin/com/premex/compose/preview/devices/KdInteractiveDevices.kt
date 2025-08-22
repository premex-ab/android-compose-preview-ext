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
 * @Preview(device = Devices.KdInteractive.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KdInteractive: Any
  get() = object {
      /** KD_Interactive Pixi3-7_KD */
      val PIXI3_7_KD = "spec:width=600,height=1024,unit=px,dpi=160"

  }
