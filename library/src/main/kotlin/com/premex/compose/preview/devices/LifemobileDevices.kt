package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Life_mobile device specifications for Android Compose previews.
 *
 * This extension provides Life_mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lifemobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lifemobile: Any
  get() = object {
      /** Life_mobile LM1 */
      val LM1 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
