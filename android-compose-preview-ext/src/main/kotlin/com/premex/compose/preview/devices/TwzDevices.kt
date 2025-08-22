package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TWZ device specifications for Android Compose previews.
 *
 * This extension provides TWZ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Twz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Twz: Any
  get() = object {
      /** TWZ OX_X1 */
      val OX_X1 = "spec:width=240,height=296,unit=px,dpi=120"

      /** TWZ V10 */
      val V10 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** TWZ V6 */
      val V6 = "spec:width=480,height=960,unit=px,dpi=204"

  }
