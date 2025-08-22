package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VORTEX device specifications for Android Compose previews.
 *
 * This extension provides VORTEX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VORTEX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VORTEX: Any
  get() = object {
      /** VORTEX BTAB10 */
      val BTAB10 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** VORTEX CM62 */
      val CM62 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** VORTEX PG65 */
      val PG65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** VORTEX SYNQ */
      val SYNQ = "spec:width=480,height=854,unit=px,dpi=240"

      /** VORTEX VortexV20 */
      val VORTEXV20 = "spec:width=480,height=960,unit=px,dpi=240"

      /** VORTEX VORTEX_HD65_Choice */
      val VORTEX_HD65_CHOICE = "spec:width=720,height=1600,unit=px,dpi=320"

  }
