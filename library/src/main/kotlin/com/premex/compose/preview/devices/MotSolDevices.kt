package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MotSol device specifications for Android Compose previews.
 *
 * This extension provides MotSol device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MotSol.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MotSol: Any
  get() = object {
      /** MotSol mkz_sdm660_64 */
      val MKZ_SDM660_64 = "spec:width=480,height=800,unit=px,dpi=220"

  }
