package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Accent device specifications for Android Compose previews.
 *
 * This extension provides Accent device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Accent.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Accent: Any
  get() = object {
      /** Accent Fast17 */
      val FAST17 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Accent FAST7 */
      val FAST7 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** Accent KIDZY70 */
      val KIDZY70 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Accent Speed-X2 */
      val SPEED_X2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Accent Speed-Y3 */
      val SPEED_Y3 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
