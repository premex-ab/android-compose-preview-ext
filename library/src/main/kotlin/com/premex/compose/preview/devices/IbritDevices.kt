package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IBRIT device specifications for Android Compose previews.
 *
 * This extension provides IBRIT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ibrit.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ibrit: Any
  get() = object {
      /** IBRIT MAX10-1 */
      val MAX10_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** IBRIT Z2 */
      val Z2 = "spec:width=640,height=1280,unit=px,dpi=320"

  }
