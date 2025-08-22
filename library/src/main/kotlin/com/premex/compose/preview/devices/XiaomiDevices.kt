package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Xiaomi device specifications for Android Compose previews.
 *
 * This extension provides Xiaomi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Xiaomi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Xiaomi: Any
  get() = object {
      /** Xiaomi Mi 13 */
      val MI_13 = "spec:width=1080,height=2400,unit=px,dpi=414"

      /** Xiaomi Mi 13 Pro */
      val MI_13_PRO = "spec:width=1440,height=3200,unit=px,dpi=522"

  }
