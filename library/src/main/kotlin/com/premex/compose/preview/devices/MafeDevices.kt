package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mafe device specifications for Android Compose previews.
 *
 * This extension provides Mafe device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mafe.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mafe: Any
  get() = object {
      /** Mafe V9 */
      val V9 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Mafe Z2 */
      val Z2 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
