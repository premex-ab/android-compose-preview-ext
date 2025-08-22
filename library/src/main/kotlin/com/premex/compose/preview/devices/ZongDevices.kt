package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Zong device specifications for Android Compose previews.
 *
 * This extension provides Zong device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zong.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zong: Any
  get() = object {
      /** Zong Z2 */
      val Z2 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
