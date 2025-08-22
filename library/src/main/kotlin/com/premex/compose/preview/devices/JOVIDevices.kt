package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JOVI device specifications for Android Compose previews.
 *
 * This extension provides JOVI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JOVI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JOVI: Any
  get() = object {
      /** JOVI V2419B */
      val V2419B = "spec:width=720,height=1608,unit=px,dpi=300"

      /** JOVI V2427B */
      val V2427B = "spec:width=1080,height=2392,unit=px,dpi=440"

      /** JOVI V2434B */
      val V2434B = "spec:width=720,height=1608,unit=px,dpi=300"

      /** JOVI V2440B */
      val V2440B = "spec:width=1080,height=2392,unit=px,dpi=440"

  }
