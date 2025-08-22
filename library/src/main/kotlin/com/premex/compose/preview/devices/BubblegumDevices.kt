package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Bubblegum device specifications for Android Compose previews.
 *
 * This extension provides Bubblegum device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bubblegum.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bubblegum: Any
  get() = object {
      /** Bubblegum BUB6R-3T */
      val BUB6R_3T = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Bubblegum Junior_7 */
      val JUNIOR_7 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
