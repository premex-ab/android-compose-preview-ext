package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SMARTEX device specifications for Android Compose previews.
 *
 * This extension provides SMARTEX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SMARTEX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SMARTEX: Any
  get() = object {
      /** SMARTEX M520 */
      val M520 = "spec:width=480,height=960,unit=px,dpi=240"

      /** SMARTEX M700 */
      val M700 = "spec:width=480,height=996,unit=px,dpi=240"

      /** SMARTEX P600 */
      val P600 = "spec:width=480,height=960,unit=px,dpi=240"

  }
