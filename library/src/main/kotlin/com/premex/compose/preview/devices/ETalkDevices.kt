package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * eTalk device specifications for Android Compose previews.
 *
 * This extension provides eTalk device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ETalk.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ETalk: Any
  get() = object {
      /** eTalk KAZ-N20 */
      val KAZ_N20 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
