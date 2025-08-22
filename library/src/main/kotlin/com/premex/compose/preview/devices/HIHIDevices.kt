package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HIHI device specifications for Android Compose previews.
 *
 * This extension provides HIHI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HIHI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HIHI: Any
  get() = object {
      /** HIHI HIHI-50KH-TAB-01-EEA */
      val HIHI_50KH_TAB_01_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
