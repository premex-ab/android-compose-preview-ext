package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SYMPHONY device specifications for Android Compose previews.
 *
 * This extension provides SYMPHONY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Symphony.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Symphony: Any
  get() = object {
      /** SYMPHONY i68 */
      val I68 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SYMPHONY i74 */
      val I74 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SYMPHONY R40 */
      val R40 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SYMPHONY V128 */
      val V128 = "spec:width=480,height=960,unit=px,dpi=240"

  }
