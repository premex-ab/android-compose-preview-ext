package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LbQ device specifications for Android Compose previews.
 *
 * This extension provides LbQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lbq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lbq: Any
  get() = object {
      /** LbQ LbQ_F8v2 */
      val LBQ_F8V2 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
