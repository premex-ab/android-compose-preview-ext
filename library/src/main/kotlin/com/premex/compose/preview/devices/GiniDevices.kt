package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Gini device specifications for Android Compose previews.
 *
 * This extension provides Gini device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gini.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gini: Any
  get() = object {
      /** Gini e6_plus */
      val E6_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Gini Gini_s5Pro */
      val GINI_S5PRO = "spec:width=720,height=1280,unit=px,dpi=320"

  }
