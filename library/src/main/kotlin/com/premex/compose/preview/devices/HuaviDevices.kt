package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HUAVI device specifications for Android Compose previews.
 *
 * This extension provides HUAVI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Huavi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Huavi: Any
  get() = object {
      /** HUAVI GOLD_77 */
      val GOLD_77 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** HUAVI KHATARH20PRO */
      val KHATARH20PRO = "spec:width=720,height=1560,unit=px,dpi=320"

  }
