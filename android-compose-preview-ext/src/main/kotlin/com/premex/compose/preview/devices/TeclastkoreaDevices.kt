package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TeclastKorea device specifications for Android Compose previews.
 *
 * This extension provides TeclastKorea device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Teclastkorea.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Teclastkorea: Any
  get() = object {
      /** TeclastKorea tPad8 */
      val TPAD8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
