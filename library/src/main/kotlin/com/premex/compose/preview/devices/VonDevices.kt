package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VON device specifications for Android Compose previews.
 *
 * This extension provides VON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Von.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Von: Any
  get() = object {
      /** VON stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

  }
