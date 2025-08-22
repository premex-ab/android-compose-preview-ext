package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LG_CNS device specifications for Android Compose previews.
 *
 * This extension provides LG_CNS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LgCns.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LgCns: Any
  get() = object {
      /** LG_CNS LPT_200AR */
      val LPT_200AR = "spec:width=800,height=1280,unit=px,dpi=213"

  }
