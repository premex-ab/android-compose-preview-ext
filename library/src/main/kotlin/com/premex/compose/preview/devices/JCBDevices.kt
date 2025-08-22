package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JCB device specifications for Android Compose previews.
 *
 * This extension provides JCB device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JCB.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JCB: Any
  get() = object {
      /** JCB JCB_TP231 */
      val JCB_TP231 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
