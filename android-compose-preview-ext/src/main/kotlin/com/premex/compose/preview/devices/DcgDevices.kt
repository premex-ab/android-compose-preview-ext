package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DCG device specifications for Android Compose previews.
 *
 * This extension provides DCG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dcg.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dcg: Any
  get() = object {
      /** DCG DCG-N10 */
      val DCG_N10 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
