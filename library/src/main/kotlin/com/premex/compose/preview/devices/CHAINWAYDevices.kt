package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CHAINWAY device specifications for Android Compose previews.
 *
 * This extension provides CHAINWAY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CHAINWAY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CHAINWAY: Any
  get() = object {
      /** CHAINWAY C61P */
      val C61P = "spec:width=480,height=800,unit=px,dpi=240"

      /** CHAINWAY C66 */
      val C66 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** CHAINWAY C71 */
      val C71 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** CHAINWAY C72 */
      val C72 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** CHAINWAY MC50 */
      val MC50 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** CHAINWAY MC62 */
      val MC62 = "spec:width=480,height=800,unit=px,dpi=240"

      /** CHAINWAY MC95 */
      val MC95 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** CHAINWAY P80 */
      val P80 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** CHAINWAY P80_PRO */
      val P80_PRO = "spec:width=1200,height=1920,unit=px,dpi=360"

  }
