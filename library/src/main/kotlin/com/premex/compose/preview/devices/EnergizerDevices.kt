package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Energizer device specifications for Android Compose previews.
 *
 * This extension provides Energizer device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Energizer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Energizer: Any
  get() = object {
      /** Energizer H620SEU */
      val H620SEU = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Energizer HARDCASEH550S */
      val HARDCASEH550S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Energizer PowerMaxP550S */
      val POWERMAXP550S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Energizer S550 */
      val S550 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Energizer U505S */
      val U505S = "spec:width=480,height=854,unit=px,dpi=200"

      /** Energizer U506S */
      val U506S = "spec:width=480,height=854,unit=px,dpi=200"

      /** Energizer U608S */
      val U608S = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Energizer U652S */
      val U652S = "spec:width=720,height=1600,unit=px,dpi=320"

  }
