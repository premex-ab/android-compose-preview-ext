package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SENWA device specifications for Android Compose previews.
 *
 * This extension provides SENWA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SENWA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SENWA: Any
  get() = object {
      /** SENWA Senwa_LS5018F */
      val SENWA_LS5018F = "spec:width=480,height=960,unit=px,dpi=240"

      /** SENWA Senwa_LS5518H */
      val SENWA_LS5518H = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SENWA Senwa_LS5718 */
      val SENWA_LS5718 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SENWA Senwa_S40 */
      val SENWA_S40 = "spec:width=480,height=800,unit=px,dpi=220"

      /** SENWA Senwa_S471 */
      val SENWA_S471 = "spec:width=480,height=800,unit=px,dpi=240"

  }
