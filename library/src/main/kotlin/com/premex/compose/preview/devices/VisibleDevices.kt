package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Visible device specifications for Android Compose previews.
 *
 * This extension provides Visible device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Visible.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Visible: Any
  get() = object {
      /** Visible WTVIS01 */
      val WTVIS01 = "spec:width=720,height=1600,unit=px,dpi=280"

  }
