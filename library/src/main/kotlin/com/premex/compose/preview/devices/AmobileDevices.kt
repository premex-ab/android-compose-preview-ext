package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Amobile device specifications for Android Compose previews.
 *
 * This extension provides Amobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Amobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Amobile: Any
  get() = object {
      /** Amobile PD602 */
      val PD602 = "spec:width=720,height=1440,unit=px,dpi=280"

  }
