package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WINMAX device specifications for Android Compose previews.
 *
 * This extension provides WINMAX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Winmax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Winmax: Any
  get() = object {
      /** WINMAX Tiger_X12 */
      val TIGER_X12 = "spec:width=320,height=385,unit=px,dpi=160"

      /** WINMAX TIGER_X7 */
      val TIGER_X7 = "spec:width=480,height=854,unit=px,dpi=240"

  }
